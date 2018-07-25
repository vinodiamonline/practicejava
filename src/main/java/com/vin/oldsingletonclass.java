package com.vin;

public class oldsingletonclass {
	private static oldsingletonclass INST = new oldsingletonclass();
	private oldsingletonclass() {
		
	}
	public static oldsingletonclass getInstance() {
		return INST;
	}
}
