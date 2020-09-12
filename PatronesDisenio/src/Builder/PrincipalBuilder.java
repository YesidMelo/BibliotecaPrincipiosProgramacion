package Builder;

import Builder.builder.*;

public class PrincipalBuilder {
	
	/**
	 * Proposito
	 * 	Separar la construccion de un objeto complejo de su representacion 
	 * de forma que el mismo proceso de construccion pueda crear diferentes representaciones
	 * 
	 * mas contexto 
	 * https://programacion.net/articulo/patrones_de_diseno_iii_patrones_de_creacion_builder_1002
	 * 
	 * Problema :
	 * Un único proceso de construcción debe ser capaz de construir distintos objetos complejos, abstrayéndonos de los detalles particulares de cada uno de los tipos.
	 * 
	 * aplicacion 
	 * 1. Nuestro sistema trata con objetos complejos (compuestos por muchos atributos) pero el número de configuraciones es limitada.
	 * 2. El algoritmo de creación del objeto complejo puede independizarse de las partes que lo componen y del ensamblado de las mismas.
	 */
	
	public static void main(String[] args) {
		try {
			
		Consecionario director = new Consecionario();
		
		ConstructorCoches constructor = (ConstructorCoches) ConstructoresDisponibles.TESLA.traerConstructorCoches().newInstance();
		
		
		director.establecerConstructorCoches(constructor);
		director.construirCoche();
		Coche coche = director.obtenerCoche();
		
		System.out.print(String.format("detalle tipo : %s, potencia : %s", coche.getTipo(),coche.getPotencia()));
		
		}catch(Exception e) {
			
		}

	}
	
	enum ConstructoresDisponibles{
		AUDI(ConstructorCochesAudi.class),
		BMW(ConstructorCochesBMW.class),
		TESLA(ConstructorCochesTesla.class)
		;
		
		private Class contructor;
		ConstructoresDisponibles(Class constructor){
			this.contructor = constructor;
		}
		
		public Class traerConstructorCoches() {
			return this.contructor;
		}
	}

}
