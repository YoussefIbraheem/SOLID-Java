package com.youssef.solid.isp;

public class CannonPrinter implements IPrint {

	@Override
	public void print() {
		
		System.out.println("Cannon Printer is printing...");

	}

	@Override
	public void getPrintSpoolDetails() {
		
		System.out.println("Cannon Printer Print Spool Details...");

	}

}
