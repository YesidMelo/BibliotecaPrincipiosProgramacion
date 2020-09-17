package PatronesEstructurales.Puente;

import PatronesEstructurales.Puente.patron.EmpresaMensajeria;
import PatronesEstructurales.Puente.patron.EnvioMar;
import PatronesEstructurales.Puente.patron.EuroTransport;

/**
 * Proposito:
 * Desacopla una abstraccion de una implementacion, de modo que ambas puedan variar de manera independiente
 * @author Yesid
 *
 * Aplicabilidad
 * 1. quiere evitar un enlace permanente entre una abstraccion y su implementacion por ejemplo, cuando debe seleccionarse
 *    o cambiarse la implementacion en tiempo de ejecucion
 * 2. tanto abstracciones como sus implementaciones deberian ser extencianes mediante sus subclases
 * 
 *     
 *     codigo fuente https://programacion.net/articulo/patrones_de_diseno_viii_patrones_estructurales_bridge_1010
 */

public class PrincipalPuente {

	public static void main(String[] args) {
		
		EmpresaMensajeria mensajero = new EuroTransport("123456789");
		mensajero.recogerPaquete();
		mensajero.enviarPaquete();
		mensajero.entregarPaquete();
		
		mensajero.setEnvio(new EnvioMar());
		mensajero.recogerPaquete();
		mensajero.enviarPaquete();
		mensajero.entregarPaquete();

	}

}
