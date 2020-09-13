package PatronesCreacionales.Builder.builder;

public class ConstructorCochesAudi extends ConstructorCoches {

	@Override
	public void construirMotor() { coche.cilindrada(2995).potencia(300); }

	@Override
	public void construirCarroceria() { coche.tipo("Audi 47").numero_asientos(5); }

}


