package com.tns.dayfour;


//parent class
class Fruits
{
	void sweet()
	{
		System.out.println("The fruits are so sweet");
	}
}

//child 1 class
class Lemon extends Fruits
{
	void sour()
	{
		System.out.println("The lemon tastes so sour");
	}
}


//child 2 class
class Apple extends Fruits
{
	void tasty()
	{
		System.out.println("The apples are so tasty");
	}
}




public class HierarichicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lemon lm = new Lemon();
		lm.sour();
		lm.sweet();
		
		
		Apple a = new Apple();
		a.sweet();
		a.tasty();
		

	}

}
