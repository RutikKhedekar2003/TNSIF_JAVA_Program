package com.tns.daythree;


class Demo
{
	public int publicVar = 10;
	private int privateVar = 20;
	protected int protectedVar = 30;
	int defaultVar = 40;
	
	
	public void display()
	{
		System.out.println("Displaying Private Variable: "+privateVar);
	}
}


class MainMethod extends Demo
{
	public void show()
	{
		System.out.println(publicVar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);
	}
}



public class AccessModifierDemo {

	public static void main(String[] args) {

		MainMethod d = new MainMethod();
		
		d.show();
		
		System.out.println(d.publicVar);
		System.out.println(d.protectedVar);
		System.out.println(d.defaultVar);
		
		
		Demo d1 = new Demo();
		d1.display();
		

	}

}
