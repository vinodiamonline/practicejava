package MultithreadingConcept;

public class DeadlockCar implements DeadlockVehicle {
	Tyre t;
	Engine e;

	public DeadlockCar(Tyre t, Engine e) {
		// TODO Auto-generated constructor stub
		this.t = t;
		this.e = e;
	}

	public void Build() {
		int t1 = t.GiveMeTyre("CAR",e);
		
		String eng1 = e.GiveMeEngine("CAR",t);
		
		System.out.println(" Car is awesome, with tyre = " + t1 + " and engine  = " + eng1);
	}
}
