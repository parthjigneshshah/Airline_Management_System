/**
 * Fly5Exception.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.util;

public class Fly5Exception  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private edu.sjsu.fly5.util.FaultBean faultBean;

    public Fly5Exception() {
    }

    public Fly5Exception(
           edu.sjsu.fly5.util.FaultBean faultBean) {
        this.faultBean = faultBean;
    }


    /**
     * Gets the faultBean value for this Fly5Exception.
     * 
     * @return faultBean
     */
    public edu.sjsu.fly5.util.FaultBean getFaultBean() {
        return faultBean;
    }


    /**
     * Sets the faultBean value for this Fly5Exception.
     * 
     * @param faultBean
     */
    public void setFaultBean(edu.sjsu.fly5.util.FaultBean faultBean) {
        this.faultBean = faultBean;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Fly5Exception)) return false;
        Fly5Exception other = (Fly5Exception) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faultBean==null && other.getFaultBean()==null) || 
             (this.faultBean!=null &&
              this.faultBean.equals(other.getFaultBean())));
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
        if (getFaultBean() != null) {
            _hashCode += getFaultBean().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Fly5Exception.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://util.fly5.sjsu.edu", "Fly5Exception"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultBean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.fly5.sjsu.edu", "faultBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://util.fly5.sjsu.edu", "FaultBean"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
