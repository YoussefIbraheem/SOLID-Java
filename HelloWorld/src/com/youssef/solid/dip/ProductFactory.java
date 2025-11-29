package com.youssef.solid.dip;

public class ProductFactory {
	
	public static ProductRepository create()
	{
		return new SQLProductRepository();
	}
	
}
