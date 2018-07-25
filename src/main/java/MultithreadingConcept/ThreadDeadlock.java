package MultithreadingConcept;

public class ThreadDeadlock extends Thread {
	 DeadlockVehicle dv;
	public ThreadDeadlock(DeadlockVehicle dv) {
		this.dv = dv;
	}
	public void run() {
		dv.Build();
	}
}
