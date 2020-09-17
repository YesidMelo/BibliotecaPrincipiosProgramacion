package PatronesEstructurales.pesoligero;

import PatronesEstructurales.pesoligero.patron.FabricaLineas;
import PatronesEstructurales.pesoligero.patron.ILineaLigera;

/**
 * Propsoito:
 * 
 * Uso compartido para permitir un gran numero de objetos de granularidad fina de forma eficiente
 * 
 * Aplicabilidad:
 * tiene que cumplierse las siguientes condiciones
 * 1. Una aplicacion usa un gran numero de objetos
 * 2. los costes de almacenamiento son elevados debido a la gran cantidad de objetos
 * 3. la mayor parte del estado del objeto puede hacerse extrinceco
 * 4. muchos grupos de objetos pueden reemplazarce por relativamente pocos objetos compartidos
 *    una vez se ha eliminado el estado extrinseco
 * 5. la aplicacion no depende de la identidad del objeto  puesto que los objetos peso ligero pueden ser compartidos
 * 	  las comprobaciones de identidad devolveran verdadero para objetos conceptualmente distintos
 * 
 *   codigo : https://informaticapc.com/patrones-de-diseno/flyweight.php
 *   
 *   Nota:
 *   
 *   Cuando se quiere mantener un numero constante de npc para crear oleadas este metodo puede servir para reutilizar los objetos 
 *   ya instanciados
 * 
 * @author Yesid
 *
 */

public class PrincipalPesoLigero {

	public static void main(String[] args) {
		
		FabricaLineas fabricaDeLineas = new FabricaLineas();
		
		ILineaLigera linea1 = fabricaDeLineas.getLinea("Azul");
		ILineaLigera linea2 = fabricaDeLineas.getLinea("Rojo");
		ILineaLigera linea3 = fabricaDeLineas.getLinea("Amarillo");
		ILineaLigera linea4 = fabricaDeLineas.getLinea("Verde");
		
		System.out.println("---------------------------------------");
		
		linea1.dibujar(100, 400);
		linea1.dibujar(200, 500);
		linea1.dibujar(300, 600);
		linea1.dibujar(400, 700);

	}

}
