package MultithreadingConcept;

public class Tyre {
	public synchronized int GiveMeTyre(String vehicheName, Engine e) {
		int tyretoreturn = 0;
		if (vehicheName.contains("BUS")) {
			tyretoreturn = 6;
		} else if (vehicheName.contains("CAR")) {
			tyretoreturn = 4;
		}
		e.timewaste();
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
