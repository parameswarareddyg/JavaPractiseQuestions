package com.java.strings.assignment;
import java.util.*;
public class PalindromeValidation {

	public static void main(String[] args) {
		String input,reverse="";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a word to validate Palindrome or Not");
		input = sc.next();


		for(int i=input.length()-1;i>=0;i--)
		{
			reverse +=input.charAt(i);
		}

		if(input.toLowerCase().equals(reverse.toLowerCase()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		sc.close();

	}

}
