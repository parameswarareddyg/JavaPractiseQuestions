package com.java.assignements;

import java.util.Scanner;

public class SwitchWeekday {
	public static void main(String[] args) {
		String input ="";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Day Type");
		input = sc.next();
		input = input.toLowerCase();
		switch(input)
		{
		case "sunday" :
		case "saturday":System.out.println("Weekend");
		                break;
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":System.out.println("Week Day");
		               break;
		default:System.out.println("Entered Invalid "+input+" Day");
		break;
		}

		sc.close();
	}
}
