package com.tns.dayfive.polymorphism;

public class Bank {

	public static void main(String[] args) {
	
		RBI rbi; //reference variable
		
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());
		
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());
	}

}
