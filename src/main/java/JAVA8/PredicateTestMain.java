package JAVA8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTestMain {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(-2,-5,-6,0,3,5,7,4,6,8,2,2,9);
//		List<Integer> filteredNum = getFilterdedInteger(num);
//		filteredNum.forEach(System.out::println);
		
		List<Integer> filteredNum2 = getFilterdedInteger2(num,IntegerPredicates.positiveIntegerPredicate);
		filteredNum2.forEach(System.out::println);
		
		List<Integer> filteredNum3 = getFilterdedInteger2(num,IntegerPredicates.negativeIntegerPredicate);
		filteredNum3.forEach(System.out::println);

	}

	public static List<Integer> getFilterdedInteger(List<Integer> numbers) {
		List<Integer> filterednumbers = new ArrayList<Integer>();
		for (Integer i : numbers) {
			Predicate<Integer> p = p1 -> p1 > 0;
			if (p.test(i)) filterednumbers.add(i);
		}
		return filterednumbers;
	}
	
	public static List<Integer> getFilterdedInteger2(List<Integer> numbers, Predicate<Integer> intPredicates) {
		List<Integer> filterednumbers = new ArrayList<Integer>();
		for (Integer i : numbers) {
			if (intPredicates.test(i)) filterednumbers.add(i);
		}
		return filterednumbers;
	}
}

class IntegerPredicates {
	public static Predicate<Integer> positiveIntegerPredicate = i -> i > 0;
	public static Predicate<Integer>negativeIntegerPredicate = i -> i < 0;

}