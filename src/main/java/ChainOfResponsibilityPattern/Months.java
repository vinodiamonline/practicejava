package ChainOfResponsibilityPattern;

public class Months implements DaysCounter {
	private DaysCounter chain;
	public void SetNextChain(DaysCounter nextchain) {
		this.chain = nextchain;
	}
	public void GetValue(mycalender m) {
		if (m.getRemainingdays() >= 30) {
			System.out.println("Months = " + m.getRemainingdays()/30);
			int remainder = m.getRemainingdays() % 30;
			if(remainder > 0) {
				this.chain.GetValue(new mycalender(remainder));
			} 
		}else {
			System.out.println("Months = " + "0");			
			this.chain.GetValue(m);
		}
	}
}
