package MultithreadingConcept;

public class MyThreadMain {
	public static void main(String[] args) throws InterruptedException {
		// method 1

		// MyThread mt = new MyThread();
		// mt.setPriority(9);
		// mt.start();
		//
		// for (int i = 0; i<10;i++) System.out.println("Main Thread " + i);
		//
		// // method 2 : this is recommended.
		// MyThread1.mt = Thread.currentThread();
		// MyThread1 mt1 = new MyThread1();
		// Thread t = new Thread(mt1);
		// t.start();
		// t.join();
		// for (int i = 0; i<10;i++) System.out.println("Main Thread again " + i);
		//
		// System.out.println(Thread.currentThread().getName());

		// ThreadSynchronization thrs = new ThreadSynchronization();
		//
		// Thread t1 = new Thread(thrs);
		//
		// Thread t2 = new Thread(thrs);
		//
		// t1.start();
		// thrs.m2();
		// t2.start();
		// thrs.m1();

		// String []str = {"Kallu", "Dhoni", "Yuvraj", "kalua", "kaalu"};
		// Student s = new Student();
		// for (int i = 0;i<5;i++) {
		// StudentThread t = new StudentThread(s, str[i], i*i);
		// t.start();
		// }

//		PrintNumberOrString p = new PrintNumberOrString();
//		JustToPractiseWaitAndNotify.t = p;
//		ThreadHello nt = new ThreadHello(p);
//		nt.start();
//
//		ThreadWorld ct = new ThreadWorld(p);
//		ct.start();
//		
//		ThreadTest t = new ThreadTest();
//
//		t.start();
//		// t.join();
//		synchronized (t) {
//			t.wait();
//		}
//		System.out.println(t.getSum());
//		
//		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
//		System.out.println(t.getThreadGroup().getName());
		
		ThreadGroupTest tr = new ThreadGroupTest();
		ThreadGroup tg = new ThreadGroup("Kallu");
		Thread t1 = new Thread(tg, tr, "t1 thread");

		t1.start();
		
		
	}
}
