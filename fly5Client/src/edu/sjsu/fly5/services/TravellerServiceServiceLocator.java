/**
 * TravellerServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.services;

public class TravellerServiceServiceLocator extends org.apache.axis.client.Service implements edu.sjsu.fly5.services.TravellerServiceService {

    public TravellerServiceServiceLocator() {
    }


    public TravellerServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TravellerServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TravellerService
    private java.lang.String TravellerService_address = "http://localhost/fly5Project/services/TravellerService";

    public java.lang.String getTravellerServiceAddress() {
        return TravellerService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TravellerServiceWSDDServiceName = "TravellerService";

    public java.lang.String getTravellerServiceWSDDServiceName() {
        return TravellerServiceWSDDServiceName;
    }

    public void setTravellerServiceWSDDServiceName(java.lang.String name) {
        TravellerServiceWSDDServiceName = name;
    }

    public edu.sjsu.fly5.services.TravellerService getTravellerService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TravellerService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTravellerService(endpoint);
    }

    public edu.sjsu.fly5.services.TravellerService getTravellerService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            edu.sjsu.fly5.services.TravellerServiceSoapBindingStub _stub = new edu.sjsu.fly5.services.TravellerServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTravellerServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTravellerServiceEndpointAddress(java.lang.String address) {
        TravellerService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (edu.sjsu.fly5.services.TravellerService.class.isAssignableFrom(serviceEndpointInterface)) {
                edu.sjsu.fly5.services.TravellerServiceSoapBindingStub _stub = new edu.sjsu.fly5.services.TravellerServiceSoapBindingStub(new java.net.URL(TravellerService_address), this);
                _stub.setPortName(getTravellerServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TravellerService".equals(inputPortName)) {
            return getTravellerService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.fly5.sjsu.edu", "TravellerServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.fly5.sjsu.edu", "TravellerService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TravellerService".equals(portName)) {
            setTravellerServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
