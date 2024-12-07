package com.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.entities.Category;
import com.demo.repositories.CategoryRepository;

@SpringBootApplication
public class Day1206EcommerceAppEntityRelationshipsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Day1206EcommerceAppEntityRelationshipsApplication.class, args);
//        CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);
//
//        // Step 1: Create a top-level category
//        Category electronics = new Category();
//        electronics.setName("Electronics");
//        electronics.setDescription("All electronic items");
//        categoryRepository.save(electronics);
//        System.out.println("Created Category: " + electronics);
//
//        // Step 2: Create a subcategory
//        Category smartphones = new Category();
//        smartphones.setName("Smartphones");
//        smartphones.setDescription("All smartphones");
//        smartphones.setParentCategory(electronics);
//        categoryRepository.save(smartphones);
//        System.out.println("Created Subcategory: " + smartphones);
//
//        // Step 3: Fetch and display all top-level categories
//        List<Category> topLevelCategories = categoryRepository.findTopLevelCategories();
//        System.out.println("Top-Level Categories: " + topLevelCategories);
//
//        // Step 4: Fetch and display all subcategories of "Electronics"
//        List<Category> subcategories = categoryRepository.findSubcategoriesByParentId(electronics.getId());
//        System.out.println("Subcategories of Electronics: " + subcategories);
//
//        // Step 5: Update a category
//        electronics.setDescription("Updated description for electronics");
//        categoryRepository.save(electronics);
//        System.out.println("Updated Category: " + electronics);
//
//        // Step 6: Delete a subcategory
//        categoryRepository.delete(smartphones);
//        System.out.println("Deleted Subcategory: Smartphones");
//
//        // Verify deletion
//        subcategories = categoryRepository.findSubcategoriesByParentId(electronics.getId());
//        System.out.println("Subcategories of Electronics after deletion: " + subcategories);
//   
//		
		
		
		
//		// Create ProductType
//		ProductType shirtType = new ProductType();
//		shirtType.setName("Shirt");
//		shirtType.setAttributes(List.of(
//		    new AttributeDefinition("Size", AttributeType.ENUM, List.of("S", "M", "L", "XL")),
//		    new AttributeDefinition("Color", AttributeType.ENUM, List.of("Red", "Blue", "Green"))
//		));
//
//		// Create Product
//		Product shirt = new Product();
//		shirt.setName("Slim Fit Shirt");
//		shirt.setDescription("A stylish slim-fit casual shirt.");
//		shirt.setPrice(new BigDecimal("25.00"));
//		shirt.setProductType(shirtType);
//
//		// Create Variants based on ProductType
//		ProductVariant redMedium = shirt.createVariant(
//		    "SHIRT-M-RED",
//		    Map.of("Size", "M", "Color", "Red"),
//		    50,
//		    BigDecimal.ZERO
//		);
//
//		ProductVariant blueLarge = shirt.createVariant(
//		    "SHIRT-L-BLUE",
//		    Map.of("Size", "L", "Color", "Blue"),
//		    30,
//		    new BigDecimal("2.00")
//		);
	}

}
