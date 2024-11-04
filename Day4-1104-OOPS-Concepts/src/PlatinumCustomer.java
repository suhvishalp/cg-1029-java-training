
public class PlatinumCustomer extends Customer {

	@Override
	public double calculateDiscountRate(double orderTotal, double orderQuantity) {
		// TODO Auto-generated method stub
		
		double baseDiscount = 0.12;
		double additionalDiscount = 0.03;
		
		
		if (orderTotal > 70000.00)
			baseDiscount += 0.01;
		
		if(orderQuantity >= 5)
			baseDiscount += additionalDiscount;
				
		
		return baseDiscount;
	}
	
	//method hiding
	public static void showUser() {
		System.out.println("This is showUser() method of PlatinumCustomer class");
	}

}
