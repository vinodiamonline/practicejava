package MultithreadingConcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutersTestMain {
	public static void main(String []commandlinearguments) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i< 20;i++) {
			MyExecuterThreadpoolTestThread myThread = new MyExecuterThreadpoolTestThread("Hell" + i);
			service.execute(myThread);
		}
		service.shutdown();
	}
}
