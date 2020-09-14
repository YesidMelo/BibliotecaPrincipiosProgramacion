package PatronesEstructurales.Adapter.patron;

import java.util.GregorianCalendar;

public class AdaptadorPersonaViejaANueva implements IPersonaNueva {
	
	private IPersonaVieja personaVieja;
	public AdaptadorPersonaViejaANueva(IPersonaVieja personaVieja) { this.personaVieja = personaVieja; }

	@Override
	public String getNombre() { return String.format("%s %s", personaVieja.getNombre(),personaVieja.getApellido());	}

	@Override
	public void setNombre(String nombre) {
		
		String []nombreCompleto = nombre.split(" ");
		String Nombre = nombreCompleto[0];
		String Apellido = nombreCompleto[1];
		
		personaVieja.setNombre(Nombre);
		personaVieja.setApellido(Apellido);
		
	}

	@Override
	public int getEdad() {
		GregorianCalendar c1 = new GregorianCalendar();
		GregorianCalendar c2 = new GregorianCalendar();
		c2.setTime(personaVieja.getFechaNacimiento());
		return c1.get(1) - c2.get(1);
	}

	@Override
	public void setEdad(int edad) {
		GregorianCalendar c = new GregorianCalendar();
		int anioActual = c.get(1);
		c.set(1,anioActual - edad);
		personaVieja.setFechaNacimieto(c.getTime());

	}

}
