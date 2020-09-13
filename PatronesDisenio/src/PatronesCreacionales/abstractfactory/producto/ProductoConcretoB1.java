package PatronesCreacionales.abstractfactory.producto;

public class ProductoConcretoB1 implements ProductoAbstractoB {

	@Override
	public String nombreProducto() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

}
