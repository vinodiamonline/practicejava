package com.adobe.platform.vintest1;

public class childclass extends parentclass {
	int x = 10;

	public void m1(int a) {
		System.out.println("child");
	}
	
	public int getparentx() {
		return super.x;
	}
	
	public void m2() {
		System.out.println("child m2");

	}
}
