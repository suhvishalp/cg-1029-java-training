
public class Product {
	
	private int productId;
	private String productName;
	private double price;
	private int stock;
	
	public static int count;
	
	
	//no-arg constructor / default constructor
	public Product() {					
		count++;
	}
	
	//parameterized constructor
	public Product(int productId, String productName, double price, int stock) {
		
		this();		//used to invoke other constructor of the same class
		
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void displayProductInfo() {
		System.out.println("Product Id" + this.productId + 
				" Product Name : " + this.productName + 
				" Price : " + this.price + 
				" Stock : " + this.stock);		
	}
										
	public boolean isStockAvailable(int quantity) {
		return quantity <= this.stock;
	}
	
	public void reduceStock(int quantity) {
		
		if(isStockAvailable(quantity)) 
			stock -= quantity;
		else 
			System.out.println("Insufficient Stock for Product " + this.productName);
		
	}

}
