package MultithreadingConcept;

public class DeadlockMain {
	public static void main (String [] args) {
		Tyre t = new Tyre();
		Engine e = new Engine();
		DeadlockVehicle d1 = new DeadlockCar(t,e);
		DeadlockVehicle d2 = new DeadlockBus(t,e);
		Thread t1 = new ThreadDeadlock(d1);
		Thread t2 = new ThreadDeadlock(d2);
		
		t1.start();
		t2.start();
		
	}
}
