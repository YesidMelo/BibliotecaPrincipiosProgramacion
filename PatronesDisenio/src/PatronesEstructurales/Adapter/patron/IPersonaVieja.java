package PatronesEstructurales.Adapter.patron;

import java.util.Date;

public interface IPersonaVieja {
	
	public String getNombre();
	public void setNombre(String nombre);
	public String getApellido();
	public void setApellido(String apellido);
	public Date getFechaNacimiento();
	public void setFechaNacimieto(Date fechaNacimiento);
	
	
}
