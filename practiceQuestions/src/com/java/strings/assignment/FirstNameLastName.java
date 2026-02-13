package com.java.strings.assignment;
import java.util.*;
public class FirstNameLastName {

	public static void main(String[] args) {
		String firstName,lastName;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name");
		firstName = sc.nextLine();
		
		System.out.println("Enter Last Name");
		lastName = sc.nextLine();
		
		System.out.println(lastName+","+firstName.toUpperCase().charAt(0));
		sc.close();

	}

}
