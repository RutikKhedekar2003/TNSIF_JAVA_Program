package com.tns.dayeight.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {


		
		List list = new ArrayList(); //creating empty array
		System.out.println("Size: "+list.size());

		
		System.out.println("Is my list is empty?"+list.isEmpty());
		
		list.add(10);
		list.add(20);
		list.add(true);
		list.add(false);
		list.add(20);
		list.add("Hello");
		list.add(56.73);
		list.add(20);
		list.add('A');
		list.add(5,"Welcome");
		list.add(20);
		
		System.out.println("List is "+list);
		
		System.out.println("Is list contains 15?"+list.contains(15));
		
		
		list.remove(false);
		System.out.println("List is"+list);
		
		//System.out.println(list.remove(20));//should be entered index
		
		
		System.out.println("Element at 5 location is: "+list.get(5));
		
		System.out.println("Element removed: "+list.remove(list.lastIndexOf(20)));//last occurance
		System.out.println("Element removed: "+list.remove(list.indexOf(20)));//last occurance
		
		
//		Collections.sort(list); //RTE - ClassCastException
//		System.out.println(list);
		
		
		list.clear();
		System.out.println("List is "+list);
		
		
		
		//Using Generic - Homogeneous List
		
		List<String> names = new ArrayList<>();
		names.add("Aarthi");
		names.add("Ramya");
		names.add("Lily");
		names.add("Shubu");
		names.add("Ankit");
		//names.add(10) - CTE - Type check or type safety
		
		
		System.out.println("Name List is: "+names);
		
		Collections.reverse(names);
		
		System.out.println("Reverse Name List is: "+names);
		
		
		
//		System.out.println("Sorting Name List is: "+names);
//		Collections.sort(names);
//		System.out.println();
		
		
		//Traversing a list
		
		
		Iterator<String> i = names.iterator();
		while(i.hasNext())
		{
			String nm = i.next();
			System.out.println(nm);
			
			//if(nm.equals("Shubu"))
			//	i.remove();
		}
		
		System.out.println("Name List is"+names);
		
		
		
		
	}

}
