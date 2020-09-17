package PatronesEstructurales.decorador.patron;

public class RelojBasico implements Reloj {

	@Override
	public void crearFuncionalidad() {
		System.out.println(" Reloj basico con: ");
		adicionarContadorTiempo();
	}
	
	private void adicionarContadorTiempo() {
		System.out.print(" Contador tiempo ");
	}

}
