
public abstract class Customer extends User {
	
	private int customerNumber;
	private int bonusPoints;
	
	public Customer() {
		System.out.println("Customer no-arg constructor is called");
		
	}
	
	public Customer(int customerNumber, int bonusPoints) {
		this.customerNumber = customerNumber;
		this.bonusPoints = bonusPoints;
		
		System.out.println("Customer 2nd constructor is called");
	}
	
	public Customer(String userId, String password, UserType userType) {
		super(userId, password, userType);
		System.out.println("Customer 3rd constructor is called");

	}
	
	public Customer(int customerNumber, int bonusPoints, String userId, String password, UserType userType) {
		
		super(userId, password, userType);

		this.customerNumber = customerNumber;
		this.bonusPoints = bonusPoints;
		
		
		System.out.println("Customer 3rd constructor is called");

	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public int getBonusPoints() {
		return bonusPoints;
	}

	public void setBonusPoints(int bonusPoints) {
		this.bonusPoints = bonusPoints;
	}

	
	public abstract double calculateDiscountRate(double orderTotal, double orderQuantity);
	

}
