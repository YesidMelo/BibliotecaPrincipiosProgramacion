package PatronesEstructurales.Composite;

import PatronesEstructurales.Composite.patron.Developer;
import PatronesEstructurales.Composite.patron.Empleado;
import PatronesEstructurales.Composite.patron.Manager;

/**
 * Proposito:
 * Compone objetos en estructuras de arbol para representar jerarquias de parteTodo. 
 * permite que los clientes traten de manera uniforme los objetos individuales y compuestos
 * 
 * 
 * Aplicabilidad:
 * 1. quiera representar jeraquias de objetos parte-todo
 * 2. quiera que los clientes sean capaces de obviar las diferencias entre composiciones
 *    de objetos y los objetos individuales. los clientes trataran a todos los objetos de la
 *    estructura compuesta de manera uniforme
 *    
 *    codigo ejemplo
 *    https://experto.dev/patron-de-diseno-java-composite/
 * @author Yesid
 *
 */

public class PrincipalComposite {

	public static void main(String[] args) {
		
		Empleado m1 = new Manager("marc");
		
		Empleado d1 = new Developer("d1");
		Empleado d2 = new Developer("d2");
		Empleado d3 = new Developer("d3");
		
		m1.adicionarEmpleado(d1);
		m1.adicionarEmpleado(d2);
		m1.adicionarEmpleado(d3);
		
		Empleado m2 = new Manager("M2");
		
		Empleado d4 = new Developer("d4");
		Empleado d5 = new Developer("d5");
		Empleado d6 = new Developer("d6");
		
		m2.adicionarEmpleado(d4);
		m2.adicionarEmpleado(d5);
		m2.adicionarEmpleado(d6);
		
		m1.calcularPuntos();
		m2.calcularPuntos();
		
	}

}
