package AbstractFactoryDesignPattern;

public class absfactorymain {

	public static void main(String[] args) {
		Vehicle veh = VehicleFactory.createInstance(new carfactory());
		System.out.println("Car wheel count is " + veh.getwheelcount());
		
		veh = VehicleFactory.createInstance(new Autofactory());
		System.out.println("Auto wheel count is " + veh.getwheelcount());
		
		veh = VehicleFactory.createInstance(new BicycleFactory());
		System.out.println("Bicycle wheel count is " + veh.getwheelcount());		
		
	}

}
