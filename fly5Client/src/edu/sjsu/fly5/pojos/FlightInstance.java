/**
 * FlightInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.sjsu.fly5.pojos;

public class FlightInstance  implements java.io.Serializable {
    private float adultFare;

    private java.lang.String arrivalDate;

    private java.lang.String arrivalTime;

    private int availableTickets;

    private java.lang.String departureDate;

    private java.lang.String departuteTime;

    private java.lang.String destination;

    private float distance;

    private java.lang.String flight_no;

    private java.lang.String journeyTime;

    private java.lang.String source;

    private int totalSeats;

    private java.lang.String travelClass;

    public FlightInstance() {
    }

    public FlightInstance(
           float adultFare,
           java.lang.String arrivalDate,
           java.lang.String arrivalTime,
           int availableTickets,
           java.lang.String departureDate,
           java.lang.String departuteTime,
           java.lang.String destination,
           float distance,
           java.lang.String flight_no,
           java.lang.String journeyTime,
           java.lang.String source,
           int totalSeats,
           java.lang.String travelClass) {
           this.adultFare = adultFare;
           this.arrivalDate = arrivalDate;
           this.arrivalTime = arrivalTime;
           this.availableTickets = availableTickets;
           this.departureDate = departureDate;
           this.departuteTime = departuteTime;
           this.destination = destination;
           this.distance = distance;
           this.flight_no = flight_no;
           this.journeyTime = journeyTime;
           this.source = source;
           this.totalSeats = totalSeats;
           this.travelClass = travelClass;
    }


    /**
     * Gets the adultFare value for this FlightInstance.
     * 
     * @return adultFare
     */
    public float getAdultFare() {
        return adultFare;
    }


    /**
     * Sets the adultFare value for this FlightInstance.
     * 
     * @param adultFare
     */
    public void setAdultFare(float adultFare) {
        this.adultFare = adultFare;
    }


    /**
     * Gets the arrivalDate value for this FlightInstance.
     * 
     * @return arrivalDate
     */
    public java.lang.String getArrivalDate() {
        return arrivalDate;
    }


    /**
     * Sets the arrivalDate value for this FlightInstance.
     * 
     * @param arrivalDate
     */
    public void setArrivalDate(java.lang.String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }


    /**
     * Gets the arrivalTime value for this FlightInstance.
     * 
     * @return arrivalTime
     */
    public java.lang.String getArrivalTime() {
        return arrivalTime;
    }


    /**
     * Sets the arrivalTime value for this FlightInstance.
     * 
     * @param arrivalTime
     */
    public void setArrivalTime(java.lang.String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    /**
     * Gets the availableTickets value for this FlightInstance.
     * 
     * @return availableTickets
     */
    public int getAvailableTickets() {
        return availableTickets;
    }


    /**
     * Sets the availableTickets value for this FlightInstance.
     * 
     * @param availableTickets
     */
    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }


    /**
     * Gets the departureDate value for this FlightInstance.
     * 
     * @return departureDate
     */
    public java.lang.String getDepartureDate() {
        return departureDate;
    }


    /**
     * Sets the departureDate value for this FlightInstance.
     * 
     * @param departureDate
     */
    public void setDepartureDate(java.lang.String departureDate) {
        this.departureDate = departureDate;
    }


    /**
     * Gets the departuteTime value for this FlightInstance.
     * 
     * @return departuteTime
     */
    public java.lang.String getDepartuteTime() {
        return departuteTime;
    }


    /**
     * Sets the departuteTime value for this FlightInstance.
     * 
     * @param departuteTime
     */
    public void setDepartuteTime(java.lang.String departuteTime) {
        this.departuteTime = departuteTime;
    }


    /**
     * Gets the destination value for this FlightInstance.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this FlightInstance.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the distance value for this FlightInstance.
     * 
     * @return distance
     */
    public float getDistance() {
        return distance;
    }


    /**
     * Sets the distance value for this FlightInstance.
     * 
     * @param distance
     */
    public void setDistance(float distance) {
        this.distance = distance;
    }


    /**
     * Gets the flight_no value for this FlightInstance.
     * 
     * @return flight_no
     */
    public java.lang.String getFlight_no() {
        return flight_no;
    }


    /**
     * Sets the flight_no value for this FlightInstance.
     * 
     * @param flight_no
     */
    public void setFlight_no(java.lang.String flight_no) {
        this.flight_no = flight_no;
    }


    /**
     * Gets the journeyTime value for this FlightInstance.
     * 
     * @return journeyTime
     */
    public java.lang.String getJourneyTime() {
        return journeyTime;
    }


    /**
     * Sets the journeyTime value for this FlightInstance.
     * 
     * @param journeyTime
     */
    public void setJourneyTime(java.lang.String journeyTime) {
        this.journeyTime = journeyTime;
    }


    /**
     * Gets the source value for this FlightInstance.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this FlightInstance.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the totalSeats value for this FlightInstance.
     * 
     * @return totalSeats
     */
    public int getTotalSeats() {
        return totalSeats;
    }


    /**
     * Sets the totalSeats value for this FlightInstance.
     * 
     * @param totalSeats
     */
    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }


    /**
     * Gets the travelClass value for this FlightInstance.
     * 
     * @return travelClass
     */
    public java.lang.String getTravelClass() {
        return travelClass;
    }


    /**
     * Sets the travelClass value for this FlightInstance.
     * 
     * @param travelClass
     */
    public void setTravelClass(java.lang.String travelClass) {
        this.travelClass = travelClass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightInstance)) return false;
        FlightInstance other = (FlightInstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.adultFare == other.getAdultFare() &&
            ((this.arrivalDate==null && other.getArrivalDate()==null) || 
             (this.arrivalDate!=null &&
              this.arrivalDate.equals(other.getArrivalDate()))) &&
            ((this.arrivalTime==null && other.getArrivalTime()==null) || 
             (this.arrivalTime!=null &&
              this.arrivalTime.equals(other.getArrivalTime()))) &&
            this.availableTickets == other.getAvailableTickets() &&
            ((this.departureDate==null && other.getDepartureDate()==null) || 
             (this.departureDate!=null &&
              this.departureDate.equals(other.getDepartureDate()))) &&
            ((this.departuteTime==null && other.getDepartuteTime()==null) || 
             (this.departuteTime!=null &&
              this.departuteTime.equals(other.getDepartuteTime()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            this.distance == other.getDistance() &&
            ((this.flight_no==null && other.getFlight_no()==null) || 
             (this.flight_no!=null &&
              this.flight_no.equals(other.getFlight_no()))) &&
            ((this.journeyTime==null && other.getJourneyTime()==null) || 
             (this.journeyTime!=null &&
              this.journeyTime.equals(other.getJourneyTime()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            this.totalSeats == other.getTotalSeats() &&
            ((this.travelClass==null && other.getTravelClass()==null) || 
             (this.travelClass!=null &&
              this.travelClass.equals(other.getTravelClass())));
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
        _hashCode += new Float(getAdultFare()).hashCode();
        if (getArrivalDate() != null) {
            _hashCode += getArrivalDate().hashCode();
        }
        if (getArrivalTime() != null) {
            _hashCode += getArrivalTime().hashCode();
        }
        _hashCode += getAvailableTickets();
        if (getDepartureDate() != null) {
            _hashCode += getDepartureDate().hashCode();
        }
        if (getDepartuteTime() != null) {
            _hashCode += getDepartuteTime().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        _hashCode += new Float(getDistance()).hashCode();
        if (getFlight_no() != null) {
            _hashCode += getFlight_no().hashCode();
        }
        if (getJourneyTime() != null) {
            _hashCode += getJourneyTime().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        _hashCode += getTotalSeats();
        if (getTravelClass() != null) {
            _hashCode += getTravelClass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "FlightInstance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adultFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "adultFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "arrivalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "arrivalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableTickets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "availableTickets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "departureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departuteTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "departuteTime"));
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
        elemField.setFieldName("distance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "distance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight_no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "flight_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journeyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "journeyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSeats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "totalSeats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://pojos.fly5.sjsu.edu", "travelClass"));
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
