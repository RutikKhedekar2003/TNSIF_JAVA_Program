package com.tns.dayfive.interfacedemo;

public class GreetResult {

	public static void main(String[] args) {
		
		GreetImp g = new GreetImp();
		System.out.println(g.greet());
		
		
		//using lambda expression
		
		Greeting g1 = () -> {
			return "Hello All!!!";
		};
		
			System.out.println(g1.greet());
	}

}
