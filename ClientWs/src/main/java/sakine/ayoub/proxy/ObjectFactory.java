
package sakine.ayoub.proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _ListOp_QNAME = new QName("http://services.ayoub.sakine/", "listOp");
    private final static QName _MyReleve_QNAME = new QName("http://services.ayoub.sakine/", "myReleve");
    private final static QName _MyReleveResponse_QNAME = new QName("http://services.ayoub.sakine/", "myReleveResponse");
    private final static QName _Operation_QNAME = new QName("http://services.ayoub.sakine/", "operation");
    private final static QName _Releve_QNAME = new QName("http://services.ayoub.sakine/", "releve");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOp }
     * 
     * @return
     *     the new instance of {@link ListOp }
     */
    public ListOp createListOp() {
        return new ListOp();
    }

    /**
     * Create an instance of {@link MyReleve }
     * 
     * @return
     *     the new instance of {@link MyReleve }
     */
    public MyReleve createMyReleve() {
        return new MyReleve();
    }

    /**
     * Create an instance of {@link MyReleveResponse }
     * 
     * @return
     *     the new instance of {@link MyReleveResponse }
     */
    public MyReleveResponse createMyReleveResponse() {
        return new MyReleveResponse();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     * @return
     *     the new instance of {@link Operation }
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link Releve }
     * 
     * @return
     *     the new instance of {@link Releve }
     */
    public Releve createReleve() {
        return new Releve();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOp }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ayoub.sakine/", name = "listOp")
    public JAXBElement<ListOp> createListOp(ListOp value) {
        return new JAXBElement<>(_ListOp_QNAME, ListOp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyReleve }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MyReleve }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ayoub.sakine/", name = "myReleve")
    public JAXBElement<MyReleve> createMyReleve(MyReleve value) {
        return new JAXBElement<>(_MyReleve_QNAME, MyReleve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyReleveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MyReleveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ayoub.sakine/", name = "myReleveResponse")
    public JAXBElement<MyReleveResponse> createMyReleveResponse(MyReleveResponse value) {
        return new JAXBElement<>(_MyReleveResponse_QNAME, MyReleveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ayoub.sakine/", name = "operation")
    public JAXBElement<Operation> createOperation(Operation value) {
        return new JAXBElement<>(_Operation_QNAME, Operation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Releve }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Releve }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ayoub.sakine/", name = "releve")
    public JAXBElement<Releve> createReleve(Releve value) {
        return new JAXBElement<>(_Releve_QNAME, Releve.class, null, value);
    }

}
