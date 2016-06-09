
package random;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the random package. 
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

    private final static QName _GeraRandom_QNAME = new QName("http://random/", "geraRandom");
    private final static QName _GeraRandomResponse_QNAME = new QName("http://random/", "geraRandomResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: random
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeraRandom }
     * 
     */
    public GeraRandom createGeraRandom() {
        return new GeraRandom();
    }

    /**
     * Create an instance of {@link GeraRandomResponse }
     * 
     */
    public GeraRandomResponse createGeraRandomResponse() {
        return new GeraRandomResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeraRandom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://random/", name = "geraRandom")
    public JAXBElement<GeraRandom> createGeraRandom(GeraRandom value) {
        return new JAXBElement<GeraRandom>(_GeraRandom_QNAME, GeraRandom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeraRandomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://random/", name = "geraRandomResponse")
    public JAXBElement<GeraRandomResponse> createGeraRandomResponse(GeraRandomResponse value) {
        return new JAXBElement<GeraRandomResponse>(_GeraRandomResponse_QNAME, GeraRandomResponse.class, null, value);
    }

}
