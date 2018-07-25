package FactoryDesignPattern;

public class fatorymain {
	public static void main (String [] args ) {
		OSFactory osf = new OSFactory();
		OS osObject = osf.getInstance("android");
		osObject.spec();
		
		osObject = osf.getInstance("ios");
		osObject.spec();

	}
}
