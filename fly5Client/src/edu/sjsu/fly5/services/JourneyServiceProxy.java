package edu.sjsu.fly5.services;

public class JourneyServiceProxy implements edu.sjsu.fly5.services.JourneyService {
  private String _endpoint = null;
  private edu.sjsu.fly5.services.JourneyService journeyService = null;
  
  public JourneyServiceProxy() {
    _initJourneyServiceProxy();
  }
  
  public JourneyServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initJourneyServiceProxy();
  }
  
  private void _initJourneyServiceProxy() {
    try {
      journeyService = (new edu.sjsu.fly5.services.JourneyServiceServiceLocator()).getJourneyService();
      if (journeyService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)journeyService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)journeyService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (journeyService != null)
      ((javax.xml.rpc.Stub)journeyService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.sjsu.fly5.services.JourneyService getJourneyService() {
    if (journeyService == null)
      _initJourneyServiceProxy();
    return journeyService;
  }
  
  public edu.sjsu.fly5.pojos.Journey[] listAllJourneys() throws java.rmi.RemoteException{
    if (journeyService == null)
      _initJourneyServiceProxy();
    return journeyService.listAllJourneys();
  }
  
  public boolean rescheduleJourney(java.lang.String bookingId) throws java.rmi.RemoteException{
    if (journeyService == null)
      _initJourneyServiceProxy();
    return journeyService.rescheduleJourney(bookingId);
  }
  
  public edu.sjsu.fly5.pojos.Journey generateItinerary(long bookingReferenceNo, java.lang.String lastName) throws java.rmi.RemoteException{
    if (journeyService == null)
      _initJourneyServiceProxy();
    return journeyService.generateItinerary(bookingReferenceNo, lastName);
  }
  
  public boolean bookJourney(edu.sjsu.fly5.pojos.Traveller traveller, edu.sjsu.fly5.pojos.Flight flight, edu.sjsu.fly5.pojos.PaymentDetails paymentDetails) throws java.rmi.RemoteException{
    if (journeyService == null)
      _initJourneyServiceProxy();
    return journeyService.bookJourney(traveller, flight, paymentDetails);
  }
  
  public boolean cancelJourney(java.lang.String bookingId) throws java.rmi.RemoteException{
    if (journeyService == null)
      _initJourneyServiceProxy();
    return journeyService.cancelJourney(bookingId);
  }
  
  
}