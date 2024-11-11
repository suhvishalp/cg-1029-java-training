import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Alice Johnson", "HR", 55000, LocalDate.of(2015, 3, 10), "New York"));
        employees.add(new Employee(2, "Bob Smith", "Engineering", 75000, LocalDate.of(2018, 7, 23), "San Francisco"));
        employees.add(new Employee(3, "Carol Davis", "Marketing", 62000, LocalDate.of(2020, 6, 5), "Chicago"));
        employees.add(new Employee(4, "David Brown", "Finance", 68000, LocalDate.of(2017, 11, 19), "Miami"));
        employees.add(new Employee(5, "Eve Wilson", "Sales", 53000, LocalDate.of(2019, 4, 15), "Los Angeles"));
        employees.add(new Employee(6, "Frank Thomas", "IT", 80000, LocalDate.of(2021, 2, 28), "Dallas"));
        employees.add(new Employee(7, "Grace Lee", "HR", 56000, LocalDate.of(2016, 8, 12), "Austin"));
        employees.add(new Employee(8, "Henry Martin", "Engineering", 85000, LocalDate.of(2022, 5, 14), "Seattle"));
        employees.add(new Employee(9, "Irene Allen", "Marketing", 60000, LocalDate.of(2014, 1, 4), "Boston"));
        employees.add(new Employee(10, "Jack White", "Finance", 69000, LocalDate.of(2020, 9, 30), "Denver"));
        employees.add(new Employee(11, "Kathy Moore", "Sales", 54000, LocalDate.of(2017, 10, 10), "Phoenix"));
        employees.add(new Employee(12, "Leo Adams", "IT", 83000, LocalDate.of(2018, 12, 1), "San Diego"));
        employees.add(new Employee(13, "Mona Scott", "HR", 57000, LocalDate.of(2019, 3, 8), "Orlando"));
        employees.add(new Employee(14, "Nick Evans", "Engineering", 88000, LocalDate.of(2021, 7, 25), "San Jose"));
        employees.add(new Employee(15, "Olivia King", "Marketing", 61000, LocalDate.of(2015, 5, 20), "Las Vegas"));
        employees.add(new Employee(16, "Paul Turner", "Finance", 67000, LocalDate.of(2016, 11, 14), "Houston"));
        employees.add(new Employee(17, "Quincy Young", "Sales", 52000, LocalDate.of(2022, 1, 3), "Philadelphia"));
        employees.add(new Employee(18, "Rachel Hill", "IT", 81000, LocalDate.of(2020, 2, 17), "Atlanta"));
        employees.add(new Employee(19, "Sam Walker", "HR", 58000, LocalDate.of(2018, 6, 27), "Minneapolis"));
        employees.add(new Employee(20, "Tina Green", "Engineering", 87000, LocalDate.of(2019, 9, 18), "Portland"));

		
		
	}
	
	//1. Find the Highest Paid Employee in Each Department 
	public static Map<String, Optional<Employee>> findHighestPaidByDepartment(List<Employee> employees) {
	    return null;
	}
	
	//2. Calculate Average Salary for Employees Grouped by City
	public static Map<String, Double> calculateAvgSalaryByCity(List<Employee> employees) {
	    return null;
	}
	
	//3. Find All Employees Who Joined in a Specific Year
	public static List<Employee> findEmployeesByJoiningYear(List<Employee> employees, int year) {
	    return null;
	}
	
	// 4. Get Department-Wise Count of Employees
	public static Map<String, Long> countEmployeesByDepartment(List<Employee> employees) {
	    return null;
	}
	
	// 5. List the Names of Employees in Each Department Sorted by Joining Date
	public static Map<String, List<String>> listEmployeesByDeptSortedByJoiningDate(List<Employee> employees) {
	    return null;
	}
	
	// 6. Filter and Display Names of Employees with Salary Above a Given Threshold and from a Specific City
	public static List<String> findHighEarningEmployeesInCity(List<Employee> employees, double threshold, String city) {
	    return null;
	}
	
	//7. Partition Employees Based on Their Salary	
	public static Map<Boolean, List<Employee>> partitionEmployeesBySalary(List<Employee> employees, double threshold) {
	    return null;
	}
	
	//8. Calculate the Total Salary Expenditure for Each Department
	public static Map<String, Double> calculateTotalSalaryByDepartment(List<Employee> employees) {
	    return null;
	}
	
	//9. List Names of Employees Who Joined Most Recently in Each Department
	public static Map<String, Optional<Employee>> findRecentJoinersByDepartment(List<Employee> employees) {
	    return null;
	}
	
	//10. Calculate Median Salary for Each Department
	public static Map<String, Double> calculateMedianSalaryByDepartment(List<Employee> employees) {
	    return null;
	}


}
