package com.youssef.solid.lsp;

public class LspDemo {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		RaceCar raceCar = new RaceCar();
		
		car.getInteriorWidth();
		raceCar.getInteriorWidth();
		
		Product product = new Product();
		
		InHouseProduct inHouseProduct = new InHouseProduct();
		
		product.getDiscount();
		
		inHouseProduct.getDiscount();
		
		
		System.out.println("LSP Demo executed successfully.");
		
	}

}
