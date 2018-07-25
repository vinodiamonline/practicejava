package BuilderClassDesignPattern;

public class Computer {
	private int ram;
	private int cpu;
	private int hdd;
	
	// optional parameters :
	private int weight;
	private boolean isCheap;
	private String make;

	// no other way other than build class 
	// design pattern to create instance of this.
	private Computer(Builder builder) {
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.cpu = builder.cpu;
		this.weight = builder.weight;
		this.make = builder.make;
		this.isCheap = builder.isCheap;
	}

	public int getWeight() {
		return weight;
	}
	public boolean isCheap() {
		return isCheap;
	}
	public String getMake() {
		return make;
	}
	public int getRam() {
		return ram;
	}
	public int getCpu() {
		return cpu;
	}
	public int getHdd() {
		return hdd;
	}
	
	public static class Builder {
		private int ram;
		private int cpu;
		private int hdd;
		
		// optional parameters :
		private int weight;
		private boolean isCheap;
		private String make;
		
		public Builder(int ram, int cpu, int hdd) {
			this.ram = ram;
			this.cpu = cpu;
			this.hdd = hdd;
		}
		
		public Builder setWeight(int weight) {
			this.weight = weight;
			return this;
		}

		public Builder setCheap(boolean isCheap) {
			this.isCheap = isCheap;
			return this;
		}

		public Builder setMake(String make) {
			this.make = make;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}
}
