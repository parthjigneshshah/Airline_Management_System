/**
 * Employee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.pojos;

public class Employee  implements java.io.Serializable {
    private long crewID;

    private java.lang.String designation;

    private java.lang.String employeeID;

    private java.util.Calendar hireDate;

    private java.lang.String personID;

    private java.lang.String workDescription;

    public Employee() {
    }

    public Employee(
           long crewID,
           java.lang.String designation,
           java.lang.String employeeID,
           java.util.Calendar hireDate,
           java.lang.String personID,
           java.lang.String workDescription) {
           this.crewID = crewID;
           this.designation = designation;
           this.employeeID = employeeID;
           this.hireDate = hireDate;
           this.personID = personID;
           this.workDescription = workDescription;
    }


    /**
     * Gets the crewID value for this Employee.
     * 
     * @return crewID
     */
    public long getCrewID() {
        return crewID;
    }


    /**
     * Sets the crewID value for this Employee.
     * 
     * @param crewID
     */
    public void setCrewID(long crewID) {
        this.crewID = crewID;
    }


    /**
     * Gets the designation value for this Employee.
     * 
     * @return designation
     */
    public java.lang.String getDesignation() {
        return designation;
    }


    /**
     * Sets the designation value for this Employee.
     * 
     * @param designation
     */
    public void setDesignation(java.lang.String designation) {
        this.designation = designation;
    }


    /**
     * Gets the employeeID value for this Employee.
     * 
     * @return employeeID
     */
    public java.lang.String getEmployeeID() {
        return employeeID;
    }


    /**
     * Sets the employeeID value for this Employee.
     * 
     * @param employeeID
     */
    public void setEmployeeID(java.lang.String employeeID) {
        this.employeeID = employeeID;
    }


    /**
     * Gets the hireDate value for this Employee.
     * 
     * @return hireDate
     */
    public java.util.Calendar getHireDate() {
        return hireDate;
    }


    /**
     * Sets the hireDate value for this Employee.
     * 
     * @param hireDate
     */
    public void setHireDate(java.util.Calendar hireDate) {
        this.hireDate = hireDate;
    }


    /**
     * Gets the personID value for this Employee.
     * 
     * @return personID
     */
    public java.lang.String getPersonID() {
        return personID;
    }


    /**
     * Sets the personID value for this Employee.
     * 
     * @param personID
     */
    public void setPersonID(java.lang.String personID) {
        this.personID = personID;
    }


    /**
     * Gets the workDescription value for this Employee.
     * 
     * @return workDescription
     */
    public java.lang.String getWorkDescription() {
        return workDescription;
    }


    /**
     * Sets the workDescription value for this Employee.
     * 
     * @param workDescription
     */
    public void setWorkDescription(java.lang.String workDescription) {
        this.workDescription = workDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.crewID == other.getCrewID() &&
            ((this.designation==null && other.getDesignation()==null) || 
             (this.designation!=null &&
              this.designation.equals(other.getDesignation()))) &&
            ((this.employeeID==null && other.getEmployeeID()==null) || 
             (this.employeeID!=null &&
              this.employeeID.equals(other.getEmployeeID()))) &&
            ((this.hireDate==null && other.getHireDate()==null) || 
             (this.hireDate!=null &&
              this.hireDate.equals(other.getHireDate()))) &&
            ((this.personID==null && other.getPersonID()==null) || 
             (this.personID!=null &&
              this.personID.equals(other.getPersonID()))) &&
            ((this.workDescription==null && other.getWorkDescription()==null) || 
             (this.workDescription!=null &&
              this.workDescription.equals(other.getWorkDescription())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getCrewID()).hashCode();
        if (getDesignation() != null) {
            _hashCode += getDesignation().hashCode();
        }
        if (getEmployeeID() != null) {
            _hashCode += getEmployeeID().hashCode();
        }
        if (getHireDate() != null) {
            _hashCode += getHireDate().hashCode();
        }
        if (getPersonID() != null) {
            _hashCode += getPersonID().hashCode();
        }
        if (getWorkDescription() != null) {
            _hashCode += getWorkDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Employee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "Employee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crewID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "crewID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "designation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "employeeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "hireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "personID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "workDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
