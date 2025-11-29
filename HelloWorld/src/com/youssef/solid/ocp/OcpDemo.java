package com.youssef.solid.ocp;

public class OcpDemo {
	
	InsurancePremiumDiscountCalculator calculator = new InsurancePremiumDiscountCalculator();
	HealthInsuranceCustomerProfile customer = new HealthInsuranceCustomerProfile();
	
	
	public static void main(String[] args)
	{
		new OcpDemo().printDiscount();
	}
	
	void printDiscount()
	{
		int discountAmount = calculator.calculatePremiumDiscountPercent(customer);
		System.out.print(discountAmount);
	}
	
	
	

}
