package abstractfactory;

import abstractfactory.fabrica.FabricaAbstracta;
import abstractfactory.fabrica.FabricaConcreta1;
import abstractfactory.fabrica.FabricaConcreta2;
import abstractfactory.producto.ProductoAbstractoA;
import abstractfactory.producto.ProductoAbstractoB;

public class PrincipalAbstractFactory {
	
	/**
	 * Proposito:  
	 * Proporciona un a interfaz para crear familias de objetos relacionados 
	 * o que dependen entre si sin especificar clases concretas
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FabricaAbstracta fabrica = generarFabrica(ObjetosDisponibles.PRODUCTOS_TIPO2);
		ProductoAbstractoA productoA = fabrica.productoA();
		ProductoAbstractoB productoB = fabrica.productoB();
		
		System.out.print(String.format("ProductoA : %s \nProductoB : %s", productoA.nombreProducto(),productoB.nombreProducto()));
		
	}
	
	private static FabricaAbstracta generarFabrica(ObjetosDisponibles tipo) {
		switch (tipo) {
			case PRODUCTOS_TIPO1: {
				return new FabricaConcreta1();
			}
			case PRODUCTOS_TIPO2:{
				return new FabricaConcreta2();
				}
			default :{
				return new FabricaConcreta1();
			}
		}
		 
	}
	
	enum ObjetosDisponibles{
		PRODUCTOS_TIPO1,
		PRODUCTOS_TIPO2
		;
	}

}
