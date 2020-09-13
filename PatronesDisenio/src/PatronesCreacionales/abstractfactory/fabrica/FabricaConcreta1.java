package PatronesCreacionales.abstractfactory.fabrica;

import PatronesCreacionales.abstractfactory.producto.ProductoAbstractoA;
import PatronesCreacionales.abstractfactory.producto.ProductoAbstractoB;
import PatronesCreacionales.abstractfactory.producto.ProductoConcretoA1;
import PatronesCreacionales.abstractfactory.producto.ProductoConcretoB1;

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
