package SemaphoreTest;

import java.util.concurrent.Semaphore;

public class ThreadToAccessSharedData implements Runnable {
	Semaphore sem;
	SharedDataInSemaphore data;

	public ThreadToAccessSharedData(Semaphore sem, SharedDataInSemaphore data) {
		this.sem = sem;
		this.data = data;
	}

	public void run() {
		try {
			sem.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int counter = data.getCounter();

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep((long)Math.random()*100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			data.setCounter(counter++);
			System.out.println(Thread.currentThread().getName() + " " + data.getCounter());
		}

		counter = data.getCounter();

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep((long)Math.random()*100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			data.setCounter(counter--);
			System.out.println(Thread.currentThread().getName() + " " + data.getCounter());

		}
	
		sem.release();
	}
}
