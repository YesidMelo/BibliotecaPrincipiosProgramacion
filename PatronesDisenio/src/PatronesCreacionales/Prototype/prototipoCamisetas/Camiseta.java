package PatronesCreacionales.Prototype.prototipoCamisetas;

public abstract class Camiseta {
	
	private String talla;
	private String color;
	private String manga;
	private String estampado;
	
	public Camiseta(
			String talla,
			String color,
			String manga,
			String estampado	
	) {
		this.setTalla(talla);
		this.setColor(color);
		this.setManga(manga);
		this.setEstampado(estampado);
	}
	
	public String traerDetalleCamiseta() {
		return String.format("Talla : %s\nColor : %s\nManga: %s\nEstampado: %s", talla,color,manga,estampado);
	}
	
	
	public abstract Camiseta clone();


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getTalla() {
		return talla;
	}


	public void setTalla(String talla) {
		this.talla = talla;
	}


	public String getManga() {
		return manga;
	}


	public void setManga(String manga) {
		this.manga = manga;
	}


	public String getEstampado() {
		return estampado;
	}


	public void setEstampado(String estampado) {
		this.estampado = estampado;
	} 
}
