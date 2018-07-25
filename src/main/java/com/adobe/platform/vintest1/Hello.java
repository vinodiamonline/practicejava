package com.adobe.platform.vintest1;

import java.util.Arrays;

public class Hello {
	char[] num;

	public Hello(char x) {
		num = new char[100000];
		Arrays.fill(num, x);
	}

	public int getnumber() {

		String[] str = new String[1000];
		str[0] = "pppp";

		return 4;
	}

	public void m1(int a, int... b) {
		System.out.println("var arg called");
	}

	public void m1(int... a) {
		System.out.println("two arg called");
	}
	
	public void ambiguoustest(String o) {
		System.out.println("String called");

	}
	
	public void ambiguoustest(Integer o) {
		System.out.println("Integer called");

	}
	
	public void testpromotion(int a) {
		System.out.println("promoted to int called");
	}
	public void testpromotion(float a) {
		System.out.println("promoted to float called");
	}

}
