package PatronesEstructurales.Composite.patron;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Empleado {

	private String nombre;
	private List<Empleado> empleados = new ArrayList<>();
	
	public Manager(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void adicionarEmpleado(Empleado e) {
		if(e == null ) { return; }
		this.empleados.add(e);
	}

	@Override
	public void removerEmpleado(Empleado e) {
		if(e == null ) { return; }
		this.empleados.remove(e);
	}

	@Override
	public List<Empleado> listaEmpleados() {
		return empleados;
	}

	@Override
	public int calcularPuntos() {
		if(this.empleados.isEmpty()) { return 0; }
		
		return Math.round(
				this.empleados.stream().mapToInt(e ->{
					System.out.println(e);
					return e.calcularPuntos();
				}).sum());
	}

}
