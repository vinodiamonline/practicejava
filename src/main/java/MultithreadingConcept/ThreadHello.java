package MultithreadingConcept;

public class ThreadHello extends Thread {
	PrintNumberOrString p;
	public ThreadHello(PrintNumberOrString p) {
		// TODO Auto-generated constructor stub
		this.p = p;
	}

	public void run() {
		p.printHellonumber(100);
	}
}
