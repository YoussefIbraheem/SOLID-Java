package com.youssef.solid.isp;

public class XeroxWork implements IPrint, IScan, IFax {

	@Override
	public void print() {
		
		System.out.println("XeroxWork Printing...");

	}

	@Override
	public void getPrintSpoolDetails() {
		
		System.out.println("XeroxWork Print Spool Details...");

	}

	@Override
	public void scan() {
		
		System.out.println("XeroxWork Scanning...");

	}

	@Override
	public void scanPhoto() {
		
		System.out.println("XeroxWork Scanning Photo...");

	}

	@Override
	public void fax() {
		
		System.out.println("XeroxWork Faxing...");

	}

	@Override
	public void InternetFax() {
		// TODO Auto-generated method stub

	}

}
