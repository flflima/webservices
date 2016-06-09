
package cotacao;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CotacaoService", targetNamespace = "http://cotacao/", wsdlLocation = "http://localhost:8080/cotacao?wsdl")
public class CotacaoService
    extends Service
{

    private final static URL COTACAOSERVICE_WSDL_LOCATION;
    private final static WebServiceException COTACAOSERVICE_EXCEPTION;
    private final static QName COTACAOSERVICE_QNAME = new QName("http://cotacao/", "CotacaoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/cotacao?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COTACAOSERVICE_WSDL_LOCATION = url;
        COTACAOSERVICE_EXCEPTION = e;
    }

    public CotacaoService() {
        super(__getWsdlLocation(), COTACAOSERVICE_QNAME);
    }

    public CotacaoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COTACAOSERVICE_QNAME, features);
    }

    public CotacaoService(URL wsdlLocation) {
        super(wsdlLocation, COTACAOSERVICE_QNAME);
    }

    public CotacaoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COTACAOSERVICE_QNAME, features);
    }

    public CotacaoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CotacaoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Cotacao
     */
    @WebEndpoint(name = "CotacaoPort")
    public Cotacao getCotacaoPort() {
        return super.getPort(new QName("http://cotacao/", "CotacaoPort"), Cotacao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Cotacao
     */
    @WebEndpoint(name = "CotacaoPort")
    public Cotacao getCotacaoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cotacao/", "CotacaoPort"), Cotacao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COTACAOSERVICE_EXCEPTION!= null) {
            throw COTACAOSERVICE_EXCEPTION;
        }
        return COTACAOSERVICE_WSDL_LOCATION;
    }

}
