package com.java.day8;

public class NestedIfStatement1 {

	public static void main(String[] args) {
		int x = 10; int y = 20; 
		if (x == 10) { 
			System.out.println("x is greater than 10");
			if (y == 20) { 
				System.out.println("y is also greater than 20"); 
			}
		}
	}

}

