import java.util.Objects;

public class Employee {
	
	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	public String toString() {
		return "\n" + this.empId + " " + this.empName + " " + this.salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	
//	public int hashCode() {
//		return this.empName.hashCode() + new Integer(this.empId).hashCode() +
//					new Double(this.salary).hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("Employee class's equals() method called");
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return empId == other.empId && Objects.equals(empName, other.empName)
//				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
//	}
//	
	
	
	
	

}
