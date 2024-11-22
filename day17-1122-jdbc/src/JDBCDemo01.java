import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String dbUrl = "jdbc:h2:~/test";
//		String username = "sa";
//		String password = "";
	
		
		
		Employee employee  = new Employee(101, "Raman", "Pune", 20000.00);
		
		Connection connection = null;
		//1. load the driver class 
		 try {
			 
//			Class.forName("org.postgresql.Driver");
			
			//2. create connection with the db
			connection =  DriverManager.getConnection(dbUrl,username, password);    

			
			//3. create statement object
//			 Statement statement =   connection.createStatement();
			 
			 //String insertQuery = "INSERT INTO employees VALUES("+employee.getId()+", '"+employee.getName()+"', '"+employee.getCity()+"', "+employee.getSalary()+")";
			 
//			 String updateQuery= "UPDATE employees SET city='"+employee.getCity()+"' WHERE id=" + employee.getId();	
//			 
//			 //4.execute the sql command 
//			 int rows = statement.executeUpdate(updateQuery);
//			 
//			 if(rows>0)
//				 System.out.println("Record is updated");
//			 else
//				 System.out.println("not updated");
			 
//			 String selectQuery = "SELECT id, name, city, salary from employees";
//			 
//			ResultSet resultSet = statement.executeQuery(selectQuery);
//			
//			List<Employee> list = new ArrayList<>();
//			
//			while(resultSet.next()) {
//				int id = resultSet.getInt("id");
//				String name = resultSet.getString("name");
//				String city = resultSet.getString("city");
//				double salary = resultSet.getDouble("salary");
//				
//				Employee emp = new Employee(id, name, city, salary);
//				list.add(emp);
//			}
//			
//			resultSet.close();
			
//			list
//				.forEach(System.out::println);
//			
			
			
//			String sqlQuery = "INSERT INTO employees VALUES(?,?,?,?)";
//			PreparedStatement statement = connection.prepareStatement(sqlQuery);
//			
//			
//			statement.setInt(1, 104);
//			statement.setString(2, employee.getName());
//			statement.setString(3, employee.getCity());
//			statement.setDouble(4, employee.getSalary());
//			
//			int rows = statement.executeUpdate();
//			
//			if(rows>0)
//				System.out.println("all is well");
			
//			String sqlQuery = "UPDATE employees SET city = ? where salary >= ?";
//			
//			PreparedStatement statement = connection.prepareStatement(sqlQuery);
//			
//			statement.setString(1, "Hyderabad");
//			statement.setDouble(2, 4000);
//			
//			int rows = statement.executeUpdate();
//			
//			if(rows>0)
//				System.out.println("all is well");
			
			
	 	}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				if(connection!=null)
					connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	

}
