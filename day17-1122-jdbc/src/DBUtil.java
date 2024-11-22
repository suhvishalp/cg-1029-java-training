import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private final static String dbUrl = "jdbc:postgresql://localhost:5432/mydb";
	private final static String username = "postgres";
	private final static String password = "root123";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(dbUrl, username, password);
	}

}
