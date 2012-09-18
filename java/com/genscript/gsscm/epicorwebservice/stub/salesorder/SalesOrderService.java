
/*
 * 
 */

package com.genscript.gsscm.epicorwebservice.stub.salesorder;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.6
 * Wed May 04 11:20:23 CST 2011
 * Generated source version: 2.2.6
 * 
 */


@WebServiceClient(name = "SalesOrderService", 
                  wsdlLocation = "file:/D:/temp/SalesOrderService.asmx.xml",
                  targetNamespace = "http://epicor.com/webservices/") 
public class SalesOrderService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://epicor.com/webservices/", "SalesOrderService");
    public final static QName SalesOrderServiceSoap = new QName("http://epicor.com/webservices/", "SalesOrderServiceSoap");
    public final static QName SalesOrderServiceSoap12 = new QName("http://epicor.com/webservices/", "SalesOrderServiceSoap12");
    static {
        URL url = null;
        try {
            url = new URL("http://10.168.2.131/EpicorServices/SalesOrderService.asmx?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://10.168.2.131/EpicorServices/SalesOrderService.asmx?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public SalesOrderService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SalesOrderService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SalesOrderService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns SalesOrderServiceSoap
     */
    @WebEndpoint(name = "SalesOrderServiceSoap")
    public SalesOrderServiceSoap getSalesOrderServiceSoap() {
        return super.getPort(SalesOrderServiceSoap, SalesOrderServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SalesOrderServiceSoap
     */
    @WebEndpoint(name = "SalesOrderServiceSoap")
    public SalesOrderServiceSoap getSalesOrderServiceSoap(WebServiceFeature... features) {
        return super.getPort(SalesOrderServiceSoap, SalesOrderServiceSoap.class, features);
    }
    /**
     * 
     * @return
     *     returns SalesOrderServiceSoap
     */
    @WebEndpoint(name = "SalesOrderServiceSoap12")
    public SalesOrderServiceSoap getSalesOrderServiceSoap12() {
        return super.getPort(SalesOrderServiceSoap12, SalesOrderServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SalesOrderServiceSoap
     */
    @WebEndpoint(name = "SalesOrderServiceSoap12")
    public SalesOrderServiceSoap getSalesOrderServiceSoap12(WebServiceFeature... features) {
        return super.getPort(SalesOrderServiceSoap12, SalesOrderServiceSoap.class, features);
    }

}
