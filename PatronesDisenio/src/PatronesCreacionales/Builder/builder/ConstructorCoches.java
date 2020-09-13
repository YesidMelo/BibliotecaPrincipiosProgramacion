package PatronesCreacionales.Builder.builder;

//constructor abstracto
public abstract class ConstructorCoches {
	protected Coche coche;
	
	public void nuevo() { coche = new Coche(); }
	
	public Coche obtenerCoche() { return coche;	}
	
	public abstract void construirMotor();
	
	public abstract void construirCarroceria();
	
}
