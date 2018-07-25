package com.vin;

public class parentclass {
	int x = 20;

	public parentclass() {
		System.out.println("parent constructor");
	}
	public parentclass(int a) {
		System.out.println("parent constructor with one arg");
	}
	public void m1(int... a) {
		System.out.println("parent");
	}
	
	public int getx() {
		return x;
	}
	public void m2() {
		System.out.println("parent m2");

	}
}
