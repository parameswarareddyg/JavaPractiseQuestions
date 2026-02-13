package com.java.exceptions;

public class NestedTryExample {

	public static void main(String[] args) {
		try
		{
			try
			{
				System.out.println(3/0);
			}catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(2);
			try
			{
				String s =null;
				System.out.println(s.length());
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(3);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally code...");
		}
		System.out.println(4);
	}

}
