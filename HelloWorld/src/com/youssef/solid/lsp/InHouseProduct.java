package com.youssef.solid.lsp;

public class InHouseProduct extends Product {
	
	@Override
	public double getDiscount(){
			this.applyExtraDiscount();
			return discount; 
	}
	
	public void applyExtraDiscount(){
			discount = discount * 1.5;
	}

}
