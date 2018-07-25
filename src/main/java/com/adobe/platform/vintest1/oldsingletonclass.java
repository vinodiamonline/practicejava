package com.adobe.platform.vintest1;

public class oldsingletonclass {
	private static oldsingletonclass INST = new oldsingletonclass();
	private oldsingletonclass() {
		
	}
	public static oldsingletonclass getInstance() {
		return INST;
	}
}
