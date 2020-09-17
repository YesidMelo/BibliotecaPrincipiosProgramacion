package PatronesEstructurales.decorador.patron;

public class DecoradorReloj implements Reloj {
	
	private Reloj reloj;
	
	public DecoradorReloj(Reloj reloj) {
		this.reloj = reloj;
	}

	@Override
	public void crearFuncionalidad() {
		this.reloj.crearFuncionalidad();
	}

}
