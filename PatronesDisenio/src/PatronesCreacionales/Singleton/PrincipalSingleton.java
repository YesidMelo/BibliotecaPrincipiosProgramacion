package PatronesCreacionales.Singleton;


/**
 * Proposito
 * Garantiza que una clase tena una unica instancia y crea un punto de acceso global a ella
 * 
 * Aplicabilidad:
 * 1. debe haber exactamente una unica instancia de clase y esta debe ser accesible a los clientes desde un punto desconocido
 * 2. la unica instancia deberia ser extencible mediante herencia y los cliente deberian ser capaces de usar una instancia extendida
 * 	  sin modificar su codigo
 * @author Yesid
 *
 */
public class PrincipalSingleton {
	
	public static void main(String []args) {
		ObjetoSingleton obj = ObjetoSingleton.traerInstancia();
		ObjetoSingleton obj1 = ObjetoSingleton.traerInstancia();
		
		
		obj.conMensaje("Hola mundo desde obj");
		System.out.println(obj1.generarMensaje());
		
		obj1.conMensaje("Hola mundo desde obj1");
		System.out.println(obj.generarMensaje());
	}
}
