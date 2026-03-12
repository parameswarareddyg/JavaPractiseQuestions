package com.java.exceptions;

public class IndexBoundExample {

	public static void main(String[] args) {

		String [] s = new String[5];
		s[4] ="new Array";
		System.out.println(s[4]);
		try {
			s[6] =" rtfg";
		}catch(Exception e)
		{
			System.err.println("Array Index out of Bounds");
		}
		
		int [] i = new int[4];
		//i[4] =30;
		System.out.println("Program ends");
	}

}
