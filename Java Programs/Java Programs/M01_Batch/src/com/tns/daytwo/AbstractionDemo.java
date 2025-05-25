package com.tns.daytwo;

//Abstraction

abstract class Shape 
{
	
	abstract void draw(); //declaration
	
	void display() {
		System.out.println("The abstract method is defined here");
	}
}


class Circle extends Shape{
	
	void draw() {
		System.out.println("Abstract method implemented in circle class");
	}
}



public class AbstractionDemo {

	public static void main(String[] args) {
		
		Shape s = new Circle();
		s.display();
		s.draw();
		

	}

}
