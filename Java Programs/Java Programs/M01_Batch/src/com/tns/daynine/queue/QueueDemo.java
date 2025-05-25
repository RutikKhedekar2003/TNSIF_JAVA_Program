package com.tns.daynine.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		
		Queue<Integer> q = new LinkedList<>();
		
		//Adding the elements from 0 to 5

		for(int i = 0; i < 5; i++)
			q.add(i);
		
		
		System.out.println("Elements of queue: "+q);
		
		
		
	//removes the head of the queue
		int removable = q.remove();
		System.out.println("Removed Element: "+removable);
		
		
		
		System.out.println("Elements of queue: "+q);
		
		
		int head = q.peek();
		System.out.println("Shows head of the queue: "+head);
		
		
		int size = q.size();
		System.out.println("Size of queue: "+size);
		
	}

}
