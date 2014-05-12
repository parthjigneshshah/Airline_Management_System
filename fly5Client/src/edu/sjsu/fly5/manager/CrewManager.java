package edu.sjsu.fly5.manager;

import java.rmi.RemoteException;

import edu.sjsu.fly5.pojos.Crew;
import edu.sjsu.fly5.pojos.Employee;
import edu.sjsu.fly5.services.CrewServiceProxy;
import edu.sjsu.fly5.util.Fly5Exception;

public class CrewManager
{
	CrewServiceProxy proxy = new CrewServiceProxy();
	
	public Crew[] listOfCrews() throws Fly5Exception, RemoteException
	{
		Crew[] listOfCrews=null;
		proxy.setEndpoint("http://localhost:98/fly5/services/CrewService?wsdl");
		listOfCrews=proxy.listcrews();
		return listOfCrews;
	}
	
	
	
}
