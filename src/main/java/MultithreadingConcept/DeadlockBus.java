package MultithreadingConcept;

public class DeadlockBus  implements DeadlockVehicle {
	Tyre t;
	Engine e;

	public DeadlockBus(Tyre t, Engine e) {
		this.t = t;
		this.e = e;
	}

	public void Build() {
		String eng1 = e.GiveMeEngine("BUS", t);

		int t1 = t.GiveMeTyre("BUS", e);
		
		System.out.println(" BUS is super, with tyre = " + t1 + " and engine  = " + eng1);
	}

}
