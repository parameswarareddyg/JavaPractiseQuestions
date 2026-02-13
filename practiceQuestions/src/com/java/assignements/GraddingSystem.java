package com.java.assignements;

import java.util.*;

public class GraddingSystem {

	public static void main(String[] args) {
		
		float inputmarks = 0f;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Grading Application");
		System.out.println("Enter marks will let you know the Grade");
	
		while(!sc.hasNextFloat())
		{
			System.err.println("Invalid Input ! Enter Correct Number");
			sc.next();
		}
		
		inputmarks = sc.nextFloat();
		
		if(inputmarks <=  100 && inputmarks >= 75)
		{
			System.out.println("1'st Grade");
		}
		else if(inputmarks < 75 &&  inputmarks >= 60)
		{
			System.out.println("2'nd Grade");
		}
		else if(inputmarks < 60 &&  inputmarks >= 50)
		{
			System.out.println("3'rd Grade");
		}
		else if(inputmarks < 50 &&  inputmarks >= 35)
		{
			System.out.println("4'th Grade");
		}
		else if(inputmarks <35 && inputmarks >=0)
		{
			System.out.println("You Failed");
		}
		else
		{
			System.err.println("Enter Marks between 0 - 100");
		}
		
		sc.close();
	}

}
