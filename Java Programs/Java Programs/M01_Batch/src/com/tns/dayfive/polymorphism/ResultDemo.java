package com.tns.dayfive.polymorphism;

public class ResultDemo {

	public static void main(String[] args) {

		System.out.println(OverloadingDemo.addition(10, 20));
		System.out.println(OverloadingDemo.addition(20.0f, 30.0f));
		System.out.println(OverloadingDemo.addition(30.0f, 40));
		System.out.println(OverloadingDemo.addition(15, 35.0f));
		System.out.println(OverloadingDemo.addition("Hello ", "World"));

	}

}
