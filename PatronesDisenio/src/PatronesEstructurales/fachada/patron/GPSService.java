package PatronesEstructurales.fachada.patron;

public class GPSService implements MobileService {

	@Override
	public void start() { System.out.println("GPS service Started"); }

	@Override
	public void close() {System.out.println("GPS service closed");  }

}
