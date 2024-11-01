
public class Cart {

	private int cartId;
	private CartLineItem[] cartLineItems;
	private int itemCount;
	
	public Cart() {
		this.cartLineItems = new CartLineItem[10];
		this.itemCount = 0;
	}
	
	public Cart(int cartId) {
		this();
		this.cartId = cartId;
	}
	
	public void addCartLineItem(CartLineItem cartLineItem) {
		//logic to add the given item to the cartLineItems[]
		if(itemCount < cartLineItems.length) {
			//add the given item to the cartLineItems array
			
			cartLineItems[itemCount++] = cartLineItem;
		
		}else {
			System.out.println("The Cart is full : cannot add more items");
		}
		
	}
	
	public void removeCartLineItem(CartLineItem cartLineItem) {
		//logic to remove the given item from the cart
		
	}
	
	public void updateQuantity(CartLineItem cartLineItem) {
		//logic to updateQuantity of the given cartLineItem
		
	}
	
	
	public double calcualteTotalCost() {
		
		//logic to calculate the total cart cost
		
		double totalCost = 0.0;
		
		for(int i=0; i < itemCount; i++) {
			totalCost += cartLineItems[i].calculateItemCost();
		}
		
		return totalCost;
	}
	
	
	public void displayCartLineItems() {
		System.out.println("\n----------------------------");
		System.out.println("\n Cart Id: " + this.cartId);
		
		for(int i=0; i < itemCount; i++) {
			CartLineItem item = cartLineItems[i];
			System.out.println("\t Product: " + item.getProduct().getProductName() + 
						" Price: " + item.getProduct().getPrice() + 
						" Quantity: " + item.getQuantity() + 
						" Item Cost: " + item.calculateItemCost()
					);
		}
		
		System.out.println(" Total Cost: " + calcualteTotalCost());

		System.out.println("\n----------------------------");

	}
	
}
