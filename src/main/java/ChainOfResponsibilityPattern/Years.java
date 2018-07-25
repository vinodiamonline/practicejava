package ChainOfResponsibilityPattern;

public class Years implements DaysCounter {
	public DaysCounter chain;
	public void SetNextChain(DaysCounter nextdays) {
		this.chain = nextdays;
	}
	public void GetValue(mycalender m) {
		if (m.getRemainingdays() >= 365) {
			System.out.println("Years = "+m.getRemainingdays()/365);
			int remainder = m.getRemainingdays()%365;
			if (remainder > 0) {
				this.chain.GetValue(new mycalender(remainder));
			} 
		}
		else {
			System.out.println("Years = " + "0");			
			this.chain.GetValue(m);
		}
	}
}
