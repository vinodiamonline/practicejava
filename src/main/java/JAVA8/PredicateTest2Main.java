package JAVA8;

import java.util.function.Predicate;

public class PredicateTest2Main {
	public static void main(String args[]) {
		System.out.println(PredicateSports.isCricket.test(new Sports(11)));
		System.out.println(PredicateSports.isVolleyball.test(new Sports(6)));
		System.out.println(PredicateSports.isVolleyball.negate().test(new Sports(11)));
		System.out.println(PredicateSports.isVolleyball.or(PredicateSports.isCricket).test(new Sports(60)));
	}
}

class Sports {
	private int noOfPlayers;

	Sports(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public int getNoOfPlayers() {
		return this.noOfPlayers;
	}
}

class PredicateSports {
	static Predicate<Sports> isCricket = n -> n.getNoOfPlayers() == 11;
	static Predicate<Sports> isVolleyball = n -> n.getNoOfPlayers() == 6;
}