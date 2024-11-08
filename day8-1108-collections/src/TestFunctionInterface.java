import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestFunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  List<Employee> employees = new ArrayList<>();
      employees.add(new Employee(1, "Alice", "HR", 55000, 2019));
      employees.add(new Employee(2, "Bob", "IT", 75000, 2020));
      employees.add(new Employee(3, "Charlie", "Finance", 67000, 2018));
      employees.add(new Employee(4, "Daisy", "IT", 80000, 2020));
      employees.add(new Employee(5, "Eve", "Finance", 60000, 2019));
      employees.add(new Employee(6, "Frank", "HR", 52000, 2020));
      employees.add(new Employee(7, "Grace", "Finance", 75000, 2021));
      
      Function<Employee, Double> function = emp -> emp.getSalary();
      
      Consumer<Double> consumer = salary -> System.out.println(salary);
      
      for(Employee emp: employees) {
    	  consumer.accept(emp.getSalary());
      }

	}

}
