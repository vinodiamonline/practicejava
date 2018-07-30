package com.vin;

public class CovarientReturnType {
	CovarientReturnType get() {
		return this;
	}
}

class subclass extends CovarientReturnType {
	subclass get() {
		return this;
	}
	public String getMessage() {
		return "hello";
	}
}
