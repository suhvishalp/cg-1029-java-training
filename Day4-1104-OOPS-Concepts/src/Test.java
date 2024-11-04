import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Customer customer = null;
		
		
		System.out.println("Enter a choice : \n 1. Platinum Customer \n 2. Premium Cusotmer " );
		
		int choice = scanner.nextInt();
		
		switch(choice){
		
		case 1:
			PlatinumCustomer platinumCustomer = new PlatinumCustomer();
			platinumCustomer.showUser();
			//user the setter methods to initialize values 
			//
			//
			break;
			
			
		case 2:
			customer = new PremiumCustomer();
			//user the setter methods to initialize values 
			//
			//
			break;
			
		default:
			System.out.println("wrong choice!");
		
		}
		
		
		//double discountRate  = customer.calculateDiscountRate(56000.00, 8);
		
//		User.showUser();
		customer.showUser();
		
	}

}
