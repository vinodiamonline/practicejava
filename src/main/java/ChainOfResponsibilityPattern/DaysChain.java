package ChainOfResponsibilityPattern;

public class DaysChain {
	public DaysCounter d1;
	public DaysChain() {
		this.d1 = new Years();
		DaysCounter d2 = new Months();
		DaysCounter d3 = new Days();
		d1.SetNextChain(d2);
		d2.SetNextChain(d3);
	}

}
