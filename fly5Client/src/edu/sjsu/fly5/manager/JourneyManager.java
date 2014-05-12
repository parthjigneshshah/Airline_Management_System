package edu.sjsu.fly5.manager;

import java.rmi.RemoteException;

import edu.sjsu.fly5.pojos.Flight;
import edu.sjsu.fly5.pojos.FlightInstance;
import edu.sjsu.fly5.pojos.Journey;
import edu.sjsu.fly5.pojos.PaymentDetails;
import edu.sjsu.fly5.pojos.Person;
import edu.sjsu.fly5.pojos.Traveller;
import edu.sjsu.fly5.services.JourneyService;
import edu.sjsu.fly5.services.JourneyServiceProxy;

public class JourneyManager {

	JourneyServiceProxy journeyServiceProxy = new JourneyServiceProxy();
	
	
		
	public boolean bookJourney(Traveller[] traveller,FlightInstance[] flightInstance,PaymentDetails paymentDetails,Person[] person)
	{
		boolean flag = false;
		journeyServiceProxy.setEndpoint("http://localhost:8080/fly5/services/JourneyService?wsdl");
		
		try 
		{
			flag = journeyServiceProxy.bookJourney(traveller, flightInstance, paymentDetails, person);
		}
		catch (RemoteException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	
	public Journey[] listOfJourneys() throws RemoteException
	{
		Journey[] listOfJourneys=null;
		journeyServiceProxy.setEndpoint("http://localhost:8080/fly5/services/JourneyService?wsdl");
		listOfJourneys=journeyServiceProxy.listAllJourneys();
		return listOfJourneys;
	}
	
		
}
