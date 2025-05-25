package com.tns.daytwo;

//Inheritance Demo


//Parent class or Base class
class Vehicle{
	void start() {
		System.out.println("The vehicle has started.....");
	}
}

//Child Class or Derived Class
class Car extends Vehicle {
	void honk() {
		System.out.println("The Car is Honking.....");
	}
}

public class InheritanceDemo {


	public static void main(String[] args) {
		Car c = new Car();
		c.honk();
c.start();
		
		

	}

}
