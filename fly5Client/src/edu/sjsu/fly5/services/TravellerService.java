/**
 * TravellerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.services;

public interface TravellerService extends java.rmi.Remote {
    public boolean addTraveller(edu.sjsu.fly5.pojos.Traveller traveller) throws java.rmi.RemoteException;
    public edu.sjsu.fly5.pojos.Traveller[] listTravellers() throws java.rmi.RemoteException;
    public edu.sjsu.fly5.pojos.Traveller viewTravellerInfo(long travellerId) throws java.rmi.RemoteException;
    public boolean updateTraveller(edu.sjsu.fly5.pojos.Traveller traveller) throws java.rmi.RemoteException;
    public boolean removeTraveller(long travellerId) throws java.rmi.RemoteException;
    public boolean authenticateTraveller(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException;
}
