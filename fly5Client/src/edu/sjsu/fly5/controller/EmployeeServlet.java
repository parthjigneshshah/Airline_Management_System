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

import edu.sjsu.fly5.manager.EmployeeManager;
import edu.sjsu.fly5.pojos.Attribute;
import edu.sjsu.fly5.pojos.Employee;
import edu.sjsu.fly5.pojos.Person;
import edu.sjsu.fly5.util.Patterns;

/**
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends HttpServlet {

	private static final String ERROR = "error";
	private static  int errorCount = 0;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    EmployeeManager employeeManager = new EmployeeManager();
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

String action=request.getParameter("action");
		
		
		if(action.equals("addEmployee"))
		{
		
			String firstName=request.getParameter("firstName");
			String lastName=request.getParameter("lastName");
			String emailAddress=request.getParameter("email");
			String street=request.getParameter("street");
			String city=request.getParameter("city");
			String state=request.getParameter("state");
			String zipCode=request.getParameter("zip");
			String dateOfBirth=request.getParameter("dob");
			
			
				
		Employee employee=new Employee();	
		employee=getValidPerson(request,response,firstName,lastName,emailAddress,street,city,state,zipCode);	
		
		String workDescription=request.getParameter("workDescription");
		String position=request.getParameter("position");
		String crewID=request.getParameter("crew");
		String hireDate=request.getParameter("hireDate");
		
		
		String hireMonth=hireDate.substring(0,hireDate.length()-8);
		String hireDay=hireDate.substring(3,hireDate.length()-5);
		String hireYear=hireDate.substring(6,hireDate.length());
		
		
		String newHireDate=hireYear+"-"+hireMonth+"-"+hireDay;
		
		
		String month=dateOfBirth.substring(0,dateOfBirth.length()-8);
		String day=dateOfBirth.substring(3,dateOfBirth.length()-5);
		String year=dateOfBirth.substring(6,dateOfBirth.length());
		
		
		String newDateOfBirth=year+"-"+month+"-"+day;
		
		Date dob=new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
			dob = format.parse(newDateOfBirth);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar cal= Calendar.getInstance();
		
		cal.setTime(dob);
		
		Date hireDt=new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        try {
			hireDt = format1.parse(newHireDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar hireDatecal= Calendar.getInstance();
		
		hireDatecal.setTime(hireDt);
		
		
		employee.setDateOfBirth(cal);
		employee.setWorkDescription(workDescription);
		employee.setDesignation(position);
		employee.setCrewID(new Long(crewID).longValue());
		employee.setHireDate(hireDatecal);

		boolean flag=false;
		Integer errorCount =(Integer)request.getAttribute("errCount");
		if(errorCount==0)
		{
		flag=employeeManager.addEmployee(employee);
		}
		if(flag==true)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/admin/employee.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("employee.jsp");
			rd.forward(request, response);		}

	}
	

		else if(action.equals("updateEmployeeInfo"))
		{
			String employeeID=request.getParameter("eemployeeNo");
			String efirstName=request.getParameter("efirstName");
			String elastName=request.getParameter("elastName");
			String emailAddress=request.getParameter("eemail");
			String estreet=request.getParameter("estreet");
			String ecity=request.getParameter("ecity");
			String estate=request.getParameter("estate");
			String ezip=request.getParameter("ezip");
			String workDescription=request.getParameter("eworkDescription");
			String designation=request.getParameter("eposition");
			String hireDate=request.getParameter("ehireDate");
			String crewID=request.getParameter("eCrew");
			
			Employee employee=new Employee();	
			employee=getValidPerson(request,response,efirstName,elastName,emailAddress,estreet,ecity,estate,ezip);
			

			String hireMonth=hireDate.substring(0,hireDate.length()-8);
			String hireDay=hireDate.substring(3,hireDate.length()-5);
			String hireYear=hireDate.substring(6,hireDate.length());
			
			
			String newHireDate=hireYear+"-"+hireMonth+"-"+hireDay;
		
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	        Date parsed=new Date();
			try {
				parsed = format.parse(newHireDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Calendar cal=Calendar.getInstance();
			cal.setTime(parsed);
			
			employee.setEmployeeID(new Long(employeeID).longValue());
			employee.setWorkDescription(workDescription);
			employee.setDesignation(designation);
			employee.setHireDate(cal);
			employee.setCrewID(new Long(crewID).longValue());
			
			boolean flag=false;
			Integer errorCount =(Integer)request.getAttribute("errCount");
			
			
			if(errorCount==0)
			{
			flag=employeeManager.updateEmployee(employee);
			}
			if(flag==true)
			{
				RequestDispatcher rd=request.getRequestDispatcher("/admin/employee.jsp");
				rd.forward(request, response);		
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("/admin/employee.jsp");
				rd.forward(request, response);			}
			}
		
		else if(action.equals("serachEmployeeBasedOnAttributes"))
		{
			
			int counter=0;
			Attribute[] attributes=new Attribute[4];
			Attribute attribute1=new Attribute();
			Attribute attribute2=new Attribute();
			Attribute attribute3=new Attribute();
			Attribute attribute4=new Attribute();
			
			
			
			if(!(request.getParameter("employeeno").equals("")))
					{
				String employeeID=request.getParameter("employeeno");
				boolean flag=validateSearchParameter(employeeID, request, response);
				
				attribute1.setAttributeName("employee_id");
				attribute1.setAttributeValue(request.getParameter("employeeno"));
					counter++;
					attributes[0]=attribute1;
					}
			
			
			if(!(request.getParameter("position").equals("")))
			{
		attribute2.setAttributeName("position");
		attribute2.setAttributeValue(request.getParameter("position"));
			counter++;
			for(int i=0;i<attributes.length;i++)
			{
				if(attributes[i]==null)
				{
					attributes[i]=attribute2;
					break;
				}
			}
			}
			if(!(request.getParameter("hireDate").equals("")))
			{
		
				String hireDate = request.getParameter("hireDate");
				String hireMonth=hireDate.substring(0,hireDate.length()-8);
				String hireDay=hireDate.substring(3,hireDate.length()-5);
				String hireYear=hireDate.substring(6,hireDate.length());
				
				
				String newHireDate=hireYear+"-"+hireMonth+"-"+hireDay;
				System.out.println(newHireDate+"The value of third attribute");
		attribute3.setAttributeName("hire_date");
		attribute3.setAttributeValue(newHireDate);
			counter++;
			for(int i=0;i<attributes.length;i++)
			{
				if(attributes[i]==null)
				{
					attributes[i]=attribute3;
					break;
				}
			}
			}
			
			if(!(request.getParameter("crew").equals("")))
			{
		attribute4.setAttributeName("crew_id");
		attribute4.setAttributeValue(request.getParameter("crew"));
			counter++;
			for(int i=0;i<attributes.length;i++)
			{
				if(attributes[i]==null)
				{
					attributes[i]=attribute4;
					break;
				}
			}
			}
			
			
			Attribute attributesArray[]=new Attribute[counter];
			
			for(int i=0;i<attributesArray.length;i++)
			{
				attributesArray[i]=attributes[i];
			}
			
			Employee[] listOfEmployees=null;

			if(errorCount==0)
			{
					System.out.println("In no error");
					
			listOfEmployees=employeeManager.listEmployeesBasedOnAttributes(attributesArray);
			RequestDispatcher rd=request.getRequestDispatcher("/admin/employee-search.jsp");
			request.setAttribute("listOfEmployees", listOfEmployees);
			rd.forward(request, response);
			
			
			}			
			
			else
			{
			
				RequestDispatcher rd=request.getRequestDispatcher("/admin/employee-search.jsp");
				request.setAttribute("listOfEmployees", listOfEmployees);
				rd.forward(request, response);
				
			}

			
			
			
		}
		
		else if(action.equals("deleteEmployeeInfo"))
		{
			String employeeID=request.getParameter("demployeeno");
			boolean flag=false;
			flag=employeeManager.removeEmployee(new Long(employeeID).longValue());
			
			if(flag==true)
			{
				response.sendRedirect(request.getContextPath()+"/admin/employee.jsp");
			}
			else
			{
				System.out.println("Not Deleted Successfully.");
			}
			
		}
	
	}

	private Employee getValidPerson(HttpServletRequest request,HttpServletResponse response,String firstName,String lastName,String emailAddress,String address,String city,String state,String zipcode)throws ServletException, IOException {
		boolean flag = validatePersonParameter(firstName,lastName,emailAddress,address,city,state,zipcode,request,response);
		Employee employee =new Employee();
		if(flag){
				
			employee.setFirstName(firstName);
			employee.setLastName(lastName);
			employee.setEmailAddress(emailAddress);
			employee.setAddress(address);
			employee.setCity(city);
			employee.setState(state);
			 long zip = Long.parseLong(zipcode);
			 employee.setZipcode(zip);
			 
			return employee;
		}
		return employee;
		
	}
	
	private boolean validatePersonParameter(String firstName,String lastName,String emailAddress,String address,String city,String state,String zipcode,HttpServletRequest request,
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
			errorCount++;
		}
		
		matcher = pattern.matcher(lastName);
		if(!matcher.find())
		{
			errorMessage.append("<li>");
			errorMessage.append("Invalid LastName.");
			errorMessage.append("</li>");
			flag = false;
			errorCount++;
		}
		
		
		matcher = pattern.matcher(city);
		if(!matcher.find())
		{
			errorMessage.append("<li>");
			errorMessage.append("Invalid city name.");
			errorMessage.append("</li>");
			flag = false;
			errorCount++;
		}
		matcher = pattern.matcher(state);
		if(!matcher.find())
		{
			errorMessage.append("<li>");
			errorMessage.append("Invalid State.");
			errorMessage.append("</li>");
			flag = false;
			errorCount++;
		}
		
		pattern = Pattern.compile(Patterns.STREET_PATTERN);
		matcher = pattern.matcher(address);
		if(!matcher.find())
		{
			errorMessage.append("<li>");
			errorMessage.append("Invalid StreetName.");
			errorMessage.append("</li>");
			flag = false;
			errorCount++;
		}
		
		pattern = Pattern.compile(Patterns.EMAIL_PATTERN);
		matcher = pattern.matcher(emailAddress);
		 if(!matcher.find())
			{
				errorMessage.append("<li>");
				errorMessage.append("Invalid Email Address.");
				errorMessage.append("</li>");
				flag = false;
				errorCount++;
			}
		 
		 pattern = Pattern.compile(Patterns.INTEGER_PATTERN);
		 matcher = pattern.matcher(zipcode);
		 if(!matcher.find())
			{
				errorMessage.append("<li>");
				errorMessage.append("Invalid ZipCode.");
				errorMessage.append("</li>");
				flag = false;
				errorCount++;
			}
		 if(!flag)
			{
				errorMessage.append("</ul>");
				request.setAttribute(ERROR, errorMessage.toString());}
		 		request.setAttribute("errCount",errorCount);
		 System.out.println(flag);
		 return flag;
	}
	
	private boolean validateSearchParameter(String employeeID,HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		boolean flag = true;
		
		Pattern pattern = Pattern.compile(Patterns.STRING_PATTERN);
		Matcher matcher = pattern.matcher(employeeID);
		StringBuilder errorMessage = new StringBuilder("<ul>");
		
		 
		 pattern = Pattern.compile(Patterns.INTEGER_PATTERN);
		 matcher = pattern.matcher(employeeID);
		 if(!matcher.find())
			{
				errorMessage.append("<li>");
				errorMessage.append("Invalid EmployeeID.");
				errorMessage.append("</li>");
				flag = false;
				errorCount++;
			}
		 if(!flag)
			{
				errorMessage.append("</ul>");
				request.setAttribute(ERROR, errorMessage.toString());}
		 		request.setAttribute("errCount",errorCount);
		 System.out.println(flag);
		 return flag;
	}

	
	
	
	
	
	
}
