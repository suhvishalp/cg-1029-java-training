
public class PremiumCustomer extends Customer {

	@Override
	public double calculateDiscountRate(double orderTotal, double orderQuantity) {
		// TODO Auto-generated method stub
		
		double baseDiscount = 0.10;
		double additionalDiscount = 0.02;
		
	
		return orderTotal >= 50000.00 ? baseDiscount + additionalDiscount : baseDiscount;
	}
	
	
	//method hiding
		public static void showUser() {
			System.out.println("This is showUser() method of PremiumCustomer class");
		}

}
