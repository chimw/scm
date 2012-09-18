
package com.genscript.gsscm.epicorwebservice.stub.invoice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.genscript package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.genscript
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPaymentList }
     * 
     */
    public GetPaymentList createGetPaymentList() {
        return new GetPaymentList();
    }

    /**
     * Create an instance of {@link GetInvoiceListResponse }
     * 
     */
    public GetInvoiceListResponse createGetInvoiceListResponse() {
        return new GetInvoiceListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInvoice }
     * 
     */
    public ArrayOfInvoice createArrayOfInvoice() {
        return new ArrayOfInvoice();
    }

    /**
     * Create an instance of {@link GetPaymentListResponse }
     * 
     */
    public GetPaymentListResponse createGetPaymentListResponse() {
        return new GetPaymentListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPayment }
     * 
     */
    public ArrayOfPayment createArrayOfPayment() {
        return new ArrayOfPayment();
    }

    /**
     * Create an instance of {@link GetInvoiceList }
     * 
     */
    public GetInvoiceList createGetInvoiceList() {
        return new GetInvoiceList();
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

}
