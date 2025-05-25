package com.tns.dayfour;

//Interface - clear the complexity of code as well as the priority

//parent 1

interface mobile{
	void samsung(); //declaration


//interface one{
//int value;
//}

//parent 2

interface sim{
	void airtel();
}

//child class




public class MultipleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inner class or concrete class
		
		class Connectivity implements mobile, sim{
//			
			public void samsung()
			{
				System.out.println("The samsung mobile is more popular");
			}
			
			public void airtel()
			{
				System.out.println("The airtel sim has good network");
			}
		}
		
		
		Connectivity cn = new Connectivity();
		cn.airtel();
		cn.samsung();

	}
}
}
