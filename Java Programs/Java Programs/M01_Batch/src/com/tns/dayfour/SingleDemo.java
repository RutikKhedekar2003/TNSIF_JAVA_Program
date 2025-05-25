package com.tns.dayfour;

//parent class


class Animal
{
	void sound() //property ----attribute or behavior
	{
		System.out.println("The animals can make sound");
	}
}


//child class


class Dog extends Animal
{
	void bark()
	{
		System.out.println("The dog is barking....");
	}
}


public class SingleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog d = new Dog();
		d.bark();
		d.sound();
		
		
	}

}
