package com.java.day8;

import java.util.Scanner;

//== ->address
//.equal() or .equalIgnoreCase(); -> value comparison

public class NestedIfStatement {
	public static void main(String[] args) {
		String resultType;
		String resultFirstRound,resultSecondRound;
		System.out.println("Result of Online Test (P/F)?");
		Scanner sc = new Scanner(System.in);

		resultType = sc.nextLine();

		if(resultType.equalsIgnoreCase("p"))
		{
			System.out.println("Enter Result of First Round (P | F)?");
			resultFirstRound = sc.nextLine();
			if(resultFirstRound.equalsIgnoreCase("P"))
			{
				System.out.println("Enter Result of Second Round (P | F)?");
				resultSecondRound = sc.nextLine();
				if(resultSecondRound.equalsIgnoreCase("P"))
				{
					System.out.println("You can wait for HR Round");
				}else
				{
					System.out.println("You Can go to HOME");
				}
			}else
			{
				System.out.println("You Can go to HOME");
			}
		}else
		{
			System.out.println("You Can go to HOME");
		}
		sc.close();

	}
}
