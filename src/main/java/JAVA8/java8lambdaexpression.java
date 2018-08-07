package JAVA8;

@FunctionalInterface
interface java8lambdaexpressionInterface {
	public abstract void m1();
	default void m2() {
		
	}
	static void m3() {
		
	}
}

interface lambdaInterface2 {
	public int getGreaterValue(int a, int b);
}

interface lambdaInterface3 {
	public int square(int n);
}

