package MultithreadingConcept;

public class ThreadSynchronization implements Runnable {
	public synchronized void run() {
		for (int i =0; i< 10; i++)
			try {
				Thread.sleep(1000);
				System.out.println("run " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public synchronized void m1() {
		for (int i =0; i< 10; i++)
			try {
				Thread.sleep(1000);
				System.out.println("M1 " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void m2() {
		for (int i =0; i< 10; i++)
			try {
				Thread.sleep(1000);
				System.out.println("M2 not synchronized" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
