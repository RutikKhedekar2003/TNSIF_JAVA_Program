package com.tnsif.dayseven.multithreading;

public class ThreadMethodDemo {

	public static void main(String[] args) {
		
		
		ThreadClassDemo t1 = new ThreadClassDemo(4,"Third ");
		ThreadClassDemo t2 = new ThreadClassDemo(6,"Fourth ");
		
		t1.start();
		t2.start();
		
		
		Thread.currentThread().setName("Parent Thread");// setting the name for current thread class
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println("Current Thread: "+Thread.currentThread());
		
		
		
		
		try {
			t1.join(); //waits until the thread t1 dies
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println("Thread Interrupted");
		}
		
		System.out.println("---------End of the exection--------");
		
	}

}
