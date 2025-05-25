package com.tns.daythree;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		//Details of Employee
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Employee ID:");
		int empId = sc.nextInt();
		
		
		sc.nextLine();
		
		System.out.println("Enter Employee Name:");
		String empName = sc.nextLine();
		
		
		System.out.println("Enter Employee Salary:");
		double salary = sc.nextDouble();
		
		
		System.out.println("Employee ID"+empId);
		System.out.println("Employee Name"+empName);
		System.out.println("Employee Salary"+salary);
		

	}

}
