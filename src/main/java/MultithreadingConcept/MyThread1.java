package MultithreadingConcept;

public class MyThread1 implements Runnable {
	static Thread mt;
	public void run() {
		try {
			mt.join();
		} catch(InterruptedException e) {
			
		}

		for (int i=0;i<10;i++) {
			System.out.println(this.getClass() + " hello " + i);
		}
		
		System.out.println(Thread.currentThread().getName());
	}
}
