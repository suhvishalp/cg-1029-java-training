import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIPractice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> personList = PersonList.createPersonList();		
		

		//Predicate<String> predicate = email -> email.endsWith("gmail.com");
 		
//		long count =	personList
//				.stream()
//				.filter( person -> person.getEmail().endsWith("gmail.com"))
//				.count();
//		
//		System.out.println("Count : "+ count);
		
//	   List<String> emailList = personList
//								.stream()
//								.map(person -> person.getEmail())
//								.collect(Collectors.toList());
		
		
//	   
		
//		personList
//			.stream()
//			.filter(person -> person.getEmail().endsWith("gmail.com"))
//			.collect(Collectors.toList());
//		
		
//		int[] array = {34,2,2,32,45,45};
//		
//		 Arrays.stream(array);
//		 
		 
		personList
			.stream();
		 	
	   

	}

}
