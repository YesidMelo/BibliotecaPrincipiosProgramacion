package PatronesEstructurales.Proxy;

import PatronesEstructurales.Proxy.patron.ProxyBatchProcess;

/**
 * Proposito : 
 * Proporciona un representante o sustituto de otro objeto para controlar el acceso a este
 * 
 * Aplicabilidad:
 * 
 * Este patron es aplicable cada vez que hay necesidad  de una referencia  a un objeto versatil o sofisticado
 * que un simple puntero. 
 * 
 * codigo fuente : 	
 * https://experto.dev/patron-de-diseno-proxy-en-java/
 * @author Yesid
 *
 */

public class Principal {

	public static void main(String[] args) {
		
		(new ProxyBatchProcess("documento")).process();

	}

}
