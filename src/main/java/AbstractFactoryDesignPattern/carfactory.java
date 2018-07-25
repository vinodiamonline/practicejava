package AbstractFactoryDesignPattern;

public class carfactory implements VehicleAbstractFactory {
	public Vehicle getInstance() {
		return new Car();
	}
}
