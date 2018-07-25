package MultithreadingConcept;

public class MyThread extends Thread {
	public void run() {
		for (int i = 0; i<10;i++)
		System.out.println(this.getName() + " " + i);
		System.out.println(Thread.currentThread().getName());

	}
	public void run(int j) {
		for (int i = 0; i<10;i++)
		System.out.println(this.getName() + " " + i + j);
	}

	public void start() {
		super.start();
		for (int i = 0; i<10;i++)
		System.out.println(this.getName() + " of start " + i);
		System.out.println(Thread.currentThread().getName());

	}
}
