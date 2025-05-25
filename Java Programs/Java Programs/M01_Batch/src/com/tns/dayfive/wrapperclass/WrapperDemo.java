package com.tns.dayfive.wrapperclass;

public class WrapperDemo {

	public static void main(String[] args) {

		//unboxing -- object to primitive dataype
		
		Integer i = new Integer(10); //Deprecated ---->outdated
		System.out.println(i);
		
		//first way
		
		int b = i.intValue();
		System.out.println(b);
		
		
		//second way
		
		int c = i;
		System.out.println(c);
		
		
		//Autoboxing - primitive datatype ------> object
		
		int d = 200;
		Integer it = d;
		
		System.out.println(it);
		
	}

}
