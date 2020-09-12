package Builder.builder;

public class ConstructorCochesTesla extends ConstructorCoches {


	@Override
	public void construirMotor() { coche.potencia(560); }

	@Override
	public void construirCarroceria() { coche.tipo("Tesla 47").numero_asientos(5); }

}
