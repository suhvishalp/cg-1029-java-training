import java.util.Arrays;
import java.util.List;

public class MethodRefPractice01 {
	
	public static void convertToUpperCase(String str) {
		str = str.toUpperCase();
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        
       convertToUpperCase(names.get(0));
       
//       names.forEach(String::toUpperCase);
       
       names.stream()
       		.map(String::toUpperCase)
       		.forEach(System.out::println);
       
       
	}

}
