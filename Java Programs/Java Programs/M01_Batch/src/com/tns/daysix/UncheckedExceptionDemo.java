package com.tns.daysix;

public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		
		
	try {	
		int a = 10;
		int b = 0;
		
		int result = a/b;
		
		System.out.println(result);
	}
	
	catch (ArithmeticException e)
	{
		System.out.println("Unchecked Exception Caught: "+e.getMessage());
	}
	
	finally {
		
		System.out.println("Whether the exception is handled or not");
	}

	
	}
	
	
}
