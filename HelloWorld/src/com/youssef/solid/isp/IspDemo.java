package com.youssef.solid.isp;

public class IspDemo {
	
	public static void main(String[] args) {
		XeroxWork xw = new XeroxWork();
		xw.print();
		xw.scan();
		xw.fax();
		
		HPPrinterScanner hpps = new HPPrinterScanner();
		
		hpps.print();
		hpps.scan();
		
		CannonPrinter cp = new CannonPrinter();
		
		cp.print();
		
	}

}
