package PatronesCreacionales.abstractfactory.fabrica;

import PatronesCreacionales.abstractfactory.producto.ProductoAbstractoA;
import PatronesCreacionales.abstractfactory.producto.ProductoAbstractoB;
import PatronesCreacionales.abstractfactory.producto.ProductoConcretoA2;
import PatronesCreacionales.abstractfactory.producto.ProductoConcretoB2;

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
