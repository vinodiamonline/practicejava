package JAVA8;

public class lambdaandthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread t = new Thread(()->System.out.println("This is my thread " + Thread.currentThread().getName()));
//		t.start();
		
		for (int i = 0; i< 10; i++) (new Thread(()->System.out.println("This is my thread " + Thread.currentThread().getName()))).start();
		
		for (int j = 0; j < 10; j++) new Thread(()->System.out.println(Thread.currentThread().getName())).start();
	}

}
