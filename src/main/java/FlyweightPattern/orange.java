package FlyweightPattern;

public class orange implements fruit {
	public String color = "ORANGE";
	public String taste = "SOUR";
	public String brand = "HIMACHAL";
	public int fruitcode = 2;
	orange() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getcolor() {
		return color;
	}

}
