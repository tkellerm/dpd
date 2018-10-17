package de.abas.dpd.webservice.login;

import java.rmi.RemoteException;
import java.util.Iterator;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;

import com.dpd.common.ws.loginservice.v2_0.AuthenticationFaultMsg;
import com.dpd.common.ws.loginservice.v2_0.LoginService;
import com.dpd.common.ws.loginservice.v2_0.LoginServicePublic20;
import com.dpd.common.ws.loginservice.v2_0.types.Login;

public class LoginService20_getAuth {

	private static Logger logger = Logger.getLogger(LoginService20_getAuth.class);

	public static void main(String[] args) throws RemoteException {

		LoginServicePublic20 myApiSoapClient = new com.dpd.common.ws.loginservice.v2_0.LoginServicePublic20();
		LoginService myLogin = myApiSoapClient.getLoginService20SOAP();
		Iterator<QName> ports = myApiSoapClient.getPorts();

		try {
			Login auth = myLogin.getAuth("sandboxdpd", "xMmshh1", "de_DE");
			System.out.println(auth.getAuthToken());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			if (ex instanceof AuthenticationFaultMsg) {
				System.out.println("FAULT CODE: " + ((AuthenticationFaultMsg) ex).getFaultInfo().getErrorCode());
				System.out.println("FAULT STRING: " + ((AuthenticationFaultMsg) ex).getFaultInfo().getErrorMessage());
			}

		}
	}

	public static String getAuthentificationToken(String delisID, String passwort, String locale)
			throws AuthenticationFaultMsg {
		String token = "";

		LoginServicePublic20 myApiSoapClient = new com.dpd.common.ws.loginservice.v2_0.LoginServicePublic20();
		LoginService myLogin = myApiSoapClient.getLoginService20SOAP();
		Iterator<QName> ports = myApiSoapClient.getPorts();

		try {
			Login auth = myLogin.getAuth(delisID, passwort, locale);
			token = auth.getAuthToken();

		} catch (AuthenticationFaultMsg ex) {
			logger.error(ex);

			System.out.println(ex.getMessage());

			System.out.println("FAULT CODE: " + ((AuthenticationFaultMsg) ex).getFaultInfo().getErrorCode());
			System.out.println("FAULT STRING: " + ((AuthenticationFaultMsg) ex).getFaultInfo().getErrorMessage());
			throw ex;

		}

		return token;

	}

	public static Login getAuth(String delisID, String passwort, String locale) throws AuthenticationFaultMsg {
		Login auth = null;

		LoginServicePublic20 myApiSoapClient = new com.dpd.common.ws.loginservice.v2_0.LoginServicePublic20();
		LoginService myLogin = myApiSoapClient.getLoginService20SOAP();
		Iterator<QName> ports = myApiSoapClient.getPorts();

		try {
			auth = myLogin.getAuth(delisID, passwort, locale);

		} catch (AuthenticationFaultMsg ex) {
			logger.error(ex);

			System.out.println(ex.getMessage());

			System.out.println("FAULT CODE: " + ((AuthenticationFaultMsg) ex).getFaultInfo().getErrorCode());
			System.out.println("FAULT STRING: " + ((AuthenticationFaultMsg) ex).getFaultInfo().getErrorMessage());
			throw ex;

		}

		return auth;

	}

}
