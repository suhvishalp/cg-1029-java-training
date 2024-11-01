
public class Order {
	
	private int orderId;
	private Customer customer;
	
	private Cart cart;
	private PaymentState paymentState;
	
	public Order() {
		//
		//
		
		paymentState = PaymentState.PENDING;
	}
	
	
	public void displayOrderDetails() {
		//orderId
		//customer info
		//cart details
		//payment status
	}

}
