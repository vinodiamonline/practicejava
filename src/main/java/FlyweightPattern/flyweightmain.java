package FlyweightPattern;

public class flyweightmain {
	public static void main (String[] args) {
		fruitfactory f = new fruitfactory();
		for (int i = 0; i<20;i++) {
			int fact = (int)((Math.random()*20)%2) + 1;
			long prev = System.currentTimeMillis();
			fruit myfruit = f.getInstance(fact);
			System.out.println(System.currentTimeMillis() - prev);
			System.out.println(myfruit.getcolor());
		}
	}
}
