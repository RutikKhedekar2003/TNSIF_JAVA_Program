package com.tns.dayfour;


//grandparent class
class Flower{
	void bloom()
	{
		System.out.println("The flowers are blooming beautifully");
	}
}

//parent class
class Rose extends Flower {
	void smell()
	{
		System.out.println("The Rose smells so good");
	}
}

//child class
class Lotus extends Rose{
	void shine()
	{
		System.out.println("The Lotus shines bright in sunlight");
	}
}


public class MultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lotus l = new Lotus();
		l.bloom();
		l.shine();
		l.smell();
		

	}

}
