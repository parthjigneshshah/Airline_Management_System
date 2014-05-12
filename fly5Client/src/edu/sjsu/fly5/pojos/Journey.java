/**
 * Journey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.pojos;

public class Journey  implements java.io.Serializable {
    private java.util.Calendar arrivalDate;

    private java.lang.String arrivalTime;

    private java.lang.String bookingReferenceNo;

    private java.util.Calendar departureDate;

    private java.lang.String departureTime;

    private java.lang.String destination;

    private edu.sjsu.fly5.pojos.Flight[] listOfFlights;

    private edu.sjsu.fly5.pojos.Traveller[] listOfTraveller;

    private java.lang.String source;

    private double totalPrice;

    private java.lang.String typeOfClass;

    private java.lang.String typeOfTrip;

    public Journey() {
    }

    public Journey(
           java.util.Calendar arrivalDate,
           java.lang.String arrivalTime,
           java.lang.String bookingReferenceNo,
           java.util.Calendar departureDate,
           java.lang.String departureTime,
           java.lang.String destination,
           edu.sjsu.fly5.pojos.Flight[] listOfFlights,
           edu.sjsu.fly5.pojos.Traveller[] listOfTraveller,
           java.lang.String source,
           double totalPrice,
           java.lang.String typeOfClass,
           java.lang.String typeOfTrip) {
           this.arrivalDate = arrivalDate;
           this.arrivalTime = arrivalTime;
           this.bookingReferenceNo = bookingReferenceNo;
           this.departureDate = departureDate;
           this.departureTime = departureTime;
           this.destination = destination;
           this.listOfFlights = listOfFlights;
           this.listOfTraveller = listOfTraveller;
           this.source = source;
           this.totalPrice = totalPrice;
           this.typeOfClass = typeOfClass;
           this.typeOfTrip = typeOfTrip;
    }


    /**
     * Gets the arrivalDate value for this Journey.
     * 
     * @return arrivalDate
     */
    public java.util.Calendar getArrivalDate() {
        return arrivalDate;
    }


    /**
     * Sets the arrivalDate value for this Journey.
     * 
     * @param arrivalDate
     */
    public void setArrivalDate(java.util.Calendar arrivalDate) {
        this.arrivalDate = arrivalDate;
    }


    /**
     * Gets the arrivalTime value for this Journey.
     * 
     * @return arrivalTime
     */
    public java.lang.String getArrivalTime() {
        return arrivalTime;
    }


    /**
     * Sets the arrivalTime value for this Journey.
     * 
     * @param arrivalTime
     */
    public void setArrivalTime(java.lang.String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    /**
     * Gets the bookingReferenceNo value for this Journey.
     * 
     * @return bookingReferenceNo
     */
    public java.lang.String getBookingReferenceNo() {
        return bookingReferenceNo;
    }


    /**
     * Sets the bookingReferenceNo value for this Journey.
     * 
     * @param bookingReferenceNo
     */
    public void setBookingReferenceNo(java.lang.String bookingReferenceNo) {
        this.bookingReferenceNo = bookingReferenceNo;
    }


    /**
     * Gets the departureDate value for this Journey.
     * 
     * @return departureDate
     */
    public java.util.Calendar getDepartureDate() {
        return departureDate;
    }


    /**
     * Sets the departureDate value for this Journey.
     * 
     * @param departureDate
     */
    public void setDepartureDate(java.util.Calendar departureDate) {
        this.departureDate = departureDate;
    }


    /**
     * Gets the departureTime value for this Journey.
     * 
     * @return departureTime
     */
    public java.lang.String getDepartureTime() {
        return departureTime;
    }


    /**
     * Sets the departureTime value for this Journey.
     * 
     * @param departureTime
     */
    public void setDepartureTime(java.lang.String departureTime) {
        this.departureTime = departureTime;
    }


    /**
     * Gets the destination value for this Journey.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this Journey.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the listOfFlights value for this Journey.
     * 
     * @return listOfFlights
     */
    public edu.sjsu.fly5.pojos.Flight[] getListOfFlights() {
        return listOfFlights;
    }


    /**
     * Sets the listOfFlights value for this Journey.
     * 
     * @param listOfFlights
     */
    public void setListOfFlights(edu.sjsu.fly5.pojos.Flight[] listOfFlights) {
        this.listOfFlights = listOfFlights;
    }


    /**
     * Gets the listOfTraveller value for this Journey.
     * 
     * @return listOfTraveller
     */
    public edu.sjsu.fly5.pojos.Traveller[] getListOfTraveller() {
        return listOfTraveller;
    }


    /**
     * Sets the listOfTraveller value for this Journey.
     * 
     * @param listOfTraveller
     */
    public void setListOfTraveller(edu.sjsu.fly5.pojos.Traveller[] listOfTraveller) {
        this.listOfTraveller = listOfTraveller;
    }


    /**
     * Gets the source value for this Journey.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Journey.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the totalPrice value for this Journey.
     * 
     * @return totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this Journey.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the typeOfClass value for this Journey.
     * 
     * @return typeOfClass
     */
    public java.lang.String getTypeOfClass() {
        return typeOfClass;
    }


    /**
     * Sets the typeOfClass value for this Journey.
     * 
     * @param typeOfClass
     */
    public void setTypeOfClass(java.lang.String typeOfClass) {
        this.typeOfClass = typeOfClass;
    }


    /**
     * Gets the typeOfTrip value for this Journey.
     * 
     * @return typeOfTrip
     */
    public java.lang.String getTypeOfTrip() {
        return typeOfTrip;
    }


    /**
     * Sets the typeOfTrip value for this Journey.
     * 
     * @param typeOfTrip
     */
    public void setTypeOfTrip(java.lang.String typeOfTrip) {
        this.typeOfTrip = typeOfTrip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Journey)) return false;
        Journey other = (Journey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arrivalDate==null && other.getArrivalDate()==null) || 
             (this.arrivalDate!=null &&
              this.arrivalDate.equals(other.getArrivalDate()))) &&
            ((this.arrivalTime==null && other.getArrivalTime()==null) || 
             (this.arrivalTime!=null &&
              this.arrivalTime.equals(other.getArrivalTime()))) &&
            ((this.bookingReferenceNo==null && other.getBookingReferenceNo()==null) || 
             (this.bookingReferenceNo!=null &&
              this.bookingReferenceNo.equals(other.getBookingReferenceNo()))) &&
            ((this.departureDate==null && other.getDepartureDate()==null) || 
             (this.departureDate!=null &&
              this.departureDate.equals(other.getDepartureDate()))) &&
            ((this.departureTime==null && other.getDepartureTime()==null) || 
             (this.departureTime!=null &&
              this.departureTime.equals(other.getDepartureTime()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.listOfFlights==null && other.getListOfFlights()==null) || 
             (this.listOfFlights!=null &&
              java.util.Arrays.equals(this.listOfFlights, other.getListOfFlights()))) &&
            ((this.listOfTraveller==null && other.getListOfTraveller()==null) || 
             (this.listOfTraveller!=null &&
              java.util.Arrays.equals(this.listOfTraveller, other.getListOfTraveller()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            this.totalPrice == other.getTotalPrice() &&
            ((this.typeOfClass==null && other.getTypeOfClass()==null) || 
             (this.typeOfClass!=null &&
              this.typeOfClass.equals(other.getTypeOfClass()))) &&
            ((this.typeOfTrip==null && other.getTypeOfTrip()==null) || 
             (this.typeOfTrip!=null &&
              this.typeOfTrip.equals(other.getTypeOfTrip())));
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
        if (getArrivalDate() != null) {
            _hashCode += getArrivalDate().hashCode();
        }
        if (getArrivalTime() != null) {
            _hashCode += getArrivalTime().hashCode();
        }
        if (getBookingReferenceNo() != null) {
            _hashCode += getBookingReferenceNo().hashCode();
        }
        if (getDepartureDate() != null) {
            _hashCode += getDepartureDate().hashCode();
        }
        if (getDepartureTime() != null) {
            _hashCode += getDepartureTime().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getListOfFlights() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfFlights());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfFlights(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListOfTraveller() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfTraveller());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfTraveller(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        _hashCode += new Double(getTotalPrice()).hashCode();
        if (getTypeOfClass() != null) {
            _hashCode += getTypeOfClass().hashCode();
        }
        if (getTypeOfTrip() != null) {
            _hashCode += getTypeOfTrip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Journey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "Journey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "arrivalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "arrivalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingReferenceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "bookingReferenceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "departureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "departureTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfFlights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "listOfFlights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "Flight"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.fly5.sjsu.edu", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfTraveller");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "listOfTraveller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "Traveller"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.fly5.sjsu.edu", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "totalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "typeOfClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfTrip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "typeOfTrip"));
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
