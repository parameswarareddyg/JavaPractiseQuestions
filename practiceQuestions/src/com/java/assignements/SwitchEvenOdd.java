package com.java.assignements;

import java.util.Scanner;

public class SwitchEvenOdd {

	public static void main(String[] args) {
		int inputnumber,result;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter non decimal number to find even or odd");
		while(!sc.hasNextInt())
		{
			System.err.println("Enter a valid non decimal number");
			sc.next();
		}
		inputnumber = sc.nextInt();
		result = inputnumber %2;
		switch(result)
		{
		case 0:System.out.println(inputnumber + " is even number");
			break;
		default :
			System.out.println(inputnumber + " is odd number");
			break;	   
		}
		sc.close();

	}

}
