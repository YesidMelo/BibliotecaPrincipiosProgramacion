package PatronesCreacionales.Singleton;

public class ObjetoSingleton {
	
	private  ObjetoSingleton() {}
	
	public static ObjetoSingleton instancia;
	public static ObjetoSingleton traerInstancia() {
		if(instancia != null ) {
			return instancia;
		}
		instancia = new ObjetoSingleton();
		return instancia;
	}
	private String mensaje;
	public ObjetoSingleton conMensaje(String mensaje) {
		this.mensaje = mensaje;
		return this;
	}
	public String generarMensaje() {
		return String.format("El mensaje %s esta en el %s", mensaje,this.getClass().getSimpleName());
	}
	
}
