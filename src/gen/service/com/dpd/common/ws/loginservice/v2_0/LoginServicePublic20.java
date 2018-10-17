package com.dpd.common.ws.loginservice.v2_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-10-01T11:06:56.761+02:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "LoginService-Public_2_0",
                  wsdlLocation = "file:/C:/Users/tkellermann/Documents/git/DPD/src/main/resources/wsdl-Files/login.wsdl",
                  targetNamespace = "http://dpd.com/common/service/LoginService/2.0")
public class LoginServicePublic20 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://dpd.com/common/service/LoginService/2.0", "LoginService-Public_2_0");
    public final static QName LoginService20SOAP = new QName("http://dpd.com/common/service/LoginService/2.0", "LoginService_2_0_SOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/tkellermann/Documents/git/DPD/src/main/resources/wsdl-Files/login.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LoginServicePublic20.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/tkellermann/Documents/git/DPD/src/main/resources/wsdl-Files/login.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LoginServicePublic20(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LoginServicePublic20(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoginServicePublic20() {
        super(WSDL_LOCATION, SERVICE);
    }

    public LoginServicePublic20(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public LoginServicePublic20(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public LoginServicePublic20(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns LoginService
     */
    @WebEndpoint(name = "LoginService_2_0_SOAP")
    public LoginService getLoginService20SOAP() {
        return super.getPort(LoginService20SOAP, LoginService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoginService
     */
    @WebEndpoint(name = "LoginService_2_0_SOAP")
    public LoginService getLoginService20SOAP(WebServiceFeature... features) {
        return super.getPort(LoginService20SOAP, LoginService.class, features);
    }

}