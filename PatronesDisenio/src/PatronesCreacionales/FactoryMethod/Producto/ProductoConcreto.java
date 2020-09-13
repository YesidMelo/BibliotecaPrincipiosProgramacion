package PatronesCreacionales.FactoryMethod.Producto;

public class ProductoConcreto extends Producto {

	@Override
	public String nombreProducto() {
		return this.getClass().getSimpleName();
	}

	
}
