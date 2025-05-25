package com.tns.daythree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReaderDemo {

	public static void main(String[] args)throws IOException {
		
		//Buffered Reader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your age: ");
		
		int age = Integer.parseInt(br.readLine());
		
		System.out.println(age);
		

	}

}
