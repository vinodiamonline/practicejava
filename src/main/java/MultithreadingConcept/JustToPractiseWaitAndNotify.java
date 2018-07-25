package MultithreadingConcept;

public class JustToPractiseWaitAndNotify {
	static PrintNumberOrString  t;
		
	public static void callwait() {
		try {
			t.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void callnotify() {
		t.notify();
	}

}
