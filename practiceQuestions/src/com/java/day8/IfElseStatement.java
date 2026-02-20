package com.java.day8;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		int inputnumber = 0;
		
		System.out.println("Enter a Number ");
		Scanner sc = new Scanner(System.in);
		inputnumber = sc.nextInt();
		
		if(inputnumber %2 == 0)
		{
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		sc.close();
	}

}
