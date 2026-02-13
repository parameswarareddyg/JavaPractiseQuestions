package com.java.strings.assignment;

public class ReverseAString {

	public static void main(String[] args) {
		String s = new String("Hello This is Paramesh");
		System.out.println(s.length());
		for(int i= s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
