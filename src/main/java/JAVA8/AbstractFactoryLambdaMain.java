package JAVA8;

public class AbstractFactoryLambdaMain {
	public static void main(String args[]) {
		// Approach 1
		System.out.println("No Of Wheels of car = " + VehicleFactory.getVehicleInstance(new CarFactory()).getNoOfWheels());
		System.out.println("No Of Wheels of Truck = " + VehicleFactory.getVehicleInstance(new TruckFactory()).getNoOfWheels());	
		
		// Approach 2
		VehicleFactory2 v1 = v->v.getVehicleInstance();
		System.out.println("Wheel of Car = " + v1.getVehicleInstance(new CarFactory()).getNoOfWheels());
		System.out.println("Wheel of Truck = " + v1.getVehicleInstance(new TruckFactory()).getNoOfWheels());
		System.out.println("Wheel of Auto = " + v1.getVehicleInstance(new AutoFactory()).getNoOfWheels());
		System.out.println("Wheel of BigTruck = " + v1.getVehicleInstance(new BigTruckFactory()).getNoOfWheels());
	}
}

@FunctionalInterface
interface VehicleInterface {
	public int getNoOfWheels();
}

@FunctionalInterface
interface VehicleFactoryInterface {
	public abstract VehicleInterface getVehicleInstance();
}

class VehicleFactory {
	public static VehicleInterface getVehicleInstance(VehicleFactoryInterface v) {
		return v.getVehicleInstance();
	}
}

@FunctionalInterface
interface VehicleFactory2 {
	public abstract VehicleInterface getVehicleInstance(VehicleFactoryInterface v);
}

class TruckFactory implements VehicleFactoryInterface {
	public VehicleInterface getVehicleInstance() { return (()-> { return 6; });}
}

class CarFactory implements VehicleFactoryInterface {
	public VehicleInterface getVehicleInstance() { return (()-> { return 4; });}
}

class AutoFactory implements VehicleFactoryInterface {
	public VehicleInterface getVehicleInstance() { return (()-> { return 3; });}
}

class BigTruckFactory implements VehicleFactoryInterface {
	public VehicleInterface getVehicleInstance() { return (()-> { return 8; });}
}
