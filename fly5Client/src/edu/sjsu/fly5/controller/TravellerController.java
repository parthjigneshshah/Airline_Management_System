package edu.sjsu.fly5.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import edu.sjsu.fly5.manager.TravellerManager;
import edu.sjsu.fly5.pojos.Person;
import edu.sjsu.fly5.pojos.Traveller;
import edu.sjsu.fly5.util.Patterns;

/**
 * Servlet implementation class TravellerController
 */
public class TravellerController extends HttpServlet {
	private static final String ERROR = "error";
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TravellerController() {
        super();
        // TODO Auto-generated constructor stub
    }
TravellerManager travellerManager=new TravellerManager();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		String action = request.getParameter("action");
		System.out.println(action);
		boolean flag = false;
		String dcustomerno = request.getParameter("dcustomerno");
		//System.out.println(dcustomerno);
		
		if(action.equals("delete")){
			
			flag = travellerManager.removeTraveller(Long.parseLong(dcustomerno));
			if(flag == true){
				response.sendRedirect(request.getContextPath()+"/admin/customer.jsp");
			}
		}
		
		if(action.equals("add")){
			Traveller traveller = new Traveller();
			Person person = new Person();
			String firstName = request.getParameter("fname");
			String lastName = request.getParameter("lname");
			String dateOfBirth = request.getParameter("dob");
			String emailAddress = request.getParameter("email");
			String password = request.getParameter("password");
			String address = request.getParameter("street");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			String zipcode = request.getParameter("zip");
			String nationality = request.getParameter("nationality");
			String passportNumber = request.getParameter("passportNumber");
			
			String newMonth=dateOfBirth.substring(0,dateOfBirth.length()-8);
			String newDay=dateOfBirth.substring(3,dateOfBirth.length()-5);
			String newYear=dateOfBirth.substring(6,dateOfBirth.length());
			
			String newDate=newYear+"-"+newMonth+"-"+newDay;
			
			
			
			
			
			java.util.Date date = null;
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			 try{
			   date = formatter.parse(newDate);
			  	}
			 catch(ParseException ex)
			 {ex.getStackTrace();}
			
			 Calendar cal=Calendar.getInstance();
			 cal.setTime(date);
		 System.out.println(cal);
		 person = getValidPerson(request,response,firstName,lastName,cal,emailAddress,password,address,city,state,zipcode);
		traveller = getValidTraveller(request,response,nationality,passportNumber);
			/*person.setFirstName(firstName);
			person.setLastName(lastName);
			person.setDateOfBirth(cal);
			person.setEmailAddress(emailAddress);
			person.setPassword(password);
			person.setAddress(address);
			person.setCity(city);
			person.setState(state);
			person.setZipcode(zip);*/
			
			traveller.setNationality("notSpecified");
			traveller.setPassportNumber("notSpecified");
			
			flag = travellerManager.addTraveller(person, traveller);
			
			if (flag == true){
				
				RequestDispatcher rd = request.getRequestDispatcher("/signin.jsp");
				rd.forward(request, response);
			}
			else{
				 
				 String message = "Already have account with the provided email address";
				 request.setAttribute("massege", message);
				 RequestDispatcher rd = request.getRequestDispatcher("/signup.jsp");
				rd.forward(request, response);
			}
		}
		
		if(action.equals("Traveller-signin.do")){
			
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			System.out.println(email);
			System.out.println(password);
			int id = 0;
			
			id = travellerManager.authenticateTraveller(email, password);
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			session.setAttribute("id", id);
			if(id > 0){
				
				System.out.println(id);
				//RequestDispatcher rd = request.getRequestDispatcher("/user/profile.jsp");
				request.setAttribute("userID", String.valueOf(id));
				session.setAttribute("userID",String.valueOf(id));
				System.out.println(id);
				//rd.forward(request, response);
				response.sendRedirect(request.getContextPath()+"/user/profile.jsp");
				
			}
			else{
				String massege = "incorrect Email or Password.";
				request.setAttribute("massege", massege);
				RequestDispatcher rd = request.getRequestDispatcher("/signin.jsp");
				rd.forward(request, response);
			}
			
		}
		
