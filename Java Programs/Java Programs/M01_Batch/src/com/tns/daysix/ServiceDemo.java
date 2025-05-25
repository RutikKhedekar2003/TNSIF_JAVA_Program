package com.tns.daysix;

import java.util.Scanner;

class InvalidMarksException extends Exception{
	
	public InvalidMarksException (String message)
	{
		super(message);
	}
	
}


public class ServiceDemo {
	
	
	public static boolean validateMarks(int[] marks) throws InvalidMarksException{
		for (int ele : marks) {
			if(ele < 0 || ele > 100)
				throw new InvalidMarksException("Marks should be between 0 to 100");
		}
		
		return true;
	}
	
	
	public static float calculatePercentage(int[] marks)
	{
		int total = 0;
		for (int value : marks)
			total += value;
		return(float)total / marks.length;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the number of subjects: ");
			int n = sc.nextInt();
			
			int[] marks = new int[n];
			System.out.println("Enter the marks for " + n + " subjects:");
			
			for(int i=0; i < n ; i++)
			{
				marks[i] = sc.nextInt();
			}
			
			
			validateMarks(marks);
			
			System.out.println("Percentage: "+calculatePercentage(marks) + "%");
			
		}
		
		catch(InvalidMarksException e)
		{
			System.out.println("Error: "+ e.getMessage());
		}
		
		catch(Exception e)
		{
			System.out.println("Invalid input! Please provide valid number:");
		}
		
		finally {
			sc.close();
		}
		
	}

}
