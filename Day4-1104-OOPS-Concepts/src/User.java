
public abstract class User {

	protected String userId;
	protected String password;
	protected UserType userType;
	
	public User() {
		System.out.println("User no-arg constructor is called");
	}
	
	public User(String userId, String password, UserType userType) {
		System.out.println("User constructor no, 2 is called");
		this.userId = userId;
		this.password = password;
		this.userType = userType;
	}
	
	
	public static void showUser() {
		System.out.println("This is showUser() method of User class");
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	
}
