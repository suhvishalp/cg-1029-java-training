import java.util.Objects;

public class Emp implements Comparable<Emp> {
	
	private int empId;
	private String empName;
	private double salary;
	
	public Emp() {
		super();
	}

	public Emp(int empId, String empName, double salary) {
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
		Emp other = (Emp) obj;
		return empId == other.empId && Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public int compareTo(Emp other) {
		// TODO Auto-generated method stub
		
		return this.empName.compareTo(other.getEmpName());
	}

	
	
	
	
	

}
