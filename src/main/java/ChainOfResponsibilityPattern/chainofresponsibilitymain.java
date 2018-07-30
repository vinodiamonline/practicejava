package ChainOfResponsibilityPattern;

import java.util.Scanner;

public class chainofresponsibilitymain {
	public static void main(String [] args) {
		DaysChain d = new DaysChain();
		
		while (true) {
			int days = 0;
			System.out.println("\nEnter No of days");
			Scanner input = new Scanner(System.in);
			days = input.nextInt();
			// process the request
			d.d1.GetValue(new mycalender(days));
			input.close();
		}
	}
}
