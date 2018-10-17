
package com.dpd.common.ws.loginservice.v2_0.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dpd.common.ws.loginservice.v2_0.types package. 
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

    private final static QName _GetAuth_QNAME = new QName("http://dpd.com/common/service/types/LoginService/2.0", "getAuth");
    private final static QName _GetAuthResponse_QNAME = new QName("http://dpd.com/common/service/types/LoginService/2.0", "getAuthResponse");
    private final static QName _LoginException_QNAME = new QName("http://dpd.com/common/service/types/LoginService/2.0", "LoginException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dpd.common.ws.loginservice.v2_0.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAuth }
     * 
     */
    public GetAuth createGetAuth() {
        return new GetAuth();
    }

    /**
     * Create an instance of {@link GetAuthResponse }
     * 
     */
    public GetAuthResponse createGetAuthResponse() {
        return new GetAuthResponse();
    }

    /**
     * Create an instance of {@link LoginException }
     * 
     */
    public LoginException createLoginException() {
        return new LoginException();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dpd.com/common/service/types/LoginService/2.0", name = "getAuth")
    public JAXBElement<GetAuth> createGetAuth(GetAuth value) {
        return new JAXBElement<GetAuth>(_GetAuth_QNAME, GetAuth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dpd.com/common/service/types/LoginService/2.0", name = "getAuthResponse")
    public JAXBElement<GetAuthResponse> createGetAuthResponse(GetAuthResponse value) {
        return new JAXBElement<GetAuthResponse>(_GetAuthResponse_QNAME, GetAuthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dpd.com/common/service/types/LoginService/2.0", name = "LoginException")
    public JAXBElement<LoginException> createLoginException(LoginException value) {
        return new JAXBElement<LoginException>(_LoginException_QNAME, LoginException.class, null, value);
    }

}
