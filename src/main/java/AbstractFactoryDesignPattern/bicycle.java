package AbstractFactoryDesignPattern;

public class bicycle implements Vehicle {
	private int noOfWheels = 2;
	private int color;
	private int gear;
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getColor() {
		return color;
	}
	public int getGear() {
		return gear;
	}
	public int getwheelcount() {
		return noOfWheels;
	}
}
