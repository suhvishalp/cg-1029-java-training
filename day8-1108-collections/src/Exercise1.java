import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 
 * Create a Product class with attributes like id, name, price, and category.
 * 
	Create a method getProductsByCategory which takes a List<Product> and a String category as input, 
	and returns a List<Product> containing products that belong to the specified category.
	
	Create a method getTopRatedProducts which takes a Map<Product, Double> 
	(where each product is mapped to its rating) and returns a Set<Product> containing the top 3 
	highest-rated products.
	
	Create a method getRecommendationsForUser which takes a Map<String, Set<Product>> 
	(where the key is a userId and the value is a Set of products that the user has viewed) and 
	a String userId. The method should return a List<Product> containing product recommendations 
	for the user based on other users' viewing habits. (Hint: Find other users who have viewed 
	similar products, and recommend products they viewed that the current user has not yet viewed.)
 */

// Product class to represent each product with id, name, price, and category.
class Product {
    private int id;
    private String name;
    private double price;
    private String category;

    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + category + ")";
    }
}

// ProductService class to handle operations on collections of products.
class ProductService {
    
    // Method to filter products by a specific category.
    public List<Product> getProductsByCategory(List<Product> products, String category) {
        List<Product> result = new ArrayList<>();
        //
        //
        
        return result;
    }

    // Method to get the top-rated products from a map of product ratings.
    public Set<Product> getTopRatedProducts(Map<Product, Double> productRatings) {
        List<Map.Entry<Product, Double>> entries = new ArrayList<>(productRatings.entrySet());
        
        // Sort entries based on the rating value in descending order
        

        // Select the top 3 products from the sorted list
        Set<Product> topRatedProducts = new HashSet<>();
        
        //
        //
        
        
        return topRatedProducts;
    }

    // Method to recommend products to a user based on other users' viewing habits.
    public List<Product> getRecommendationsForUser(Map<String, Set<Product>> userViewedProducts, String userId) {
        Set<Product> viewedByUser = userViewedProducts.getOrDefault(userId, new HashSet<>());
        Set<Product> recommendations = new HashSet<>();

        // Loop through each entry in the map
        
        //
        //
        

        return new ArrayList<>(recommendations);
    }
}

// Main class to test the ProductService methods


public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Product p1 = new Product(1, "Laptop", 1500, "Electronics");
	        Product p2 = new Product(2, "Headphones", 200, "Electronics");
	        Product p3 = new Product(3, "Shirt", 50, "Clothing");
	        Product p4 = new Product(4, "Phone", 800, "Electronics");
	        Product p5 = new Product(5, "Shoes", 100, "Clothing");

	        ProductService productService = new ProductService();

	        // Example list of products
	        List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);

	        // Example: Get products by category
	        System.out.println("Electronics Products: " + productService.getProductsByCategory(products, "Electronics"));

	        // Example: Get top-rated products
	        Map<Product, Double> ratings = new HashMap<>();
	        ratings.put(p1, 4.7);
	        ratings.put(p2, 4.5);
	        ratings.put(p3, 4.8);
	        ratings.put(p4, 4.9);
	        ratings.put(p5, 4.6);

	        System.out.println("Top Rated Products: " + productService.getTopRatedProducts(ratings));

	        // Example: Get recommendations for user
	        Map<String, Set<Product>> userViewed = new HashMap<>();
	        userViewed.put("user1", new HashSet<>(Arrays.asList(p1, p2)));
	        userViewed.put("user2", new HashSet<>(Arrays.asList(p2, p3, p5)));
	        userViewed.put("user3", new HashSet<>(Arrays.asList(p1, p4, p5)));

	        System.out.println("Recommendations for user1: " + productService.getRecommendationsForUser(userViewed, "user1"));
	   
	}

}
