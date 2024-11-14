import java.util.HashMap;
import java.util.Map;

public class EmployeeDAO {
	
	private Map<Integer, Employee> employees = new HashMap<>();
	
	//add employee 
	
	public void addEmployee(Employee employee) {
		employees.put(employee.getId(), employee);
	}
	
	//remove the employee
	
	
	//retrieve an employee with the given id
	public Employee getEmployeeById(int id) throws EmployeeNotFoundException {
		Employee employee = employees.get(id);
		
		if(employee==null)
			//throw exception
			throw new EmployeeNotFoundException("Employee not found with the given id");
		
		return employee;
	}
	
	
	
	//retrieve all the employees 

}
