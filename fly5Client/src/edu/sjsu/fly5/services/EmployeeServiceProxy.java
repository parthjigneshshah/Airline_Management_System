package edu.sjsu.fly5.services;

public class EmployeeServiceProxy implements edu.sjsu.fly5.services.EmployeeService {
  private String _endpoint = null;
  private edu.sjsu.fly5.services.EmployeeService employeeService = null;
  
  public EmployeeServiceProxy() {
    _initEmployeeServiceProxy();
  }
  
  public EmployeeServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmployeeServiceProxy();
  }
  
  private void _initEmployeeServiceProxy() {
    try {
      employeeService = (new edu.sjsu.fly5.services.EmployeeServiceServiceLocator()).getEmployeeService();
      if (employeeService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)employeeService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)employeeService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (employeeService != null)
      ((javax.xml.rpc.Stub)employeeService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.sjsu.fly5.services.EmployeeService getEmployeeService() {
    if (employeeService == null)
      _initEmployeeServiceProxy();
    return employeeService;
  }
  
  public edu.sjsu.fly5.pojos.Employee searchEmployeesBasedOnAttributes(edu.sjsu.fly5.pojos.Attribute[] attributes) throws java.rmi.RemoteException{
    if (employeeService == null)
      _initEmployeeServiceProxy();
    return employeeService.searchEmployeesBasedOnAttributes(attributes);
  }
  
  public boolean addEmployee(edu.sjsu.fly5.pojos.Employee employee) throws java.rmi.RemoteException{
    if (employeeService == null)
      _initEmployeeServiceProxy();
    return employeeService.addEmployee(employee);
  }
  
  public edu.sjsu.fly5.pojos.Employee[] listEmployees() throws java.rmi.RemoteException{
    if (employeeService == null)
      _initEmployeeServiceProxy();
    return employeeService.listEmployees();
  }
  
  public edu.sjsu.fly5.pojos.Employee viewEmployeeInfo(long employeeID) throws java.rmi.RemoteException{
    if (employeeService == null)
      _initEmployeeServiceProxy();
    return employeeService.viewEmployeeInfo(employeeID);
  }
  
  public boolean updateEmployee(edu.sjsu.fly5.pojos.Employee employee) throws java.rmi.RemoteException{
    if (employeeService == null)
      _initEmployeeServiceProxy();
    return employeeService.updateEmployee(employee);
  }
  
  public boolean removeEmployee(long employeeID) throws java.rmi.RemoteException{
    if (employeeService == null)
      _initEmployeeServiceProxy();
    return employeeService.removeEmployee(employeeID);
  }
  
  
}