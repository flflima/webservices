
package cotacao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cotacao package. 
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

    private final static QName _VerificarCotacaoResponse_QNAME = new QName("http://cotacao/", "verificarCotacaoResponse");
    private final static QName _VerificarCotacao_QNAME = new QName("http://cotacao/", "verificarCotacao");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cotacao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VerificarCotacao }
     * 
     */
    public VerificarCotacao createVerificarCotacao() {
        return new VerificarCotacao();
    }

    /**
     * Create an instance of {@link VerificarCotacaoResponse }
     * 
     */
    public VerificarCotacaoResponse createVerificarCotacaoResponse() {
        return new VerificarCotacaoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarCotacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cotacao/", name = "verificarCotacaoResponse")
    public JAXBElement<VerificarCotacaoResponse> createVerificarCotacaoResponse(VerificarCotacaoResponse value) {
        return new JAXBElement<VerificarCotacaoResponse>(_VerificarCotacaoResponse_QNAME, VerificarCotacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarCotacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cotacao/", name = "verificarCotacao")
    public JAXBElement<VerificarCotacao> createVerificarCotacao(VerificarCotacao value) {
        return new JAXBElement<VerificarCotacao>(_VerificarCotacao_QNAME, VerificarCotacao.class, null, value);
    }

}
