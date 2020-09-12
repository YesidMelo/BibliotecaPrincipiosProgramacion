package Builder.builder;

public class ConstructorCochesBMW extends ConstructorCoches {

	@Override
	public void construirMotor() { coche.cilindrada(4395).potencia(560); }

	@Override
	public void construirCarroceria() { coche.tipo("BMW 47").numero_asientos(5); }

}
