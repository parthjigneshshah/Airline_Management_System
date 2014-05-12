/**
 * JourneyServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.services;

public interface JourneyServiceService extends javax.xml.rpc.Service {
    public java.lang.String getJourneyServiceAddress();

    public edu.sjsu.fly5.services.JourneyService getJourneyService() throws javax.xml.rpc.ServiceException;

    public edu.sjsu.fly5.services.JourneyService getJourneyService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
