package PatronesCreacionales.Prototype.prototipoCamisetas;

public class CamisetaMCorta extends Camiseta {

	public CamisetaMCorta(String talla, String color) {
		super(talla, color, "Corta", "Animatos");
	}

	@Override
	public Camiseta clone() {
		return new CamisetaMCorta("Pequeña", "verde");
	}

}
