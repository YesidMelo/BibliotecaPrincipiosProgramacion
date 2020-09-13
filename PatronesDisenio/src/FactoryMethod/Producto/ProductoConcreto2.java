package FactoryMethod.Producto;

public class ProductoConcreto2 extends Producto {

	@Override
	public String nombreProducto() {
		return this.getClass().getSimpleName();
	}

}
