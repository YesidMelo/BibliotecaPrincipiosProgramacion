package PatronesEstructurales.Puente.patron;

public class EnvioAire implements IEnvio {

	@Override
	public void procesarEnvio() {
		System.out.println("el paquete se ha cargado en el avion");
	}

	@Override
	public void enviar() {
		System.out.println("el paquete va volando por el aire");

	}

	@Override
	public void procesarEntrega() {
		System.out.println("el paquete se ha descargado del avion");

	}

}
