package AbstractFactoryDesignPattern;

public class Autofactory implements VehicleAbstractFactory {
	public Vehicle getInstance() {
		return new autorickshaw();
	}
}
