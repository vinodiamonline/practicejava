package JAVA8;

public class AbstractFactoryLambdaMain {
	public static void main(String args[]) {
		VehicleFactory v1 = v->v.getVehicleInstance();
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

@FunctionalInterface
interface VehicleFactory {
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
