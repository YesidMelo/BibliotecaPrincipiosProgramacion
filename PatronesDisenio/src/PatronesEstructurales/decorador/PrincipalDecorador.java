package PatronesEstructurales.decorador;

import PatronesEstructurales.decorador.patron.Reloj;
import PatronesEstructurales.decorador.patron.RelojBasico;
import PatronesEstructurales.decorador.patron.RelojDeportivoDecorador;
import PatronesEstructurales.decorador.patron.RelojLujoDecorador;

/**
 * Proposito: 
 * asigna responsabilidades adicionales a un objeto dinamicamente proporcionando un alternativa flexible
 * a la herencia para extender la funcionalidad
 * 
 * Aplicabilidad:
 * 1. para añadir objetos individuales de forma dinamica y transparente, es decir, sin afectar a otros objetos
 * 2. para responsabilidades que pueden ser retiradas
 * 3. cuando la extension mediante la herencia no es viable aveces es posible tener un gran numero de extensiones independientes
 *    produciendose una explosion de subclases para permitir todas las combinaciones, o puede ser una definicion de una clase oculta
 *    o que no este disponible para ser heredada
 *    
 *    codigo fuente : https://experto.dev/patron-de-diseno-decorator-en-java/
 *    
 *    //este patron sirve para adicionar caracteristicas unicas a los npc en videojuegos ademas de los comunes
 * @author Yesid
 *
 */

public class PrincipalDecorador {

	public static void main(String[] args) {
		
		Reloj relojBasico = new RelojBasico();
		relojBasico.crearFuncionalidad();
		System.out.println("\n---------------");
		
		Reloj relojDeportivo = new RelojDeportivoDecorador(relojBasico);
		relojDeportivo.crearFuncionalidad();
		System.out.println("\n---------------");
		
		Reloj relojDeLujo = new RelojLujoDecorador(relojDeportivo);
		relojDeLujo.crearFuncionalidad();
		System.out.println("\n---------------");
		

	}

}
