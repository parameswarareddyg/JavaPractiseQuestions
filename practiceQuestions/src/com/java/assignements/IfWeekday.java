package com.java.assignements;

import java.util.*;

public class IfWeekday {

	
	public static void main(String[] args) {
		String input ="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Day Type");
		input = sc.next();
		
		if(input.equalsIgnoreCase("sunday") ||input.equalsIgnoreCase("saturday"))
		{
			System.out.println("Today is Weekend");
		}else if(input.equalsIgnoreCase("monday") || input.equalsIgnoreCase("tuesday") || input.equalsIgnoreCase("wednesday") ||
				 input.equalsIgnoreCase("thursday") || input.equalsIgnoreCase("friday") )
		{
			System.out.println("Today is Week Day");
		}else {
			System.out.println("Entered Invalid "+input+" Day");
		}
		
		sc.close();
	}
}
