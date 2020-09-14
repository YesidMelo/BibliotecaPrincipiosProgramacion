package PatronesEstructurales.Adapter.patron;

import java.util.Date;

public class PersonaVieja implements IPersonaVieja {

	private String Nombre;
	private String Apellido;
	private Date fechaNacimiento;
	
	@Override
	public String getNombre() { return Nombre;}

	@Override
	public void setNombre(String nombre) { this.Nombre = nombre; }

	@Override
	public String getApellido() { return Apellido;	}

	@Override
	public void setApellido(String apellido) { this.Apellido = apellido; }

	@Override
	public Date getFechaNacimiento() { return fechaNacimiento;}

	@Override
	public void setFechaNacimieto(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

}
