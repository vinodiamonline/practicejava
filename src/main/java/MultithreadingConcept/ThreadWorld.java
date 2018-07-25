package MultithreadingConcept;

public class ThreadWorld extends Thread{
	PrintNumberOrString p;

	public ThreadWorld(PrintNumberOrString p) {
		// TODO Auto-generated constructor stub
		this.p = p;
	}

	public void run() {
		p.printWorldNumber(100);
	}
}
