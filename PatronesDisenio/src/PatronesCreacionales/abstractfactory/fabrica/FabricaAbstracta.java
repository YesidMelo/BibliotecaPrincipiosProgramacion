package PatronesCreacionales.abstractfactory.fabrica;

import PatronesCreacionales.abstractfactory.producto.ProductoAbstractoA;
import PatronesCreacionales.abstractfactory.producto.ProductoAbstractoB;

public interface FabricaAbstracta {
	public ProductoAbstractoA productoA();
	public ProductoAbstractoB productoB();
}
