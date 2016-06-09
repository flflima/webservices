
package precogasolina;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the precogasolina package. 
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

    private final static QName _ObterPrecoGasolina_QNAME = new QName("http://precoGasolina/", "obterPrecoGasolina");
    private final static QName _ObterPrecoGasolinaResponse_QNAME = new QName("http://precoGasolina/", "obterPrecoGasolinaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: precogasolina
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObterPrecoGasolinaResponse }
     * 
     */
    public ObterPrecoGasolinaResponse createObterPrecoGasolinaResponse() {
        return new ObterPrecoGasolinaResponse();
    }

    /**
     * Create an instance of {@link ObterPrecoGasolina }
     * 
     */
    public ObterPrecoGasolina createObterPrecoGasolina() {
        return new ObterPrecoGasolina();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterPrecoGasolina }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://precoGasolina/", name = "obterPrecoGasolina")
    public JAXBElement<ObterPrecoGasolina> createObterPrecoGasolina(ObterPrecoGasolina value) {
        return new JAXBElement<ObterPrecoGasolina>(_ObterPrecoGasolina_QNAME, ObterPrecoGasolina.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterPrecoGasolinaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://precoGasolina/", name = "obterPrecoGasolinaResponse")
    public JAXBElement<ObterPrecoGasolinaResponse> createObterPrecoGasolinaResponse(ObterPrecoGasolinaResponse value) {
        return new JAXBElement<ObterPrecoGasolinaResponse>(_ObterPrecoGasolinaResponse_QNAME, ObterPrecoGasolinaResponse.class, null, value);
    }

}
