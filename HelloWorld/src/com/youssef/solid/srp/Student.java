package com.youssef.solid.srp;

import java.util.Date;

public class Student {
	
	private String studentId;
	private Date studentDOB;
	private String address;
	private StudentRepository repository;
	
	public Student(String studentId, Date studentDOB, String address, StudentRepository repository)
	{
			this.studentId = studentId;
			this.studentDOB = studentDOB;
			this.address = address;
			this.repository = repository;
	}
	
	public void save()
	{
		this.repository.save(this);
	}
	
	public String getStudentId()
	{
			return studentId;
	}

	public void setStudentId(String studentId)
	{
			this.studentId = studentId;
	}
	
	public Date getStudentDOB()
	{
			return studentDOB;
	}
	
	public void setStudentDOB(Date studentDOB)
	{
			this.studentDOB = studentDOB;
	}
	
	public String getAddress()
	{
			return address;
	}

}
