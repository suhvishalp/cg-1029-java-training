import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

//Function interface 

// R apply( T t)


public class StreamAPIPractice02 {
	
	public static int square(int number) {
		return number * number;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, Integer > function = StreamAPIPractice02::square;
				
				//(Integer number) -> number * number;
		
		
	
	
		List<Person> personlist = PersonList.createPersonList();
		
//		personlist
//			.stream()
//			.filter(person -> person.getGender().equals(Gender.MALE) && person.getAge() > 30)
//			.forEach(person -> System.out.println(person));
//			
			
		//retrieve a List of emails of all the person 
		
//		List<String> emailList = personlist	
//					.stream()
//					.map(person -> person.getEmail())
//					.collect(Collectors.toList());
//					
//		emailList
//			.forEach(email -> System.out.println(email));
//
//		 
//		
//		
//		emailList
//			.stream()
//			.forEach(System.out :: println);
//		
//		
//		personlist
//			.stream()
//			.mapToInt(person -> person.getAge())
//			.forEach(System.out::println);
		
		
		Optional<Person> optionalPerson = personlist
		 	.stream()
		 	.min((Person person1, Person person2)-> 
		 			((Integer)person1.getAge()).compareTo(person2.getAge()));
		
		if(optionalPerson.isPresent())
			System.out.println(optionalPerson.get());
			
	}

}
