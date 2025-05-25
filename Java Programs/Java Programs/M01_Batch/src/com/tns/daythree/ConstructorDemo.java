package com.tns.daythree;

class Student
{
	String name; //Instance Variable ---->belongs to the object instead of sticking with the class
	int age;
	
	
	//default
	
	Student()
	{
		
	}
	
	//parameterized
	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void details()
	{
		System.out.println("Student Name: "+name);
		System.out.println("Student Age: "+age);
	}
	
}



public class ConstructorDemo {

	public static void main(String[] args) {
	
		
		Student s = new Student("Ankitha",20);
		Student s1 = new Student("Nithya",22);
		
		s.details();
		s1.details();
		
		

	}

}
