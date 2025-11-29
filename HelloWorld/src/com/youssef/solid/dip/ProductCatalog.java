package com.youssef.solid.dip;
import java.util.List;

public class ProductCatalog {
	
	private ProductRepository productRepository;
	
	public ProductCatalog(ProductRepository productRepository)
		{
			this.productRepository = productRepository;
		}
			
	public void listAllProducts()
		{
			List<String> allProductNames = 	
			productRepository.getAllProductNames();
			
			for(String productName : allProductNames)
			{
				System.out.println("Product Name: " + productName);
			}
		}

}
