package com.java.day8;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		int inputnum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Validate Wheter it is positive or not");
		inputnum = sc.nextInt();
		
		System.out.println("Recevied Value from User : "+inputnum);
		
		if(inputnum > 0)
		{
			System.out.println("Received Number is Postive");
		}
		
		sc.close();
	}
}
