package com.tns.dayeight.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		
		ll.add(20);
		ll.addFirst(30);
		ll.add(40);
		ll.add(50);
		ll.add(2,60);
		ll.addLast(10);
		
		System.out.println("Number List is: "+ll);
		
		System.out.println("First Element is: "+ll.getFirst());
		System.out.println("First Element is: "+ll.getLast());
		
		
		
		ll.removeFirst();
		ll.removeLast();
		
		
		System.out.println("Number List after removing first and last element: "+ll);
	}

}
