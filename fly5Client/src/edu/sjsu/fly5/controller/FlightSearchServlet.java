package edu.sjsu.fly5.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.Date;

import edu.sjsu.fly5.pojos.FlightInstance;
import edu.sjsu.fly5.pojos.FlightSearchAttributes;
import edu.sjsu.fly5.services.FlightServiceProxy;

/**
 * Servlet implementation class FlightSearchServlet
 */
public class FlightSearchServlet extends HttpServlet {
	private static final String DATE_SEPARATOR = "-";

	private static final long serialVersionUID = 1L;
	
	private FlightServiceProxy flightProxy = new FlightServiceProxy();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightSearchServlet() {
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
		// TODO Auto-generated method stub
		
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String departureDate = request.getParameter("departureDate");
		String[] departureDateArray = departureDate.split("/");
		String month = departureDateArray[0];
		String day = departureDateArray[1];
		String year = departureDateArray[2];
		
		String formattedDepartureDate = year + DATE_SEPARATOR + month + DATE_SEPARATOR + day;
		//System.out.println(formattedDepartureDate);
		String travelClass = request.getParameter("class");
		int adults = Integer.parseInt(request.getParameter("adult"));
		int children = Integer.parseInt(request.getParameter("child"));
		int infants = Integer.parseInt(request.getParameter("infant"));
		
		FlightSearchAttributes fsa = new FlightSearchAttributes();
		fsa.setAdults(adults);
		fsa.setChildren(children);
		fsa.setInfants(infants);
		fsa.setTravelClass(travelClass.toLowerCase());
		fsa.setDepartureDate(formattedDepartureDate);
		fsa.setSource(source);
		fsa.setDestination(destination);
		
	    FlightInstance[] searchResults = flightProxy.searchFlight(fsa);
	    
	    if (searchResults.length > 0){
	    	HttpSession session = request.getSession();
	    	session.setAttribute("adults", fsa.getAdults());
	    	session.setAttribute("children", fsa.getChildren());
	    	session.setAttribute("infants", fsa.getInfants());
	    	session.setAttribute("searchResults", searchResults);
	    }
	    request.setAttribute("search-results", searchResults);
	    request.getRequestDispatcher("search-results.jsp").forward(request, response);
	}

}
