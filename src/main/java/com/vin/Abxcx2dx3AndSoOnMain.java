package com.vin;

import java.util.ArrayList;

public class Abxcx2dx3AndSoOnMain {
	public static void main(String [] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(4);
		arr.add(-1);
		arr.add(5);
		arr.add(7);
		arr.add(-2);
		arr.add(-4);
		arr.add(-4);
		arr.add(-3);
		arr.add(2);
		
		int sum = 0;
		int largesum = 0;
		int startIndex = 0;
		int length = 0;
		for (int i = 0; i< arr.size(); i++) {
			for (int j = 0; j < arr.size();j++) {
				sum = 0;
				for (int k = j; k < (j+i) && k < arr.size(); k++) {
					sum = sum + arr.get(k);
				}
				if (sum > largesum) {
					largesum = sum;
					startIndex = j;
					length = i;
				}
			}
		}
		
		System.out.println(startIndex +   "  " + length + "  " + largesum );
	}
}
