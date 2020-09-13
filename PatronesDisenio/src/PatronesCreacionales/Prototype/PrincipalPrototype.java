package PatronesCreacionales.Prototype;

import java.util.ArrayList;

import PatronesCreacionales.Prototype.prototipoCamisetas.Camiseta;
import PatronesCreacionales.Prototype.prototipoCamisetas.CamisetaMCorta;
import PatronesCreacionales.Prototype.prototipoCamisetas.CamisetaMLarga;

/**
 * libro patrones de diseño
 * Proposito:
 * Especifica los tipos de objetos a crear por medio de una instancia prototipica y crea nuevos objetos copiando dicho prototipo
 * 
 * aplicabilidad
 * 1. Cuando un sistema deba ser independiente de como se crean, se componen y representan sus productos
 * 2. cuando las clases a instanciar sean especificadas en tiempo de ejecucion (ejemplo mediante carga dinamica)
 * 3. para evitar construir una jerarquia de fabricas paralela a la jerarquia de clases de los productos
 * 4. cuando las instancias de una clase puedan tener uno de entre solo unos pocos estados diferentes Puede ser mas adecuado
 * 	  tener un numero equivalente de prototipos y clonarlos en vez de crear manualmente instancias de clase cada vez con el
 * 	  estado apropiado
 * 
 * detalle codigo
 * https://programacion.net/articulo/patrones_de_diseno_v_patrones_de_creacion_prototipo_1005
 * 
 * @author Yesid
 *
 */
public class PrincipalPrototype {

	public static void main(String[] args) {
		Camiseta prototipoMangaCorta = new CamisetaMCorta("S", "Amarillo");
		Camiseta prototipoMangaLarga = new CamisetaMLarga("L", "Naranja");
		
		ArrayList<Camiseta> listaCamisetas = new ArrayList<>();
		
		for(int contadorCamisetas = 0; contadorCamisetas<10 ;contadorCamisetas++) {
			Camiseta tmpMangaCorta = prototipoMangaCorta.clone(); 
			tmpMangaCorta.setEstampado(String.format("Estampado _%s_", contadorCamisetas));
			listaCamisetas.add(tmpMangaCorta);
			
			Camiseta tmpMangaLarga = prototipoMangaLarga.clone();
			tmpMangaLarga.setEstampado(String.format("Estampado _%s_", contadorCamisetas));
			listaCamisetas.add(tmpMangaLarga);
		}
		
		for(Camiseta camiseta : listaCamisetas ) {
			System.out.println(camiseta.traerDetalleCamiseta()+"\n");
		}
		
	}

}
