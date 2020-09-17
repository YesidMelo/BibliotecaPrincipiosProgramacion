package PatronesEstructurales.decorador.patron;

public class RelojDeportivoDecorador extends DecoradorReloj {

	public RelojDeportivoDecorador(Reloj reloj) {
		super(reloj);
	}
	
	@Override
	public void crearFuncionalidad() {
		super.crearFuncionalidad();
		
		System.out.print(" y mas caracteristicas (reloj deportivo): ");
		adicionaPodometro();
		adicionaModoSuenio();
	}
	
	private void adicionaPodometro() {
		System.out.print(" Podometro ");
	}
	
	private void adicionaModoSuenio() {
		System.out.print(" Modo Suenio ");
	}

}
