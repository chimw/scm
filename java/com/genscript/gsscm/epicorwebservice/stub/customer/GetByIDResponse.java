
package com.genscript.gsscm.epicorwebservice.stub.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetByIDResult" type="{http://epicor.com/schemas}CustomerDataSetType" minOccurs="0"/>
 *         &lt;element name="callContextOut" type="{http://epicor.com/schemas}CallContextDataSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getByIDResult",
    "callContextOut"
})
@XmlRootElement(name = "GetByIDResponse")
public class GetByIDResponse {

    @XmlElement(name = "GetByIDResult", namespace = "http://epicor.com/webservices/")
    protected CustomerDataSetType getByIDResult;
    @XmlElement(namespace = "http://epicor.com/webservices/")
    protected CallContextDataSetType callContextOut;

    /**
     * Gets the value of the getByIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDataSetType }
     *     
     */
    public CustomerDataSetType getGetByIDResult() {
        return getByIDResult;
    }

    /**
     * Sets the value of the getByIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDataSetType }
     *     
     */
    public void setGetByIDResult(CustomerDataSetType value) {
        this.getByIDResult = value;
    }

    /**
     * Gets the value of the callContextOut property.
     * 
     * @return
     *     possible object is
     *     {@link CallContextDataSetType }
     *     
     */
    public CallContextDataSetType getCallContextOut() {
        return callContextOut;
    }

    /**
     * Sets the value of the callContextOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallContextDataSetType }
     *     
     */
    public void setCallContextOut(CallContextDataSetType value) {
        this.callContextOut = value;
    }

}
