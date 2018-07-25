package ChainOfResponsibilityPattern;

public interface DaysCounter {
	public void GetValue(mycalender m);
	public void SetNextChain(DaysCounter d);
}
