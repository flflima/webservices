
package webservices;

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
@WebServiceClient(name = "OperacoesMatematicasService", targetNamespace = "http://webservices/", wsdlLocation = "http://localhost:8080/OperacoesMatematicas?wsdl")
public class OperacoesMatematicasService
    extends Service
{

    private final static URL OPERACOESMATEMATICASSERVICE_WSDL_LOCATION;
    private final static WebServiceException OPERACOESMATEMATICASSERVICE_EXCEPTION;
    private final static QName OPERACOESMATEMATICASSERVICE_QNAME = new QName("http://webservices/", "OperacoesMatematicasService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/OperacoesMatematicas?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPERACOESMATEMATICASSERVICE_WSDL_LOCATION = url;
        OPERACOESMATEMATICASSERVICE_EXCEPTION = e;
    }

    public OperacoesMatematicasService() {
        super(__getWsdlLocation(), OPERACOESMATEMATICASSERVICE_QNAME);
    }

    public OperacoesMatematicasService(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPERACOESMATEMATICASSERVICE_QNAME, features);
    }

    public OperacoesMatematicasService(URL wsdlLocation) {
        super(wsdlLocation, OPERACOESMATEMATICASSERVICE_QNAME);
    }

    public OperacoesMatematicasService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPERACOESMATEMATICASSERVICE_QNAME, features);
    }

    public OperacoesMatematicasService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OperacoesMatematicasService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OperacoesMatematicas
     */
    @WebEndpoint(name = "OperacoesMatematicasPort")
    public OperacoesMatematicas getOperacoesMatematicasPort() {
        return super.getPort(new QName("http://webservices/", "OperacoesMatematicasPort"), OperacoesMatematicas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperacoesMatematicas
     */
    @WebEndpoint(name = "OperacoesMatematicasPort")
    public OperacoesMatematicas getOperacoesMatematicasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "OperacoesMatematicasPort"), OperacoesMatematicas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPERACOESMATEMATICASSERVICE_EXCEPTION!= null) {
            throw OPERACOESMATEMATICASSERVICE_EXCEPTION;
        }
        return OPERACOESMATEMATICASSERVICE_WSDL_LOCATION;
    }

}
