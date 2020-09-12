package Builder.builder;

/**
 * Objeto a configurar
 * @author Yesid
 *
 */
public class Coche {
	
	private int cilindrada = 0;
	private int potencia = 0;
	private String tipo = "";
	private int numero_asientos = 0;
	
	public Coche cilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
		return this;
	}
	
	public Coche potencia(int potencia) {
		this.potencia = potencia;
		return this;
	}

	public Coche tipo(String tipo) {
		this.tipo = tipo;
		return this;
	}

	public Coche numero_asientos(int numero_asientos) {
		this.numero_asientos = numero_asientos;
		return this;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public String getTipo() {
		return tipo;
	}

	public int getNumero_asientos() {
		return numero_asientos;
	}
	
	
	
}
