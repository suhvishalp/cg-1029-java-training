import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList = new ArrayList<>();
		
		Employee emp1 = new Employee(101, "Archit", 40000.00);
		Employee emp2 = new Employee(101, "Archit", 40000.00);
		
		
//		emp1.equals("hellworold");
//		emp1.equals(emp1);
//		emp1.equals(null);
//		
//		if(emp1.equals(emp2))
//			System.out.println("Both are same");
//		else 
//			System.out.println("not same");
//			
		
		
		
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(new Employee(103, "Dhruv", 20000.00));
		empList.add(new Employee(104, "Abhishek", 70000.00));
		empList.add(new Employee(105, "Devansh", 25000.00));

		System.out.println(empList.contains(new Employee(103, "Dhruv", 20000.00)));
		
		Collections.sort(empList, new EmployeeSalaryComparator());
		
		System.out.println(empList);
		
		
		
	}

}
