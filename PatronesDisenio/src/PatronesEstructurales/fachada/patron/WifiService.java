package PatronesEstructurales.fachada.patron;

public class WifiService implements MobileService {

	@Override
	public void start() { System.out.println("Wifi service Started"); }

	@Override
	public void close() {System.out.println("Wifi service closed");  }

}
