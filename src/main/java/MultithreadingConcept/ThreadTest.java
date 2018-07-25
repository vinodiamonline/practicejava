package MultithreadingConcept;

public class ThreadTest extends Thread {
	private int sum = 0;
	public void run() {
		for (int i = 0; i< 10; i++) {
			sum+=i;
		}
		synchronized (this) {
			this.notify();
		}
		for (int j = 0; j < 100000000; j++) {
			String str = String.valueOf(j);
			str.compareTo("woieu");
		}
		System.out.println("Thread run is finished");
	}
	
	public int getSum() {
		return sum;
	}
	
}
