package com.tnsif.dayseven.multithreading;

public class ThreadClassDemo extends Thread {

	
	private int n;
	private String message;
	
	
	//constructor
	public ThreadClassDemo(int n, String message) {
		super();
		this.n = n;
		this.message = message;
	}
	
	
	
	
	public void run()
	{
		for(int i=0; i<n;i++)
		{
			try {
				Thread.sleep(300);
			}
			
			catch (Exception e)
			{
				System.err.println("Thread Interuppted "+e.getMessage());
			}
			
			
			System.out.println(message + i +" Current Thread"+ Thread.currentThread().getName());
		}
	}
	
	
	
	
}
