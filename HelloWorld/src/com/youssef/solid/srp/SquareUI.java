package com.youssef.solid.srp;
import java.util.Random;
public class SquareUI {

		public void draw()
		{
			boolean highReslutionMonitor = new Random().nextBoolean();
			
			if(highReslutionMonitor){
				
				System.out.println("Render a high resolution image of a square");
			
				
			} else {
				
				System.out.println("Render a low resolution image of a square");
			}
		}
		
		public void rotate(int degree)
			{

				System.out.println("Rotate the square by " + degree + " degrees");
				
			}
}
