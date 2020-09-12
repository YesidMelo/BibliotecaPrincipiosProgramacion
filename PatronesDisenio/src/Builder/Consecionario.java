package Builder;

import Builder.builder.Coche;
import Builder.builder.ConstructorCoches;

/**
 * Director del patron
 * intermediario entre el usuario de los constructores y los constructores
 * @author Yesid
 *
 */
public class Consecionario {
	
	private ConstructorCoches constructorCoches;
	
	public void establecerConstructorCoches(ConstructorCoches constructorCoches) { this.constructorCoches = constructorCoches; }
	
	public Coche obtenerCoche() {return constructorCoches.obtenerCoche(); }
	
	public void construirCoche() {
		constructorCoches.nuevo();
		constructorCoches.construirCarroceria();
		constructorCoches.construirMotor();
	}

}