		if(action.equals("Traveller-editProfile.do")){
			System.out.println("in Traveller-editProfile.do");
			 flag = false;
			 Traveller traveller = new Traveller();
			 Person person = new Person();
			 String firstName = request.getParameter("fn");
			 String lastName = request.getParameter("ln");
			 String dateOfBirth = request.getParameter("dob");
			 String passportNumber = request.getParameter("pspt");
			 System.out.println("passport: "+passportNumber);
			 String nationality = request.getParameter("ntly");
			 System.out.println("nationality: "+nationality);
			 String email = request.getParameter("email");
			 System.out.println("Date of birth jsp:"+ dateOfBirth);
			 System.out.println("email in servlet"+email);
			 
			 	String newMonth=dateOfBirth.substring(0,dateOfBirth.length()-8);
				String newDay=dateOfBirth.substring(3,dateOfBirth.length()-5);
				String newYear=dateOfBirth.substring(6,dateOfBirth.length());
				
				String newDate=newYear+"-"+newMonth+"-"+newDay;
			 
				System.out.println(newDate);
			 java.util.Date date = null ;
			 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			 try{
			   date = formatter.parse(newDate);
			  	}
			 catch(ParseException ex)
			 {ex.getStackTrace();}
			 Calendar cal=Calendar.getInstance();
			 cal.setTime(date);
			 
			 java.sql.Date sqlDate=new java.sql.Date(date.getTime());
			
			 System.out.println("Date of birth :"+cal);
			 boolean validate = false;
			
			 
			 String emailAddress = request.getParameter("email");
			String password = request.getParameter("password");
			String address = request.getParameter("state");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			String zipcode = request.getParameter("zip") ;
			person = getValidPerson(request,response,firstName,lastName,cal,emailAddress,password,address,city,state,zipcode);
			traveller = getValidTraveller(request, response, nationality, passportNumber);
			/*person.setFirstName(firstName);
			 person.setLastName(lastName);
			 person.setDateOfBirth(cal);
			 person.setEmailAddress(email);
			 person.setAddress(request.getParameter("street"));
			 person.setCity(request.getParameter("city"));
			 person.setPassword(request.getParameter("password"));
			 person.setState(request.getParameter("state"));
			 person.setZipcode(new Integer(request.getParameter("zip")).intValue());
			 traveller.setPassportNumber(passportNumber);
			 traveller.setNationality(nationality);*/
		
			 flag = travellerManager.updateTraveller(person, traveller);	
			 
			 if(flag == true){
				 HttpSession session = request.getSession();
				int id = new Integer((int) session.getAttribute("id")).intValue();
				request.setAttribute("userID", String.valueOf(id));
				session.setAttribute("userID",String.valueOf(id));
				System.out.println(id);
				RequestDispatcher rd = request.getRequestDispatcher("/user/profile.jsp");
				rd.forward(request, response);
				
			 }
			 else{
				 RequestDispatcher rd = request.getRequestDispatcher("/user/profile.jsp");
					rd.forward(request, response);
			 }
		}


	
	}
	
	private Person getValidPerson(HttpServletRequest request,
			HttpServletResponse response,String firstName,String lastName,Calendar cal,String emailAddress,String password,String address,String city,String state,String zipcode)throws ServletException, IOException {
		System.out.println("in getValidPerson");
		boolean flag = validatePersonParameter(firstName,lastName,emailAddress,password,address,city,state,zipcode,request,response);
		
		if(flag){
			Person person =new Person();	
			person.setFirstName(firstName);
			 person.setLastName(lastName);
			 person.setDateOfBirth(cal);
			 person.setEmailAddress(emailAddress);
			 person.setAddress(address);
			 person.setCity(city);
			 person.setPassword(password);
			 person.setState(state);
			 long zip = Long.parseLong(zipcode);
			 person.setZipcode(zip);
			 
			return person;
		}
		return null;
		
	}
	
	private Traveller getValidTraveller(HttpServletRequest request,
			HttpServletResponse response,String nationality,String passportNumber){
		boolean flag = validateTravellerParameter(request,response,nationality,passportNumber);
		System.out.println("flag in travller validate:"+flag);
		
		if(flag){
			Traveller traveller =new Traveller();	
			traveller.setNationality(nationality);
			System.out.println(nationality);
			traveller.setPassportNumber(passportNumber);
		return traveller;
		}
		return null;
	}
	
	private boolean validatePersonParameter(String firstName,String lastName,String emailAddress,String password,String address,String city,String state,String zipcode,HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("validatePersonParameter");
		boolean flag = true;
		
		Pattern pattern = Pattern.compile(Patterns.STRING_PATTERN);
		Matcher matcher = pattern.matcher(firstName);
		StringBuilder errorMessage = new StringBuilder("<ul>");
		
		
		if(!matcher.find())
		{
			errorMessage.append("<li>");
			errorMessage.append("Invalid firstName.");
			errorMessage.append("</li>");
			flag = false;
		}
		
		matcher = pattern.matcher(lastName);
		if(!matcher.find())
		{
			errorMessage.append("<li>");
			errorMessage.append("Invalid LastName.");
			errorMessage.append("</li>");
			flag = false;
		}
		
		
		matcher = pattern.matcher(city);
		if(!matcher.find())
		{
			errorMessage.append("<li>");
			errorMessage.append("Invalid city name.");
			errorMessage.append("</li>");
			flag = false;
		}
		matcher = pattern.matcher(state);
		if(!matcher.find())
		{
			errorMessage.append("<li>");
			errorMessage.append("Invalid State.");
			errorMessage.append("</li>");
			flag = false;
		}
		
		pattern = Pattern.compile(Patterns.STREET_PATTERN);
		matcher = pattern.matcher(address);
		if(!matcher.find())
		{
			errorMessage.append("<li>");
			errorMessage.append("Invalid StreetName.");
			errorMessage.append("</li>");
			flag = false;
		}
		
		pattern = Pattern.compile(Patterns.EMAIL_PATTERN);
		matcher = pattern.matcher(emailAddress);
		 if(!matcher.find())
			{
				errorMessage.append("<li>");
				errorMessage.append("Invalid Email Address.");
				errorMessage.append("</li>");
				flag = false;
			}
		 
		 pattern = Pattern.compile(Patterns.INTEGER_PATTERN);
		 matcher = pattern.matcher(zipcode);
		 if(!matcher.find())
			{
				errorMessage.append("<li>");
				errorMessage.append("Invalid ZipCode.");
				errorMessage.append("</li>");
				flag = false;
			}
		 if(!flag)
			{
				errorMessage.append("</ul>");
				request.setAttribute(ERROR, errorMessage.toString());}
		
		 System.out.println(flag);
		 return flag;
	}
	private boolean validateTravellerParameter(HttpServletRequest request,
			HttpServletResponse response,String nationality,String passportNumber){
		System.out.println("validateTravellerParameter");
		boolean flag = true;
		
		Pattern pattern = Pattern.compile(Patterns.STRING_PATTERN);
		Matcher matcher = pattern.matcher(nationality);
		StringBuilder errorMessage = new StringBuilder("<ul>");
		
		
		if(!matcher.find())
		{
			errorMessage.append("<li>");
			errorMessage.append("Invalid nationality.");
			errorMessage.append("</li>");
			flag = false;
		}
		
		pattern = Pattern.compile(Patterns.PASSPORT_PATTERN);
		matcher = pattern.matcher(passportNumber);
		if(!matcher.find())
		{
			errorMessage.append("<li>");
			errorMessage.append("Invalid passportNumber.");
			errorMessage.append("</li>");
			flag = false;
		}
		if(!flag)
		{
			errorMessage.append("</ul>");
			request.setAttribute(ERROR, errorMessage.toString());}
	
	 System.out.println(flag);
	 return flag;
	}
	
}



