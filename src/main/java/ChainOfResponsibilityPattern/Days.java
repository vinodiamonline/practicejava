package ChainOfResponsibilityPattern;

public class Days implements DaysCounter {
	public DaysCounter chain;
	public void SetNextChain(DaysCounter nextdays) {
		this.chain = nextdays;
	}
	public void GetValue(mycalender m) {
		if (m.getRemainingdays() >= 0) {
			System.out.println("Days = "+m.getRemainingdays());
		} else {
			System.out.println("Days = " + "0");			
			//this.chain.GetValue(m);
		}
	}
}
