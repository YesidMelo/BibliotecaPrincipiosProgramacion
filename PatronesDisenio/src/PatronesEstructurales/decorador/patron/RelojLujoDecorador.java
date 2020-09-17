package PatronesEstructurales.decorador.patron;

public class RelojLujoDecorador extends DecoradorReloj {

	public RelojLujoDecorador(Reloj reloj) { super(reloj); }
	
	@Override
	public void crearFuncionalidad() { 
		super.crearFuncionalidad();
		
		System.out.print(" y mas caracteristicas reloj de lujo : ");
		adicionarCargaRapida();
		adicionarImpermeabilidad();
		adicionarNFC();
		
	}
	
	private void adicionarCargaRapida() {
		System.out.print(" Carga rapida ");
	}
	
	private void adicionarImpermeabilidad() {
		System.out.print(" Impermeabilidad ");
	}
	
	private void adicionarNFC() {
		System.out.print(" NFC ");
	}
	
	

}
