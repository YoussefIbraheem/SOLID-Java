package com.youssef.solid.lsp;

public class Car extends Vehicle {
	
	public double getInteriorWidth(){
		return this.getCabinetWidth();
	}


	public double getCabinetWidth(){
		return 1.5;
	}

}
