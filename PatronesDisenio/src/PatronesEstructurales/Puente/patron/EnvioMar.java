package PatronesEstructurales.Puente.patron;

public class EnvioMar implements IEnvio {

	@Override
	public void procesarEnvio() {
		System.out.println("el paquete se ha cargado en el barco");
	}

	@Override
	public void enviar() {
		System.out.println("el paquete va navegando por el mar");

	}

	@Override
	public void procesarEntrega() {
		System.out.println("el paquete se ha descargado del barco");

	}

}
