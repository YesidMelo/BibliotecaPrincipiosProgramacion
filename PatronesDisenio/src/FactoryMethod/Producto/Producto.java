package FactoryMethod.Producto;

public abstract class Producto {
	
	private String id;
	private int valor;
		
	public abstract String nombreProducto();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
