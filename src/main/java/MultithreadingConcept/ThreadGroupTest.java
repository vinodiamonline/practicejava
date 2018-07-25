package MultithreadingConcept;

public class ThreadGroupTest implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
	}
}
