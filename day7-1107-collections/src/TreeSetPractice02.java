import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparator<Employee> comparator = new EmployeeSalaryComparator();
		
		Set<Employee> empSet = new TreeSet<>(comparator);
		
		empSet.add(new Employee(14323, "Harsh", 2000.00));
		empSet.add(new Employee(13423, "Shubham", 5000.00));
		empSet.add(new Employee(54543, "Ayush", 7800.00));
		empSet.add(new Employee(16643, "Ankit", 8000.00));
		empSet.add(new Employee(65432, "Chitranshu", 3400.00));
		
		System.out.println(empSet);

	}

}
