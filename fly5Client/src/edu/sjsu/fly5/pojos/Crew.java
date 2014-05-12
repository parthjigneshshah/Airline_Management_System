/**
 * Crew.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.pojos;

public class Crew  implements java.io.Serializable {
    private long crewID;

    private java.lang.String crewName;

    public Crew() {
    }

    public Crew(
           long crewID,
           java.lang.String crewName) {
           this.crewID = crewID;
           this.crewName = crewName;
    }


    /**
     * Gets the crewID value for this Crew.
     * 
     * @return crewID
     */
    public long getCrewID() {
        return crewID;
    }


    /**
     * Sets the crewID value for this Crew.
     * 
     * @param crewID
     */
    public void setCrewID(long crewID) {
        this.crewID = crewID;
    }


    /**
     * Gets the crewName value for this Crew.
     * 
     * @return crewName
     */
    public java.lang.String getCrewName() {
        return crewName;
    }


    /**
     * Sets the crewName value for this Crew.
     * 
     * @param crewName
     */
    public void setCrewName(java.lang.String crewName) {
        this.crewName = crewName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Crew)) return false;
        Crew other = (Crew) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.crewID == other.getCrewID() &&
            ((this.crewName==null && other.getCrewName()==null) || 
             (this.crewName!=null &&
              this.crewName.equals(other.getCrewName())));
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
        if (getCrewName() != null) {
            _hashCode += getCrewName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Crew.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "Crew"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crewID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "crewID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crewName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "crewName"));
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
