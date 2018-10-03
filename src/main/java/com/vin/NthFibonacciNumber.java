package com.vin;

public class NthFibonacciNumber {

	public static void main(String args[]) {
		try {
			System.out.println("The nth fibonacci number is " + givnNthFibonacciNumber(100));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static long givnNthFibonacciNumber(int n) throws IllegalArgumentException {
		if (n <= 0) throw new IllegalArgumentException();
		long nthFibonacci = 0;
		long first = 1;
		long second = 1;
		if (n == 1 || n == 2) return 1;
		
		for (int i=2; i< n; i++) {
			nthFibonacci = first + second;
			first = second;
			second = nthFibonacci;
		}
		
		return nthFibonacci;
	}
}
