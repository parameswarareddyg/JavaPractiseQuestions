package com.java.variables;

public class AnotherClass {
	
	public static void main(String[] args) {
		TypesOfVariables varr= new TypesOfVariables();
//		System.out.println("Instance Variable : "+ varr.number); --> private variable will not access outside the class
		System.out.println("Instance Variable : "+ varr.number1);
		System.out.println("Instance Variable : "+ varr.number2);
		System.out.println("Instance Variable : "+ varr.number3);
		TypesOfVariables.display();
	}

}
