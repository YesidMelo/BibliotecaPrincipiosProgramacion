package PatronesEstructurales.pesoligero.patron;

public class Linea implements ILineaLigera {
	
	private String color;
	public Linea(String color) {
		this.color = color;
	}

	@Override
	public String getColor() { return color; }

	@Override
	public void dibujar(int col, int fila) {
		System.out.println(String.format("Dibujando linea de color [%s] en [%s,%s]",color,fila,col));
	}

}
