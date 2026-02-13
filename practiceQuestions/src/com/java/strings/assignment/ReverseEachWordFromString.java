package com.java.strings.assignment;

public class ReverseEachWordFromString {

	public static void main(String[] args) {
		String val = new String("Hello this is Parameshwara Reddy");
		String [] words = val.split(" ");
		
		for(String a:words)
		{
			for(int i=a.length()-1;i>=0;i--)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print(" ");
		}

	}

}
