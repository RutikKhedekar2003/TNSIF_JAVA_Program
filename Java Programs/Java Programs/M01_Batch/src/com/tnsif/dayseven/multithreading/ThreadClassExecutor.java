package com.tnsif.dayseven.multithreading;

public class ThreadClassExecutor {

	public static void main(String[] args) {

		ThreadClassDemo t1 = new ThreadClassDemo(5,"First ");
		ThreadClassDemo t2 = new ThreadClassDemo(7,"Second ");
		
		t1.start();
		t2.start();
	}

}
