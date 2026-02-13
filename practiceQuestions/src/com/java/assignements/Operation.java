package com.java.assignements;

import java.util.*;
public class Operation {

	public static void main(String[] args) {
		double firstNumber,secondNumber;
		String operatorType;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First number");
		while(!sc.hasNextDouble())
		{
			System.err.println("Enter a valid number");
			sc.next();
		}
		firstNumber = sc.nextDouble();

		System.out.println("Enter Second number");
		while(!sc.hasNextDouble())
		{
			System.err.println("Enter a valid number");
			sc.next();
		}
		secondNumber = sc.nextDouble();

		System.out.println("Enter Operator Type to Perform");

		operatorType = sc.next().trim();

		switch(operatorType)
		{
		case "+": System.out.println("Addition : "+ (firstNumber+secondNumber));
		break;
		case "-": System.out.println("Substraction : "+ (firstNumber-secondNumber));
		break;
		case "*": System.out.println("Multiplication : "+ firstNumber*secondNumber);
		break;
		case "/": if (secondNumber == 0) {
			System.err.println("Error: Division by zero is not allowed.");
		} else {
			System.out.println("Division: " + (firstNumber / secondNumber));
		}
		break;
		case "%": System.out.println("Modulus : "+ firstNumber%secondNumber);
		break;
		default:
			System.err.println("Entered Invalid Operator");
			break;
		}

		sc.close();

	}

}
