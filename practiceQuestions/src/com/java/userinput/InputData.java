package com.java.userinput;

import java.util.Scanner;
import com.java.variables.*;
public class InputData extends TypesOfVariables{

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("What's your name ?");
//		String name = sc.nextLine();
//		System.out.printf("Hi ! %s , How r you ?",name);
//		System.out.println("Whats your age?");
//		Byte age = sc.nextByte();
//		System.out.println("age :" + age);
//		sc.close();
		
		//Instance TypeOfVariables
		TypesOfVariables obj = new TypesOfVariables();
		System.out.println(obj.number2);//public variable or method can able to access from anywhere
		InputData inputdata= new InputData();
		System.out.println(inputdata.number1);//Protected can able to access with in the same package or by extending subclass
//		System.out.println(inputdata.number3); //default can able to access with in the same package
	}

}
