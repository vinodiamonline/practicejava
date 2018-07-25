package FlyweightPattern;

public class grapes implements fruit {
	public String color = "GREEN";
	public String taste = "SOUR";
	public String brand = "HIMACHAL";
	public int fruitcode = 1;
	grapes() {
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
