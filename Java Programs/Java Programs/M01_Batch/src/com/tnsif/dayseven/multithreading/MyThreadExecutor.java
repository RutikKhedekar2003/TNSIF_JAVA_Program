package com.tnsif.dayseven.multithreading;

public class MyThreadExecutor {

	public static void main(String[] args) {
		
		
		MyThreadDemo m1 = new MyThreadDemo();
		
		//checks the thread is alive or not before starts
		System.out.println("Before runnable stage of Thread is alive or not?"+m1.isAlive());
		
		
		
		m1.start();
		
		
		try {
			Thread.sleep(4000);
		}
		
		
		catch(Exception e)
		{
			System.out.println("Thread Interuppted");
		}
		
		
		//checks the thread is alive or not after the exection
		System.out.println("After completed the execution, is alive or not? "+m1.isAlive());
		
	}

}
