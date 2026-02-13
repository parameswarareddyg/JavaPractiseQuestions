package com.java.exceptions;

public class TryBlock {

	public static void main(String[] args) {
		System.out.println("Program execution starts");
		int n =20;
		int m =0;
		int result =0;
		try
		{
		 //result = n/m;
			result =5;
		
		
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally code..");
		}
		System.out.println("output is : "+ result);
		System.out.println("Program execution ends");
	}
	
	
	

}
