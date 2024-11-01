
public class InventoryManagementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product1 = new Product();
		product1.setProductId(101);
		product1.setProductName("Apple 16 Pro");
		product1.setPrice(100000.00);
		product1.setStock(10);
		
		Product product2 = new Product(102, "Apple 16 Max", 120000.00, 5);
		//..
		//..
		
		
		product1.displayProductInfo();
		product2.displayProductInfo();
		
		System.out.println("Total Count of Products : " + Product.count);
		
		
		CartLineItem item1 = new CartLineItem(product1, 2);
		CartLineItem item2 = new CartLineItem(product2, 3);
		
		Cart cart = new Cart(1001);
		cart.addCartLineItem(item1);
		cart.addCartLineItem(item2);
		
		cart.displayCartLineItems();
		 
	}

}
