package PatronesEstructurales.Puente.patron;

public class EuroTransport extends EmpresaMensajeria {

	
	
	private String nif;
	private static IEnvio envioPorDefecto = new EnvioAire();
	
	public EuroTransport(String nif) {
		super(envioPorDefecto);
		this.nif = nif;
	}
	
	public EuroTransport(String nif,IEnvio envio) {
		super(envio);
		this.nif = nif;
	}
	
	public void identificarse() {
		System.out.println("Identificacion : "+this.nif);
	}

}
