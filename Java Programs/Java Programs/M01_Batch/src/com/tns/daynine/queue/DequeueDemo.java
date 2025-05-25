package com.tns.daynine.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeueDemo {

	public static void main(String[] args) {
		
		
		Deque<String> aq = new ArrayDeque<>();
		
		aq.add("A");
		aq.add("B");
		aq.add("C");
		aq.add("D");
		
		
		aq.offer("F");
		
		
		//offers element in front of queue
		aq.offerFirst("E");
		
		//offers element in last of queue
		aq.offerLast("G");
		
		
		Iterator<String> itr = aq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("After poll");
		String s = aq.poll();
		System.out.println("Poll Item: "+s);
		
		
		for(String item : aq)
		{
			System.out.println(item);
		}

	}

}
