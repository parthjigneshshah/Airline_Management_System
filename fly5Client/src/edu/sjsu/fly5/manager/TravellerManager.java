package edu.sjsu.fly5.manager;

import edu.sjsu.fly5.pojos.Person;
import edu.sjsu.fly5.pojos.Traveller;
import edu.sjsu.fly5.services.TravellerServiceProxy;
import edu.sjsu.fly5.util.Fly5Exception;
import java.rmi.RemoteException;
import java.text.ParseException;
public class TravellerManager {
	
	TravellerServiceProxy proxy= new TravellerServiceProxy();
	
	public boolean 	addTraveller(Person person, Traveller traveller) throws Fly5Exception{
		
	boolean flag = false;
	
	proxy.setEndpoint("http://localhost:8098/fly5/services/TravellerService?wsdl");

	try
	{
		flag = proxy.addTraveller(person, traveller);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return flag;
	}
	
	public int authenticateTraveller(String email,String password) throws Fly5Exception{
	
	boolean flag = false;
	int id = 0;
	proxy.setEndpoint("http://localhost:8098/fly5/services/TravellerService?wsdl");
	
	try
	{
		id = proxy.authenticateTraveller(email, password);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return id;
	}
	
	public Traveller[] listTravellers() throws Fly5Exception, ParseException
	{
		Traveller[] travellerDetails = null;
		
		proxy.setEndpoint("http://localhost:8098/fly5/services/TravellerService?wsdl");
		
		try
		{
			travellerDetails = proxy.listTravellers(); 
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return travellerDetails;
		
	}
	
	public Traveller viewTravellerInfo(long travellerId) throws Fly5Exception
	{
		Traveller traveller = new Traveller();
		
		proxy.setEndpoint("http://localhost:8098/fly5/services/TravellerService?wsdl");
		
		try
		{
			
			traveller = proxy.viewTravellerInfo(travellerId);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return traveller;
	}
	public boolean updateTraveller(Person person , Traveller traveller) throws Fly5Exception
	{
		boolean flag=false;
		
		proxy.setEndpoint("http://localhost:8098/fly5/services/TravellerService?wsdl");
		
		try
		{
		
			flag = proxy.updateTraveller(person, traveller);
			
		}
		catch (Exception e)
		{
			e.getStackTrace();
		}
		return flag;	
	}
	public boolean removeTraveller(long travellerId) throws Fly5Exception
	{
		boolean flag=false;
		
		proxy.setEndpoint("http://localhost:8098/fly5/services/TravellerService?wsdl");
		
		try{
		flag = proxy.removeTraveller(travellerId);
		}
		
		catch(Exception e){
			
			e.getStackTrace();
		}
		return flag;
	}
	}
	


