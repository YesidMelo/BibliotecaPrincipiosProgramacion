package PatronesCreacionales.Prototype.prototipoCamisetas;

public class CamisetaMLarga extends Camiseta {

	public CamisetaMLarga(String talla, String color) {
		super(talla, color, "Larga", "looney toons");
	}

	@Override
	public Camiseta clone() {
		// TODO Auto-generated method stub
		return new CamisetaMLarga("Grande", "azul");
	}

}
