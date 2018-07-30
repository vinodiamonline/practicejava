package SemaphoreTest;

import java.util.concurrent.Semaphore;

public class SemaphoreTestMain {
	public static void main(String [] args) {
		// Semaphore 
		SharedDataInSemaphore sd = new SharedDataInSemaphore();
		Semaphore sem = new Semaphore(1);
		ThreadToAccessSharedData tsdata = new ThreadToAccessSharedData(sem, sd);
		Thread t1 = new Thread(tsdata);
		Thread t2 = new Thread(tsdata);
		t1.start();
		t2.start();
	}
}
