package AbstractFactoryDesignPattern;

public class BicycleFactory implements VehicleAbstractFactory {
	public Vehicle getInstance() {
		return new bicycle();
	}
}
