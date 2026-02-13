package com.java.strings.assignment;

import java.util.*;
public class NumberOfOccurencesOfCharacter {

	public static void main(String[] args) {
		String val = new String();
		String target=new String();
		char targetChar;
		int count =0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter String");
		val = sc.nextLine();
		
		System.out.println("Enter target Character");
		target =sc.nextLine();
		targetChar = target.charAt(0);
		for(char a:val.toCharArray())
		{
			if(a == targetChar)
			{
				count++;
			}
		}
		
		System.out.println("Total number of Occuerence of '"+target+"' in '"+val+"' String is "+count);
		sc.close();
		
	}
}
