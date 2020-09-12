package abstractfactory.fabrica;

import abstractfactory.producto.ProductoAbstractoA;
import abstractfactory.producto.ProductoAbstractoB;
import abstractfactory.producto.ProductoConcretoA2;
import abstractfactory.producto.ProductoConcretoB2;

public class FabricaConcreta2 implements FabricaAbstracta {

	@Override
	public ProductoAbstractoA productoA() {
		// TODO Auto-generated method stub
		return new ProductoConcretoA2();
	}

	@Override
	public ProductoAbstractoB productoB() {
		// TODO Auto-generated method stub
		return new ProductoConcretoB2();
	}

}
