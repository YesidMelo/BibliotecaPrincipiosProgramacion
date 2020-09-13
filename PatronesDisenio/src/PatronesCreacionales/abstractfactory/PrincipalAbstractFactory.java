package PatronesCreacionales.abstractfactory;

import PatronesCreacionales.abstractfactory.fabrica.FabricaAbstracta;
import PatronesCreacionales.abstractfactory.fabrica.FabricaConcreta1;
import PatronesCreacionales.abstractfactory.fabrica.FabricaConcreta2;
import PatronesCreacionales.abstractfactory.producto.ProductoAbstractoA;
import PatronesCreacionales.abstractfactory.producto.ProductoAbstractoB;

/**
 * Proposito:  
 * Proporciona un a interfaz para crear familias de objetos relacionados 
 * o que dependen entre si sin especificar clases concretas
 * 
 * Aplicabilidad:
 * 1. Un sistema debe ser independiente de como se crean componen o representan sus productos
 * 2. Un sistema debe ser configurado con una familia  de productos entre varios;
 * 3. Una familia de objetos producto relacionados esta diseñada para ser usada conjuntamente y es necesario hacer
 *    cumplir esta restriccion
 * 4. quiere proporcionar una biblioteca de Clases productos y solo quiere revelar sus interfaces no sus implementaciones
 * 
 */
public class PrincipalAbstractFactory {
	
	
	
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
