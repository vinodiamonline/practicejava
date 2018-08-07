package JAVA8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class java8main {
	public static void main(String [] args) {
		System.out.println("hello world");
		
		java8lambdaexpressionInterface d = () -> System.out.println("hello lambda");
		d.m1();
		
		lambdaInterface2 l1 = (a,b) -> (a > b ? a : b);
		
		System.out.println("greater value :"+ l1.getGreaterValue(100, 200));
		
		lambdaInterface3 l2 = n-> {
				int m = n*n;
				return m;
			};
		System.out.println("square value :"+ l2.square(140));
		
		lambdausageInMultithreading.executertest();
	}
}


class lambdausageInMultithreading {
	public static void executertest() {
		Runnable r = () -> System.out.println("This is my thread " + Thread.currentThread().getName());
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i<10; i++) service.execute(r);
		service.shutdown();
	}
	
	// also
	public static void ThreadTest() {
		Thread t = new Thread(()->System.out.println("This is my thread" + Thread.currentThread().getName()));
		t.start();
	}

}

