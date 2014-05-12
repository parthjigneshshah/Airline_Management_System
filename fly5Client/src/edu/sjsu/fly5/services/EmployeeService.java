/**
 * EmployeeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.services;

public interface EmployeeService extends java.rmi.Remote {
    public edu.sjsu.fly5.pojos.Employee searchEmployeesBasedOnAttributes(edu.sjsu.fly5.pojos.Attribute[] attributes) throws java.rmi.RemoteException;
    public boolean addEmployee(edu.sjsu.fly5.pojos.Employee employee) throws java.rmi.RemoteException;
    public edu.sjsu.fly5.pojos.Employee[] listEmployees() throws java.rmi.RemoteException;
    public edu.sjsu.fly5.pojos.Employee viewEmployeeInfo(long employeeID) throws java.rmi.RemoteException;
    public boolean updateEmployee(edu.sjsu.fly5.pojos.Employee employee) throws java.rmi.RemoteException;
    public boolean removeEmployee(long employeeID) throws java.rmi.RemoteException;
}
