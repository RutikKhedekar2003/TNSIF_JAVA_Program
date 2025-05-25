package com.tnsif.dayseven.multithreading;

public class RunnableDemo {  //

	public static void main(String[] args) {
		
		Thread t1 = new Thread( () ->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Print thread one");
			}
			
				try {
					Thread.sleep(500);
				}
				
				catch(Exception e)
				{
					
				}
			
		});
		
		Thread t2 = new Thread( () ->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Print thread two");
			}
				try {
					Thread.sleep(500);
				}
				
				catch(Exception e)
				{
					
				}

		});
		
		t1.start();
		t2.start();
		
		
	}

}
