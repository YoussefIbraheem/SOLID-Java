package com.youssef.solid.srp;
import java.sql.Connection;
import java.sql.DriverManager;
public class StudentRepository {
	
	public void save(Student student)
	{  	
		String objectStr = "'"+student.getStudentId()+"'";
		Connection connection = null;
		try
		{
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","password");
			String sql = "INSERT INTO students (student_id) VALUES (" + objectStr + ")";
			connection.createStatement().execute(sql);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(connection != null)
				{
					connection.close();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}
	
}
