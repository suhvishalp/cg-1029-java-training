import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> namesList = new ArrayList<>();
		
		namesList.add("Devansh");
		namesList.add("Archit");
		namesList.addAll(Arrays.asList("Abhishek","Shashank","Zakir","Dhruv","Satyam"));
		
		
		System.out.println(namesList.contains("Archit433"));

//		for(int i=0; i<namesList.size(); i++) {
//		   System.out.println(namesList.get(i));	
//		}
		
//		for(String name : namesList) {
//			System.out.println(name);
//		}
		
		Iterator<String> iterator = namesList.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		
	}

}
