package com.youssef.solid.srp;

public class SrpDemo {
	
	public static void main(String[] args)
	{
		Square square = new Square();
		System.out.println("Area: " + square.calculatedArea());
		System.out.println("Perimeter: " + square.calculatePerimeter());
		
		StudentRepository repository = new StudentRepository();
		
		Student student = new Student("S001", null, "123 Main St", repository);
		
		student.save();
		
		System.out.println("Student with ID " + student.getStudentId() + " saved successfully.");
		
	}

}
