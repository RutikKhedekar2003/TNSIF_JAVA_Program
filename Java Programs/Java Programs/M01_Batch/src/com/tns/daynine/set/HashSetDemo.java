package com.tns.daynine.set;

import java.util.HashSet;

public class HashSetDemo {
	
	
	static void addElements(HashSet<Integer> numberHashSet)

	{
		
		numberHashSet.add(10);
		numberHashSet.add(120);
		numberHashSet.add(34);
		numberHashSet.add(45);
		numberHashSet.add(77);
	
	//	System.out.println(numberHashSet.add(77));
		
	}
	
	

	public static void main(String[] args) {
		
		HashSet<Integer> numberHashSet = new HashSet<>();
		addElements(numberHashSet);
		

		HashSet<Integer> numberHashSet1 = new HashSet<>();
		numberHashSet1.add(10);
		numberHashSet1.add(120);
		numberHashSet1.add(34);
		numberHashSet1.add(45);
		numberHashSet1.add(77);
		
		
		
		System.out.println("Set 1"+numberHashSet);
		System.out.println("Set 2"+numberHashSet1);
		
		
		HashSet<Integer> numberHashSet2 = new HashSet<>();
		addElements(numberHashSet2);
		
		
		numberHashSet2.addAll(numberHashSet1);
		System.out.println(numberHashSet2);
	}

}
