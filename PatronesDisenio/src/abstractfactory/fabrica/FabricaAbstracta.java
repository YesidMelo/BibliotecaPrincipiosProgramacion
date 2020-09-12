package abstractfactory.fabrica;

import abstractfactory.producto.ProductoAbstractoA;
import abstractfactory.producto.ProductoAbstractoB;

public interface FabricaAbstracta {
	public ProductoAbstractoA productoA();
	public ProductoAbstractoB productoB();
}
