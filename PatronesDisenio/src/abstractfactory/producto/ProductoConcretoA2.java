package abstractfactory.producto;

public class ProductoConcretoA2 implements ProductoAbstractoA {

	@Override
	public String nombreProducto() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

}
