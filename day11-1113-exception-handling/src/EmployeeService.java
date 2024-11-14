
public class EmployeeService {
	
	private EmployeeDAO empDao;
	
	public EmployeeService() {
		this.empDao = new EmployeeDAO();
	}
	
								//1		//"15"
	public void addEmployee(int id, String age, String name, String panCard) {
		
		//construct an object of Employee and use the DAO class to persist 
		
		try {
			int a = Integer.parseInt(age);
			
			Employee employee = Employee.createEmployee(id, a, name, panCard);
			
			empDao.addEmployee(employee);
			
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}catch (InvalidAgeExpcetion e) {
			System.out.println(e.getMessage());
		}
		catch (InvalidPanCardException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//
	public Employee getEmployeeById(int id) {
		
		try {
			
			Employee employee = empDao.getEmployeeById(id);
			return employee;
			
		} catch (EmployeeNotFoundException e) {
			
			e.printStackTrace();
			return null;
		}
		
	}
	
	//
	
	//

}
