package com.vin;

public class GCFinalize {
	public static int count = 0;
	
	public void runmethod() {
		for (int i = 0; i< 1000; i++) {
			GCFinalize g = new GCFinalize();
			System.out.println(g.toString());
			g = null;
		}
	}
	public void finalize() {
		System.out.println("finalize metod called " + ++count);
	}
}
