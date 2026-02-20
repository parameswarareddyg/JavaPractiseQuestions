package com.java.day8;

import java.util.Scanner;

public class IfElseIfStatement {

	public static void main(String[] args) {
//		if (condition1) {
//		    // code to execute if condition1 is true
//		} else if (condition2) {
//		    // code to execute if condition2 is true
//		} else {
//		    // code to execute if all conditions are false
//		}

		int inputnumber = 0;
		
		System.out.println("Enter a Number ");
		Scanner sc = new Scanner(System.in);
		inputnumber = sc.nextInt();
		if(inputnumber > 0)
		{
			System.out.println("Positive Number");
		}
		else if(inputnumber < 0)
		{
			System.out.println("Negative Number");
		}
		else {
			System.out.println("Number is zero");
		}
		sc.close();
	}

}
