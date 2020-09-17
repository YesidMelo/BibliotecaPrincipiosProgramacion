package PatronesEstructurales.Composite.patron;

import java.util.List;

public interface Empleado {
	
	String getNombre();
	void adicionarEmpleado(Empleado e);
	void removerEmpleado(Empleado e);
	List<Empleado> listaEmpleados();
	int calcularPuntos();
	
}
