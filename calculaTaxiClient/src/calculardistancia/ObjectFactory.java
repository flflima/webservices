
package calculardistancia;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the calculardistancia package. 
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

    private final static QName _CalcularDistancia_QNAME = new QName("http://calcularDistancia/", "calcularDistancia");
    private final static QName _CalcularDistanciaResponse_QNAME = new QName("http://calcularDistancia/", "calcularDistanciaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: calculardistancia
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularDistancia }
     * 
     */
    public CalcularDistancia createCalcularDistancia() {
        return new CalcularDistancia();
    }

    /**
     * Create an instance of {@link CalcularDistanciaResponse }
     * 
     */
    public CalcularDistanciaResponse createCalcularDistanciaResponse() {
        return new CalcularDistanciaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularDistancia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcularDistancia/", name = "calcularDistancia")
    public JAXBElement<CalcularDistancia> createCalcularDistancia(CalcularDistancia value) {
        return new JAXBElement<CalcularDistancia>(_CalcularDistancia_QNAME, CalcularDistancia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularDistanciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcularDistancia/", name = "calcularDistanciaResponse")
    public JAXBElement<CalcularDistanciaResponse> createCalcularDistanciaResponse(CalcularDistanciaResponse value) {
        return new JAXBElement<CalcularDistanciaResponse>(_CalcularDistanciaResponse_QNAME, CalcularDistanciaResponse.class, null, value);
    }

}
