package edu.sjsu.fly5.services;

public class FlightServiceProxy implements edu.sjsu.fly5.services.FlightService {
  private String _endpoint = null;
  private edu.sjsu.fly5.services.FlightService flightService = null;
  
  public FlightServiceProxy() {
    _initFlightServiceProxy();
  }
  
  public FlightServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFlightServiceProxy();
  }
  
  private void _initFlightServiceProxy() {
    try {
      flightService = (new edu.sjsu.fly5.services.FlightServiceServiceLocator()).getFlightService();
      if (flightService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)flightService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)flightService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (flightService != null)
      ((javax.xml.rpc.Stub)flightService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.sjsu.fly5.services.FlightService getFlightService() {
    if (flightService == null)
      _initFlightServiceProxy();
    return flightService;
  }
  
  public void addFlightDetails(edu.sjsu.fly5.pojos.Flight flight) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception{
    if (flightService == null)
      _initFlightServiceProxy();
    flightService.addFlightDetails(flight);
  }
  
  public edu.sjsu.fly5.pojos.Flight viewFlightDetails(java.lang.String flightId) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception{
    if (flightService == null)
      _initFlightServiceProxy();
    return flightService.viewFlightDetails(flightId);
  }
  
  public void updateFlightDetails(edu.sjsu.fly5.pojos.Flight flight) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception{
    if (flightService == null)
      _initFlightServiceProxy();
    flightService.updateFlightDetails(flight);
  }
  
  public void deleteFlightDetails(java.lang.String flightId) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception{
    if (flightService == null)
      _initFlightServiceProxy();
    flightService.deleteFlightDetails(flightId);
  }
  
  public edu.sjsu.fly5.pojos.TravelerInfo[] getTravellersOnBoard(java.lang.String flightID, java.lang.String departureDate) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception{
    if (flightService == null)
      _initFlightServiceProxy();
    return flightService.getTravellersOnBoard(flightID, departureDate);
  }
  
  public edu.sjsu.fly5.pojos.FlightInstance[] searchFlight(edu.sjsu.fly5.pojos.FlightSearchAttributes searchAttributes) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception{
    if (flightService == null)
      _initFlightServiceProxy();
    return flightService.searchFlight(searchAttributes);
  }
  
  public edu.sjsu.fly5.pojos.Flight[] listFlights() throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception{
    if (flightService == null)
      _initFlightServiceProxy();
    return flightService.listFlights();
  }
  
  
}