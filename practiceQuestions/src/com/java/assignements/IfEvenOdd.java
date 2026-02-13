package com.java.assignements;

import java.util.Scanner;

public class IfEvenOdd {
	public static void main(String[] args) {
		int inputnumber;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter non decimal number to find even or odd");
		while(!sc.hasNextInt())
		{
			System.err.println("Enter a valid non decimal number");
			sc.next();
		}
		inputnumber = sc.nextInt();

		if(inputnumber % 2 == 0)
		{
			System.out.println(inputnumber + " is Even Number");
		}
		else
		{
			System.out.println(inputnumber + " is Odd Number");
		}
		sc.close();
	}
}
