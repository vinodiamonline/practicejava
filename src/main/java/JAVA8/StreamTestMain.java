package JAVA8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.util.HashMap;
import java.util.stream.IntStream;

public class StreamTestMain {

	public static void main(String args[]) {
		streamtest s = new streamtest();
		s.fillmap();
		s.printmap();
		
		IntStream
			.range(0, 10)
			.skip(4)
			.forEach(x->System.out.println(x));
		
		System.out.println(
			IntStream
				.range(0, 10)
				.skip(4)
				.sum());
				
		
	}
	
}

class streamtest {
	HashMap<Integer, String> hmap = new HashMap<>();
	
	public void printmap( ) {
		hmap.forEach((k,v)-> System.out.println("key " + k + " value " + v));		
	}
	
	public void fillmap() {
		hmap.clear();
		BufferedReader br = null;
		String line="";
		try {
			br = new BufferedReader(new FileReader("MOCK_DATA.csv"));
			line = br.readLine(); // leave header
			while (line != null) {
				line = br.readLine();

				if (line != null) { 
					String s[] = line.split(",");
					hmap.put(Integer.valueOf(s[0]), s[1]);
				}
			}			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
