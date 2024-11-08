import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 
 * Create an Employee class with attributes id, name, department, salary, and joiningDate.
 * 
Create a method groupEmployeesByDepartment which takes a List<Employee> and returns a 
Map<String, List<Employee>>, where each key is a department name, and each value is a 
list of employees in that department.

Create a method getHighestPaidEmployeeInEachDepartment which takes a List<Employee> and returns 
a Map<String, Employee>, where each key is a department name, and each value is the highest-paid
 employee in that department.
 
Create a method getEmployeesByJoiningYear which takes a List<Employee> and an int year as parameters and 
returns a List<Employee> containing employees who joined in that year.

Create a method getAverageSalaryByDepartment which takes a List<Employee> and returns a 
Map<String, Double>, where each key is a department name, and each value is the average salary of 
employees in that department.

 */



//
//class EmployeeService {
//
//    // Group employees by department
//    public Map<String, List<Employee>> groupEmployeesByDepartment(List<Employee> employees) {
//        Map<String, List<Employee>> departmentMap = new HashMap<>();
//
//        //
//        //
//        //
//        
//        return departmentMap;
//    }
//
//    // Get highest paid employee in each department
//    public Map<String, Employee> getHighestPaidEmployeeInEachDepartment(List<Employee> employees) {
//        Map<String, Employee> highestPaidMap = new HashMap<>();
//
//        //
//        //
//        //
//        return highestPaidMap;
//    }
//
//    // Get employees by joining year
//    public List<Employee> getEmployeesByJoiningYear(List<Employee> employees, int year) {
//        List<Employee> employeesByYear = new ArrayList<>();
//
//        //
//        //
//        //
//        return employeesByYear;
//    }
//
//    // Get average salary by department
//    public Map<String, Double> getAverageSalaryByDepartment(List<Employee> employees) {
//        Map<String, List<Employee>> departmentGroups = groupEmployeesByDepartment(employees);
//        Map<String, Double> averageSalaryMap = new HashMap<>();
//
//        //
//        //
//        //
//        
//        return averageSalaryMap;
//    }
//}
//
//
//public class Exercise2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(1, "Alice", "HR", 55000, 2019));
//        employees.add(new Employee(2, "Bob", "IT", 75000, 2020));
//        employees.add(new Employee(3, "Charlie", "Finance", 67000, 2018));
//        employees.add(new Employee(4, "Daisy", "IT", 80000, 2020));
//        employees.add(new Employee(5, "Eve", "Finance", 60000, 2019));
//        employees.add(new Employee(6, "Frank", "HR", 52000, 2020));
//        employees.add(new Employee(7, "Grace", "Finance", 75000, 2021));
//
//        EmployeeService service = new EmployeeService();
//
//        // Group employees by department
//        Map<String, List<Employee>> groupedByDepartment = service.groupEmployeesByDepartment(employees);
//        System.out.println("Employees grouped by department:");
//        for (Map.Entry<String, List<Employee>> entry : groupedByDepartment.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//
//        // Get highest-paid employee in each department
////        Map<String, Employee> highestPaidInEachDept = service.getHighestPaidEmployeeInEachDepartment(employees);
////        System.out.println("\nHighest paid employee in each department:");
////        for (Map.Entry<String, Employee> entry : highestPaidInEachDept.entrySet()) {
////            System.out.println(entry.getKey() + ": " + entry.getValue());
////        }
//
//        // Get employees by joining year
////        int year = 2020;
////        List<Employee> employeesByYear = service.getEmployeesByJoiningYear(employees, year);
////        System.out.println("\nEmployees who joined in " + year + ":");
////        for (Employee employee : employeesByYear) {
////            System.out.println(employee);
//        }
//
//        // Get average salary by department
////        Map<String, Double> avgSalaryByDept = service.getAverageSalaryByDepartment(employees);
////        System.out.println("\nAverage salary by department:");
////        for (Map.Entry<String, Double> entry : avgSalaryByDept.entrySet()) {
////            System.out.println(entry.getKey() + ": " + entry.getValue());
////        }
//	}
//
//}
