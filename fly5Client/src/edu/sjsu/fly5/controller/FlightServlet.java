package edu.sjsu.fly5.controller;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.sjsu.fly5.pojos.Flight;
import edu.sjsu.fly5.services.FlightServiceProxy;
import edu.sjsu.fly5.util.Fly5Exception;
import edu.sjsu.fly5.util.Patterns;

/**
 * Servlet implementation class FlightServlet
 */
public class FlightServlet extends HttpServlet {
	private static final String ZERO_SECS = ":00";
	private static final String ERROR = "error";
	private static final long serialVersionUID = 1L;
	private FlightServiceProxy flightProxy = new FlightServiceProxy();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init()
    {
    	flightProxy.setEndpoint("http://localhost:8080/fly5/services/FlightService");
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		switch(action)
		{
			case "add":
				addFlight(request, response);
				break;
			case "update":
				updateFlight(request,response);
				break;
			case "delete":
				deleteFlight(request,response);
				break;
		}
		request.getRequestDispatcher("flight.jsp").forward(request, response);
	}

	private void deleteFlight(HttpServletRequest request,
			HttpServletResponse response) {
		String flightID = request.getParameter("dflightno");
		try {
			flightProxy.deleteFlightDetails(flightID);
		} catch (Fly5Exception e) {
			request.setAttribute("error", e.getFaultBean().getFaultMessage());
			e.printStackTrace();
		} catch (RemoteException e) {
			request.setAttribute("error", "Remote error.");
			e.printStackTrace();
		}
	}

	private void updateFlight(HttpServletRequest request,
			HttpServletResponse response){

		String source = request.getParameter("esource");
		String destination = request.getParameter("edestination");
		String departureTime = request.getParameter("edeparture");
		String journeyTime = request.getParameter("ejourney");
		String frequency = request.getParameter("efrequency");
		String seats = request.getParameter("eseats");
		String baseFare = request.getParameter("efare");
		String distance = request.getParameter("edistance");
		String crewId = request.getParameter("ecrew");
		Flight flight = getValidFlight(request, response,source,destination,departureTime,journeyTime,frequency,seats,baseFare,distance);
		if(flight != null)
		{
			flight.setFlightID(request.getParameter("eflightno"));
			System.out.println(flight.getFlightID());
			flight.setCrewID(Long.parseLong(crewId));
			try {
				flightProxy.updateFlightDetails(flight);
			} catch (Fly5Exception e) {
				request.setAttribute("error", e.getFaultBean().getFaultMessage());
				e.printStackTrace();
			} catch (RemoteException e) {
				request.setAttribute("error", "Remote error.");
				e.printStackTrace();
			}
		}
	}

	private void addFlight(HttpServletRequest request,
			HttpServletResponse response)
			 {
		
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String departureTime = request.getParameter("departure") + ZERO_SECS;
		String journeyTime = request.getParameter("journey");
		String frequency = request.getParameter("frequency");
		String seats = request.getParameter("seats");
		String baseFare = request.getParameter("fare");
		String distance = request.getParameter("distance");
		String crewId = request.getParameter("crew");
		Flight flight = getValidFlight(request, response,source,destination,departureTime,journeyTime,frequency,seats,baseFare,distance);
		if(flight !=null)
		{
			flight.setCrewID(Long.parseLong(crewId));
			try {
				flightProxy.addFlightDetails(flight);
			} catch (Fly5Exception e) {
				request.setAttribute("error", e.getFaultBean().getFaultMessage());
				e.printStackTrace();
			} catch (RemoteException e) {
				request.setAttribute("error", "Remote error.");
				e.printStackTrace();
			}
		}
	}

	private Flight getValidFlight(HttpServletRequest request,
			HttpServletResponse response, String source, String destination, String departureTime, 
			String journeyTime, String frequency, String seats, String baseFare, String distance){

		boolean flag = validateFlightParameters(source,destination,departureTime,journeyTime,frequency,seats,baseFare,distance,request,response);

		if(flag)
		{
			Flight flight = new Flight();
			//flight.setCrewID(100);
			flight.setBaseFare(Double.parseDouble(baseFare));
			flight.setDepartureTime(departureTime);
			flight.setDestination(destination);
			flight.setDistance(Long.parseLong(distance));
			flight.setFlightStatus("available");
			flight.setNoOfSeats(Integer.parseInt(seats));
			flight.setSource(source);
			flight.setAirline("Fly5");
			flight.setJourneyTime(journeyTime);
			flight.setFrequency(frequency);
			return flight;
		}
		return null;
	}

	private boolean validateFlightParameters(String source, String destination,
			String departureTime, String journeyTime, String frequency, String seats, String baseFare, 
			String distance, HttpServletRequest request, HttpServletResponse response){
		
		Pattern pattern = Pattern.compile(Patterns.STRING_PATTERN);
		Matcher matcher = pattern.matcher(source);
		StringBuilder errorMessage = new StringBuilder("<ul>");
		boolean flag = true;
		
		if(!matcher.find())
		{
			errorMessage.append("<li>");
			errorMessage.append("Invalid Source.");
			errorMessage.append("</li>");
			flag = false;
		}
		matcher = pattern.matcher(destination);
		if(!matcher.find())
		{
			errorMessage.append("<li>");
			errorMessage.append("Invalid Destination.");
			errorMessage.append("</li>");
			flag = false;
		}
		pattern = Pattern.compile(Patterns.TIME_PATTERN);
		matcher = pattern.matcher(departureTime);
		if(!matcher.find())
		{
			errorMessage.append("<li>");
			errorMessage.append("Invalid departure time. Format should be hh:mm");
			errorMessage.append("</li>");
			flag = false;
		}
		matcher = pattern.matcher(journeyTime);
		if(!matcher.find())
		{
			errorMessage.append("<li>");
			errorMessage.append("Invalid journey time. Format should be hh:mm");
			errorMessage.append("</li>");
			flag = false;
		}
		try{
			Integer.parseInt(seats);
			}catch(NumberFormatException e)
			{
				errorMessage.append("<li>");
				errorMessage.append("Seats should be numeric.");
				errorMessage.append("</li>");
				flag = false;
			}
			try{
			Long.parseLong(distance);
			}catch(NumberFormatException e)
			{
				errorMessage.append("<li>");
				errorMessage.append("Distance should be numeric");
				errorMessage.append("</li>");
				flag = false;
			}
			
			try{
			Double.parseDouble(baseFare);
			}catch(NumberFormatException e)
			{
				errorMessage.append("<li>");
				errorMessage.append("Base fare should be numeric");
				errorMessage.append("</li>");
				flag = false;
			}
			
		if(!flag)
		{
			errorMessage.append("</ul>");
			request.setAttribute(ERROR, errorMessage.toString());
		} /*else {
			request.setAttribute(ERROR, null);
		}*/
		return flag;
	}

}
