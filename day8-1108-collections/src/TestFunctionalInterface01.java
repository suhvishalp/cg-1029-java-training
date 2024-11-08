import java.util.function.Predicate;

public class TestFunctionalInterface01 {

	public static void main(String[] args) {
		
		int[] array = {34,54,2,22,55,57,23,7,3,67,3,65,33,76};
		
//		Predicate<Integer> predicate1 = new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer t) {
//				return t >= 10;
//			}
//		};
		
		Predicate<Integer> predicateForNumberGreaterThan10 = value -> value >= 10;
		
		Predicate<Integer> odd_predicate = value -> value % 2 != 0;

		
		Predicate<Integer> even_predicate = value -> value % 2 == 0;
		
		Predicate<Integer> combinedPredicate = odd_predicate.and(predicateForNumberGreaterThan10);

		System.out.println("\n\n print all the numbers greater than 10");
		show(array, predicateForNumberGreaterThan10);
		
		System.out.println("\n\n print all odd numbers");
		show(array, odd_predicate);
		
		
		System.out.println("\n\n print all even numbers");
		show(array, even_predicate);
		
		System.out.println("\n\n print all odd numbers greater than 10");
		show(array, combinedPredicate);
		
	}
	
	public static void show(int[] array, Predicate<Integer> predicate) {
		
		for(int value: array) {
			if(predicate.test(value))
				System.out.print(value + " ");
		}
	}

}
