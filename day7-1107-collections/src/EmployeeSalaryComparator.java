import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		Double employee1Salary = emp1.getSalary();
		Double employee2Salary = emp2.getSalary();
		
		return employee1Salary.compareTo(employee2Salary);
	}

}
