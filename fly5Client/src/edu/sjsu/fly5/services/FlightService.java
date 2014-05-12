/**
 * FlightService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.services;

public interface FlightService extends java.rmi.Remote {
    public void addFlightDetails(edu.sjsu.fly5.pojos.Flight flight) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
    public edu.sjsu.fly5.pojos.Flight viewFlightDetails(java.lang.String flightId) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
    public void updateFlightDetails(edu.sjsu.fly5.pojos.Flight flight) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
    public void deleteFlightDetails(java.lang.String flightId) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
    public edu.sjsu.fly5.pojos.TravelerInfo[] getTravellersOnBoard(java.lang.String flightID, java.lang.String departureDate) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
    public edu.sjsu.fly5.pojos.FlightInstance[] searchFlight(edu.sjsu.fly5.pojos.FlightSearchAttributes searchAttributes) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
    public edu.sjsu.fly5.pojos.Flight[] listFlights() throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
}
