package MultithreadingConcept;

public class MyExecuterThreadpoolTestThread implements Runnable {
	private String runID;
	public MyExecuterThreadpoolTestThread(String runID) {
		this.runID = runID;
	}

	public void run() {
		System.out.println(" Thread Name : " + Thread.currentThread().getName() + " run id : " + this.runID);
	}
}
