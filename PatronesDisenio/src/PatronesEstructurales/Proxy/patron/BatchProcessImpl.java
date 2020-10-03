package PatronesEstructurales.Proxy.patron;

public class BatchProcessImpl implements BatchProcess {

	private String fileName;
	public BatchProcessImpl(String fileName) {
		
		this.fileName = fileName;
		loadFromDisk(fileName);
		
	}
	
		
	@Override
	public void process() {
		
		System.out.println(String.format("procesando documento %s", fileName));
		
	}
	
	private void loadFromDisk(String fileName) {
		
		System.out.println(String.format("procesando documento %s", fileName));
		
		for(int cont = 0 ; cont <10 ;cont ++) {
			
			System.out.println(String.format("Loading %s %d ", fileName,cont * 10));
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
		}
		
		System.out.println(String.format("Cargado", fileName));
		
	}

}
