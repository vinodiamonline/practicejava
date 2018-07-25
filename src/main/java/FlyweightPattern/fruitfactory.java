package FlyweightPattern;

import java.util.Hashtable;

public class fruitfactory {
	private static final Hashtable<Integer, fruit> hmap = new Hashtable<Integer, fruit>();
	public fruit getInstance(int fruitcode) {
		if (hmap.containsKey(fruitcode)) {
			return hmap.get(fruitcode);
		}
		else {
			fruit f = null;
			switch (fruitcode) {
			case 1:
				f = new grapes();
				break;
			case 2:
				f = new orange();
				break;
			}
			hmap.put(fruitcode, f);
			
			return f;
		}
	}
}
