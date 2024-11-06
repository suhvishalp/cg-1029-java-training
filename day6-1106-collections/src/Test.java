
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Product product1 = new Product(101, "AA", 90.00, 2);
		Product product2 = new Product(101, "AA", 90.00, 2);

		
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());

	}

}
