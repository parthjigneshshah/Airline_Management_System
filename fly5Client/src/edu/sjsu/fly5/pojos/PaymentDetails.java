/**
 * PaymentDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.pojos;

public class PaymentDetails  implements java.io.Serializable {
    private long creditCardNumber;

    private int cvvNumber;

    private int expiryMonth;

    private int expiryYear;

    private java.lang.String paymentType;

    private java.lang.String travellerID;

    public PaymentDetails() {
    }

    public PaymentDetails(
           long creditCardNumber,
           int cvvNumber,
           int expiryMonth,
           int expiryYear,
           java.lang.String paymentType,
           java.lang.String travellerID) {
           this.creditCardNumber = creditCardNumber;
           this.cvvNumber = cvvNumber;
           this.expiryMonth = expiryMonth;
           this.expiryYear = expiryYear;
           this.paymentType = paymentType;
           this.travellerID = travellerID;
    }


    /**
     * Gets the creditCardNumber value for this PaymentDetails.
     * 
     * @return creditCardNumber
     */
    public long getCreditCardNumber() {
        return creditCardNumber;
    }


    /**
     * Sets the creditCardNumber value for this PaymentDetails.
     * 
     * @param creditCardNumber
     */
    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }


    /**
     * Gets the cvvNumber value for this PaymentDetails.
     * 
     * @return cvvNumber
     */
    public int getCvvNumber() {
        return cvvNumber;
    }


    /**
     * Sets the cvvNumber value for this PaymentDetails.
     * 
     * @param cvvNumber
     */
    public void setCvvNumber(int cvvNumber) {
        this.cvvNumber = cvvNumber;
    }


    /**
     * Gets the expiryMonth value for this PaymentDetails.
     * 
     * @return expiryMonth
     */
    public int getExpiryMonth() {
        return expiryMonth;
    }


    /**
     * Sets the expiryMonth value for this PaymentDetails.
     * 
     * @param expiryMonth
     */
    public void setExpiryMonth(int expiryMonth) {
        this.expiryMonth = expiryMonth;
    }


    /**
     * Gets the expiryYear value for this PaymentDetails.
     * 
     * @return expiryYear
     */
    public int getExpiryYear() {
        return expiryYear;
    }


    /**
     * Sets the expiryYear value for this PaymentDetails.
     * 
     * @param expiryYear
     */
    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }


    /**
     * Gets the paymentType value for this PaymentDetails.
     * 
     * @return paymentType
     */
    public java.lang.String getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this PaymentDetails.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.String paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the travellerID value for this PaymentDetails.
     * 
     * @return travellerID
     */
    public java.lang.String getTravellerID() {
        return travellerID;
    }


    /**
     * Sets the travellerID value for this PaymentDetails.
     * 
     * @param travellerID
     */
    public void setTravellerID(java.lang.String travellerID) {
        this.travellerID = travellerID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentDetails)) return false;
        PaymentDetails other = (PaymentDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.creditCardNumber == other.getCreditCardNumber() &&
            this.cvvNumber == other.getCvvNumber() &&
            this.expiryMonth == other.getExpiryMonth() &&
            this.expiryYear == other.getExpiryYear() &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.travellerID==null && other.getTravellerID()==null) || 
             (this.travellerID!=null &&
              this.travellerID.equals(other.getTravellerID())));
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
        _hashCode += new Long(getCreditCardNumber()).hashCode();
        _hashCode += getCvvNumber();
        _hashCode += getExpiryMonth();
        _hashCode += getExpiryYear();
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getTravellerID() != null) {
            _hashCode += getTravellerID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "PaymentDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "creditCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvvNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "cvvNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "expiryMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "expiryYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "paymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travellerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "travellerID"));
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
