package edu.sjsu.fly5.services;

public class CrewServiceProxy implements edu.sjsu.fly5.services.CrewService {
  private String _endpoint = null;
  private edu.sjsu.fly5.services.CrewService crewService = null;
  
  public CrewServiceProxy() {
    _initCrewServiceProxy();
  }
  
  public CrewServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCrewServiceProxy();
  }
  
  private void _initCrewServiceProxy() {
    try {
      crewService = (new edu.sjsu.fly5.services.CrewServiceServiceLocator()).getCrewService();
      if (crewService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)crewService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)crewService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (crewService != null)
      ((javax.xml.rpc.Stub)crewService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.sjsu.fly5.services.CrewService getCrewService() {
    if (crewService == null)
      _initCrewServiceProxy();
    return crewService;
  }
  
  public edu.sjsu.fly5.pojos.Crew viewCrewDetails(long crewID) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception{
    if (crewService == null)
      _initCrewServiceProxy();
    return crewService.viewCrewDetails(crewID);
  }
  
  public boolean updateCrew(edu.sjsu.fly5.pojos.Crew crew) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception{
    if (crewService == null)
      _initCrewServiceProxy();
    return crewService.updateCrew(crew);
  }
  
  public boolean removeCrew(long crewID) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception{
    if (crewService == null)
      _initCrewServiceProxy();
    return crewService.removeCrew(crewID);
  }
  
  public boolean addCrew(java.lang.String crewName) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception{
    if (crewService == null)
      _initCrewServiceProxy();
    return crewService.addCrew(crewName);
  }
  
  public edu.sjsu.fly5.pojos.Crew[] listcrews() throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception{
    if (crewService == null)
      _initCrewServiceProxy();
    return crewService.listcrews();
  }
  
  
}