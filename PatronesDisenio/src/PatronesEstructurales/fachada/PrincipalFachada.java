package PatronesEstructurales.fachada;

import PatronesEstructurales.fachada.patron.Mobile;
import PatronesEstructurales.fachada.patron.MobileFacade;

/**
 * Proposito;
 * Proporciona una interfaz unificada para un conjunto de interfaces de un subsistema.
 * define una interfaz de alto nivel que hace que el subsitema sea mas facil de usar
 * 
 * Aplicabilidad 
 * 1. queremos usar una interface simple para un subsistema complejo
 * 2.hay muchas dependencias entre clientes y clases que usan una abstraccion
 * 3. queremos subdividir en capas nuestro subsistema 
 * @author Yesid
 *
 */

public class PrincipalFachada {

	public static void main(String[] args) {
		MobileFacade mobileFacade = new MobileFacade();
		Mobile mobile = mobileFacade.on();
		System.out.println("\n------------------------");
		mobileFacade.off(mobile);
	}

}
