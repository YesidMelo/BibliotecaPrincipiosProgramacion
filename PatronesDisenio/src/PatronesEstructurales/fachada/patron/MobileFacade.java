package PatronesEstructurales.fachada.patron;

import java.util.ArrayList;
import java.util.List;

public class MobileFacade {
	
	public Mobile on() {
		
		Bateria bateria = new Bateria();
		bateria.on();
		
		CPU cpu = new CPU();
		cpu.bootLoad();
		
		MobileService gps = new GPSService();
		gps.start();
		
		MobileService wifi = new WifiService();
		wifi.start();
		
		List<MobileService> listaServicios = new ArrayList<MobileService>();
		listaServicios.add(gps);
		listaServicios.add(wifi);
		
		Mobile mobile = new Mobile(bateria, cpu, listaServicios);
		
		return mobile;
		
	}
	
	public void off(Mobile mobile) {
		
		for(MobileService mobileService : mobile.getMobileServices()) {
			mobileService.close();
		}
		
		mobile.getCpu().shotdown();
		mobile.getBateria().off();
	}
	
	
}
