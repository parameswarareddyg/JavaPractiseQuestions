package com.java.day27;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionsExamples {

	public static void main(String[] args) throws IOException {
		//		Exception Keywords are of 5 types
		//		1.try
		//		2.catch
		//		3.finally
		//		4.throw
		//		5.throws

		int a ;
		int b;
		int result =0;


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer Value 1"); 
		a = sc.nextInt();

		System.out.println("Enter an integer Value 2"); 
		b = sc.nextInt();
		try {
			result = a/b;
			
		}
		catch(ArithmeticException e)
		{
			System.err.println("Arithmetic Exception "+e.getMessage());
			
		}
		finally {
			System.out.println("Value 1 / Value 2 is : "+result);
		}
		throw new IOException("IO Exception error");
		
		
	}
}
