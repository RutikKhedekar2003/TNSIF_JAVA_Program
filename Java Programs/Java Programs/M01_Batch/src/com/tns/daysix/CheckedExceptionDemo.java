package com.tns.daysix;

//checked exception

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		
		try {
			File f = new File("Non_Existed_File.txt");
			Scanner sc = new Scanner(f);
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("Checked Exception Caught: "+e.getMessage());
			//e.printStackTrace();
		}

	}

}
