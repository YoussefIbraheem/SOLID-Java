package com.youssef.solid.lsp;

public class RaceCar extends Vehicle {
	
	public double getInteriorWidth(){
		return this.getCockpitWidth();
	}


	public double getCockpitWidth(){
		return 1.2;
	}

}
