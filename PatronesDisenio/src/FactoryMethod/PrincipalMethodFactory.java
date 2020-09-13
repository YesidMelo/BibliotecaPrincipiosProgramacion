package FactoryMethod;

import FactoryMethod.FabricaProductos.FactoriaProductos;
import FactoryMethod.Producto.Producto;

/**
 * Proposito: 
 * Define una interfaz para crear un objeto, pero deja que sean las subclases quienes decidan que clase
 * instanciar. Permite que una clase delegue a sus subclases la creacion  de objetos
 * 
 * Aplicabilidad:
 * 1. una clase no puede prever la clase objeto que debe crear
 * 2. una clase quiere que sean sus subclases especifiquen los objetos que esta crea
 * 3. las clases delegan la responsibilidad a una de entre varios clase auxiliares y queremos localizar que que subclase
 *    auxiliar concreta es en la que se delega
 *    
 * 
 * @author Yesid
 *
 */

public class PrincipalMethodFactory {

	public static void main(String[] args) {
		FactoriaProductos factoria = new FactoriaProductos();
		
		Producto producto = factoria.generarProducto(FactoriaProductos.ProductosDisponibles.ProductoConcreto1);
		producto.setId("No1");
		producto.setValor(100);
		
		System.out.print(String.format("%s id : %s valor : $%s", producto.nombreProducto(),producto.getId(),producto.getValor()));
		
	}

}
