package MultithreadingConcept;

public class Engine {
	public synchronized String GiveMeEngine(String vehicheName, Tyre t) {
		String tyretoreturn = "0CC";
		if (vehicheName.contains("BUS")) {
			tyretoreturn = "5000CC";
		} else if (vehicheName.contains("CAR")) {
			tyretoreturn = "1000CC";
		}
		t.timewaste();
		
		return tyretoreturn;
	}
	public synchronized void timewaste() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
