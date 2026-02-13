package com.java.exceptions;

public class NumberFormatExceptionsExample {

	public static void main(String[] args) {

		String s ="nmj";
		try {
			int i =Integer.parseInt(s);
		}catch(NumberFormatException e)
		{
			System.out.println(e.toString());
		}
		System.out.println("Program ends");

	}

}
