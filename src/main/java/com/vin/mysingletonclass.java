package com.vin;

public class mysingletonclass {
	private static mysingletonclass INST = null;
	private int x;
	private mysingletonclass() {
		// nothing needed here
	}
	public static mysingletonclass getInstance() {
		if(INST == null) {
			System.out.println("first time Instance creation");
			INST = new mysingletonclass();
		} else {
			System.out.println("No Instance creation. Already created instance returned");
		}
		return INST;
	}
	
	public void setX(int x) {
		this.x = x;
		System.out.println(" x is set to " + this.x);
	}
	
	public int getX() {
		return this.x;
	}

}
