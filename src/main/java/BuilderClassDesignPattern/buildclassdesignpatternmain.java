package BuilderClassDesignPattern;

public class buildclassdesignpatternmain {
	public static void main(String [] args) {
		Computer comp = new Computer.Builder(100, 4, 500).build();
		
		System.out.println(comp.getCpu());
		System.out.println(comp.getMake());
		
		Computer comp1 = new Computer.Builder(200, 2, 1000).setMake("HP").setCheap(true).setWeight(200).build();
		System.out.println(comp1.getMake());
		System.out.println(comp1.getWeight());
		System.out.println(comp1.isCheap());
		
	}
}
