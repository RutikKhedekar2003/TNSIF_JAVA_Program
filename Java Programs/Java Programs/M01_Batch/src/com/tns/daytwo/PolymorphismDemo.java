package com.tns.daytwo;

//polymorphism 

//parent class
class Animal{
	void sound()
	{
		System.out.println("The animal can able to make sound");
	}
}

//child class
class Dog extends Animal{
	void sound()
	{
		System.out.println("Dogs can bark");
	}
}

//child class
class Cat extends Animal{
	void sound()
	{
		System.out.println("The Cats are meowing");
	}
}


public class PolymorphismDemo {

	public static void main(String[] args) {
	
		//creation of object
		Animal myAnimal=new Animal();
		myAnimal.sound();
		
//		myAnimal = new Dog();
//		myAnimal.sound();
//
//		myAnimal = new Cat();
//		myAnimal.sound();
	}

}
