package PatronesEstructurales.Puente.patron;

public abstract class EmpresaMensajeria {
	
	protected IEnvio envio;
	
	public EmpresaMensajeria(IEnvio envio) { this.envio = envio;	}
	
	public void recogerPaquete() {
		System.out.println("Se ha recogido el paquete");
		envio.procesarEnvio();
	}
	
	public void enviarPaquete() {
		envio.enviar();
	}
	
	public void entregarPaquete() {
		envio.procesarEntrega();
		System.out.println("Se ha entregado el paquete");
	}
	
	public void setEnvio(IEnvio envio) {
		this.envio = envio;
	}
	
	public IEnvio getEnvio() {
		return envio;
	}
	
}
