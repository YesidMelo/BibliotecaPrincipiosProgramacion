package PatronesEstructurales.Composite.patron;

import java.util.List;
import java.util.Random;

public class Developer implements Empleado {
	
	private String nombre;
	
	public Developer(String nombre) { this.nombre = nombre;	}

	@Override
	public String getNombre() { return nombre;	}

	@Override
	public void adicionarEmpleado(Empleado e) {}

	@Override
	public void removerEmpleado(Empleado e) {}

	@Override
	public List<Empleado> listaEmpleados() { return null ; }

	@Override
	public int calcularPuntos() {
		return (new Random()).nextInt(24);
	}
	
	@Override
	public String toString() {
		return String.format("Soy %s, desarrollador", getNombre());
	}

}
