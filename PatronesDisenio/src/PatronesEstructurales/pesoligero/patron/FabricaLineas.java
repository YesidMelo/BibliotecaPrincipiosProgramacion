package PatronesEstructurales.pesoligero.patron;

import java.util.ArrayList;
import java.util.List;

public class FabricaLineas {
	
	private List<ILineaLigera> listaLineas;
	
	public FabricaLineas() {
		listaLineas = new ArrayList<>();
	}
	
	public ILineaLigera getLinea(String color) {
		for(ILineaLigera linea : listaLineas) {
			if(linea.getColor().equals(color)) {
				return linea;
			}
		}
		
		System.out.println(String.format("Creando una linea de color %s", color));
		ILineaLigera lineaLigera = new Linea(color);
		
		this.listaLineas.add(lineaLigera);
		
		return lineaLigera;
				
	}
}
