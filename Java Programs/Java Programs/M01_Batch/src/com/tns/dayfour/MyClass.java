package com.tns.dayfour;

public class MyClass {

	private int section; //instance variable
	private static int srNo; //static variable

	
	//static block
	
	static {
		System.out.println("---within the static block-----");
		srNo = 1000;;
	}
	
	
	//default constructor
	
	
	MyClass()
	{
		System.out.println("With in default constructor");
		section++; //0---->1
		srNo++; //1000----->1001
		
		
	}


	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}
	
	
	//static method
	
	static void display()
	{
		//System.out.println("Section: "+section);
		System.out.println("Serial No: "+srNo);
	}
	
	
}
