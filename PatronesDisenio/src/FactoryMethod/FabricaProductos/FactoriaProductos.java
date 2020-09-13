package FactoryMethod.FabricaProductos;

import FactoryMethod.Producto.Producto;
import FactoryMethod.Producto.ProductoConcreto;
import FactoryMethod.Producto.ProductoConcreto2;

public class FactoriaProductos {
	
	public enum ProductosDisponibles {
		ProductoConcreto1,
		ProductoConcreto2,
		;
	}
	
	public Producto generarProducto(ProductosDisponibles productoDisponible) {
		Producto productoGenerado;
		switch (productoDisponible) {
			case ProductoConcreto1: {
				productoGenerado = new ProductoConcreto();
				break;
			}
			case ProductoConcreto2 : {
				productoGenerado = new ProductoConcreto2();
			}
			
			default:
				productoGenerado = new ProductoConcreto();
				break;
			}
		
		return productoGenerado;
	}
}
