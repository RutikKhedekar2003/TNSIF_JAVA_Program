package com.tns.dayfive.interfacedemo;

public class Implementation {

	public static void main(String[] args) {
		
		
		class InterfaceImp implements ChildInterface{
			
			
			//print()
			public void print() {
				System.out.println("print the method"); //printing
			}
			
			//show()
			public void show() {
				System.out.println("show the method"); //printing
			}
			
		}
		
		InterfaceImp im = new InterfaceImp();
		im.print();
		im.show();

	}

}
