package edu.sjsu.fly5.services;

public class TravellerServiceProxy implements edu.sjsu.fly5.services.TravellerService {
  private String _endpoint = null;
  private edu.sjsu.fly5.services.TravellerService travellerService = null;
  
  public TravellerServiceProxy() {
    _initTravellerServiceProxy();
  }
  
  public TravellerServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initTravellerServiceProxy();
  }
  
  private void _initTravellerServiceProxy() {
    try {
      travellerService = (new edu.sjsu.fly5.services.TravellerServiceServiceLocator()).getTravellerService();
      if (travellerService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)travellerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)travellerService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (travellerService != null)
      ((javax.xml.rpc.Stub)travellerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.sjsu.fly5.services.TravellerService getTravellerService() {
    if (travellerService == null)
      _initTravellerServiceProxy();
    return travellerService;
  }
  
  public boolean addTraveller(edu.sjsu.fly5.pojos.Traveller traveller) throws java.rmi.RemoteException{
    if (travellerService == null)
      _initTravellerServiceProxy();
    return travellerService.addTraveller(traveller);
  }
  
  public edu.sjsu.fly5.pojos.Traveller[] listTravellers() throws java.rmi.RemoteException{
    if (travellerService == null)
      _initTravellerServiceProxy();
    return travellerService.listTravellers();
  }
  
  public edu.sjsu.fly5.pojos.Traveller viewTravellerInfo(long travellerId) throws java.rmi.RemoteException{
    if (travellerService == null)
      _initTravellerServiceProxy();
    return travellerService.viewTravellerInfo(travellerId);
  }
  
  public boolean updateTraveller(edu.sjsu.fly5.pojos.Traveller traveller) throws java.rmi.RemoteException{
    if (travellerService == null)
      _initTravellerServiceProxy();
    return travellerService.updateTraveller(traveller);
  }
  
  public boolean removeTraveller(long travellerId) throws java.rmi.RemoteException{
    if (travellerService == null)
      _initTravellerServiceProxy();
    return travellerService.removeTraveller(travellerId);
  }
  
  public boolean authenticateTraveller(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException{
    if (travellerService == null)
      _initTravellerServiceProxy();
    return travellerService.authenticateTraveller(email, password);
  }
  
  
}