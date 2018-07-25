package AbstractFactoryDesignPattern;

public class VehicleFactory {
	public static Vehicle createInstance(VehicleAbstractFactory veh) {
		return veh.getInstance();
	}
}
