package AbstractFactoryDesignPattern;

public class Car implements Vehicle {
	private int noofwheels = 4;
	public int getwheelcount() {
		return noofwheels;
	}
}
