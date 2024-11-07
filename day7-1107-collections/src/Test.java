
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee emp1 = new Employee(101,"Aryan", 30000.00);
		
		Employee emp2 = new Employee(101,"Aryan", 30000.00);
		
		String s1 = "Welcome";
		String s2 = "Welcome";
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());

		
		System.out.println(emp1.equals(emp2));
	}

}
