package com.tns.daynine.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ProrityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> pq = new PriorityQueue<>();
		
		pq.add("Core Java");
		pq.add("React");
		pq.add("HTML");
		pq.add("Angular");
		
		
		System.out.println(pq);
		
		pq.remove();
		
		
		System.out.println("After Remove: "+pq);
		
		System.out.println("Poll Method: "+pq.poll());
		
		System.out.println("Final Queue: "+pq);
		
		
		Iterator<String> it = pq.iterator();
		
		while(it.hasNext())
		{
		System.out.println(it.next() + " ");	
		}
		
		
		System.out.println(pq.peek());
		
		
		System.out.println(pq.poll());
		
		
		System.out.println(pq.peek());
		
	}

}
