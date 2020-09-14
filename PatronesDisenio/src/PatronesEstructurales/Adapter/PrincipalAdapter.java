package PatronesEstructurales.Adapter;

import java.util.Date;
import java.util.GregorianCalendar;

import PatronesEstructurales.Adapter.patron.AdaptadorPersonaViejaANueva;
import PatronesEstructurales.Adapter.patron.PersonaVieja;

/**
 * Proposito:
 * Convierte la interfaz de una clase en otras interfaz que es la que esperan los clientes.Permite que cooperen
 * clases que de otra forma no podrian poner interfaces incompatibles,
 * 
 * 
 * 
 * Aplicabilidad
 * 1. se quiere que una clase existente y su interfaz no concuerda con la que necesita.
 * 2. se quiere crear una clase reutilizable que coopere con clases no relacionadas o que no han sido previstas, es decir
 *    clases que no tienen porque tener interfaces compatibles 
 * 3. (solamente en el caso de un adaptador de objetos ) es necesario usar varias subclases existentes pero no resulta practico
 *    adaptar su interfaz heredando de cada una de ellas. un adaptador de objetos. puede adaptar la interfaz de su clase padre. 
 *    
 *      Ejemplo de https://www.arquitecturajava.com/java-adapter-pattern-y-su-utilidad/
 *      libro patrones de diseño gamma
 * @author Yesid
 *
 */
public class PrincipalAdapter {

	public static void main(String[] args) {
		
		PersonaVieja personaVieja = new PersonaVieja();
		personaVieja.setApellido("Perez");
		personaVieja.setNombre("Maxi");
		
		GregorianCalendar g = new GregorianCalendar();
		g.set(2000,01,01);
		
		Date d = g.getTime();
		personaVieja.setFechaNacimieto(d);
		
		AdaptadorPersonaViejaANueva personaNueva= new AdaptadorPersonaViejaANueva(personaVieja);
		
		System.out.println(personaNueva.getEdad());
		System.out.println(personaNueva.getNombre());
		
		personaNueva.setEdad(10);
		personaNueva.setNombre("Juan perez");
		
		System.out.println(personaNueva.getEdad());
		System.out.println(personaNueva.getNombre());
		

	}

}
