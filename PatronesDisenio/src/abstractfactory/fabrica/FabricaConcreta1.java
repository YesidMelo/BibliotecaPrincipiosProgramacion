package abstractfactory.fabrica;

import abstractfactory.producto.ProductoAbstractoA;
import abstractfactory.producto.ProductoAbstractoB;
import abstractfactory.producto.ProductoConcretoA1;
import abstractfactory.producto.ProductoConcretoB1;

public class FabricaConcreta1 implements FabricaAbstracta {

	@Override
	public ProductoAbstractoA productoA() {
		// TODO Auto-generated method stub
		return new ProductoConcretoA1();
	}

	@Override
	public ProductoAbstractoB productoB() {
		// TODO Auto-generated method stub
		return new ProductoConcretoB1();
	}

}
