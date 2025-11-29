package com.youssef.solid.isp;

public class HPPrinterScanner implements IPrint, IScan {

	@Override
	public void scan() {
		
		System.out.println("HP Printer Scanner is scanning...");

	}

	@Override
	public void scanPhoto() {
		
		
		System.out.println("HP Printer Scanner is scanning photo...");

	}

	@Override
	public void print() {
		
		
		System.out.println("HP Printer Scanner is printing...");

	}

	@Override
	public void getPrintSpoolDetails() {
		
		
		System.out.println("HP Printer Scanner Print Spool Details...");

	}

}
