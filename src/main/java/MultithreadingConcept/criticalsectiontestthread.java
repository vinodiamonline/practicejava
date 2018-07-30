package MultithreadingConcept;

public class criticalsectiontestthread implements Runnable {
	citicalsectiontest ct;
	public criticalsectiontestthread(citicalsectiontest ct) {
		// TODO Auto-generated constructor stub
		this.ct = ct;
	}
	public void run() {
		for (int i = 0; i < 20; i++)
			System.out.println("Record count for thread after set " + Thread.currentThread().getName() + " is " + ct.getRecordcount());
	}
}
