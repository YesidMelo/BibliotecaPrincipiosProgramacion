package PatronesEstructurales.fachada.patron;

import java.util.List;

public class Mobile {
	private Bateria bateria;
	private CPU cpu;
	private List<MobileService> mobileServices;
	
	public Mobile(Bateria bateria,CPU cpu, List<MobileService> mobileServices) {
		this.bateria = bateria;
		this.cpu = cpu;
		this.mobileServices = mobileServices;
	}

	public Bateria getBateria() {
		return bateria;
	}

	public CPU getCpu() {
		return cpu;
	}

	public List<MobileService> getMobileServices() {
		return mobileServices;
	}
	
	
	
}
