package PatronesCreacionales.abstractfactory.producto;

public class ProductoConcretoA1 implements ProductoAbstractoA {
	
	@Override
	public String nombreProducto() {
		return this.getClass().getSimpleName();
	}

}
