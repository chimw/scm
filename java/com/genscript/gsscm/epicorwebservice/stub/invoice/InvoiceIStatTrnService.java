package com.genscript.gsscm.epicorwebservice.stub.invoice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.7 2011-12-01T09:45:54.761+08:00
 * Generated source version: 2.3.7
 * 
 */
@WebServiceClient(name = "InvoiceIStatTrnService", wsdlLocation = "http://10.168.2.131/EpicorServices/InvoiceIStatTrnService.asmx?wsdl", targetNamespace = "http://epicor.com/webservices/")
public class InvoiceIStatTrnService extends Service {

	public final static URL WSDL_LOCATION;

	public final static QName SERVICE = new QName(
			"http://epicor.com/webservices/", "InvoiceIStatTrnService");
	public final static QName InvoiceIStatTrnServiceSoap12 = new QName(
			"http://epicor.com/webservices/", "InvoiceIStatTrnServiceSoap12");
	public final static QName InvoiceIStatTrnServiceSoap = new QName(
			"http://epicor.com/webservices/", "InvoiceIStatTrnServiceSoap");
	static {
		URL url = null;
		try {
			// url = new URL("file:InvoiceIStatTrnService.asmx.xml");
			url = new URL(
					"http://10.168.2.131/EpicorServices/InvoiceIStatTrnService.asmx?wsdl");
		} catch (MalformedURLException e) {
			java.util.logging.Logger
					.getLogger(InvoiceIStatTrnService.class.getName())
					.log(java.util.logging.Level.INFO,
							"Can not initialize the default wsdl from {0}",
							"http://10.168.2.131/EpicorServices/InvoiceIStatTrnService.asmx?wsdl");
		}
		WSDL_LOCATION = url;
	}

	public InvoiceIStatTrnService(URL wsdlLocation) {
		super(wsdlLocation, SERVICE);
	}

	public InvoiceIStatTrnService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public InvoiceIStatTrnService() {
		super(WSDL_LOCATION, SERVICE);
	}

	/**
	 * 
	 * @return returns InvoiceIStatTrnServiceSoap
	 */
	@WebEndpoint(name = "InvoiceIStatTrnServiceSoap12")
	public InvoiceIStatTrnServiceSoap getInvoiceIStatTrnServiceSoap12() {
		return super.getPort(InvoiceIStatTrnServiceSoap12,
				InvoiceIStatTrnServiceSoap.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns InvoiceIStatTrnServiceSoap
	 */
	@WebEndpoint(name = "InvoiceIStatTrnServiceSoap12")
	public InvoiceIStatTrnServiceSoap getInvoiceIStatTrnServiceSoap12(
			WebServiceFeature... features) {
		return super.getPort(InvoiceIStatTrnServiceSoap12,
				InvoiceIStatTrnServiceSoap.class, features);
	}

	/**
	 * 
	 * @return returns InvoiceIStatTrnServiceSoap
	 */
	@WebEndpoint(name = "InvoiceIStatTrnServiceSoap")
	public InvoiceIStatTrnServiceSoap getInvoiceIStatTrnServiceSoap() {
		return super.getPort(InvoiceIStatTrnServiceSoap,
				InvoiceIStatTrnServiceSoap.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns InvoiceIStatTrnServiceSoap
	 */
	@WebEndpoint(name = "InvoiceIStatTrnServiceSoap")
	public InvoiceIStatTrnServiceSoap getInvoiceIStatTrnServiceSoap(
			WebServiceFeature... features) {
		return super.getPort(InvoiceIStatTrnServiceSoap,
				InvoiceIStatTrnServiceSoap.class, features);
	}

}
