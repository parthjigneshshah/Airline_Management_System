/**
 * CrewService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.services;

public interface CrewService extends java.rmi.Remote {
    public edu.sjsu.fly5.pojos.Crew viewCrewDetails(long crewID) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
    public boolean updateCrew(edu.sjsu.fly5.pojos.Crew crew) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
    public boolean removeCrew(long crewID) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
    public boolean addCrew(java.lang.String crewName) throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
    public edu.sjsu.fly5.pojos.Crew[] listcrews() throws java.rmi.RemoteException, edu.sjsu.fly5.util.Fly5Exception;
}
