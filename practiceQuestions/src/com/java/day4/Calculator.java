package com.java.day4;

public class Calculator {
	//instance variable->without static keyword
	//accessmodifier datatype variablename = value;
	public int instant_var = 0;
	
	//static variable-> static keyword
	//accessmodifier static datatype variablename = value;
	public static int static_var = 0;
	
	//accessmodifier  returntype functionname (parameterized variables){return 0;}->without static keyword
	public void add(int a,int b)  //function declaration
	{
		//local variables
		System.out.println("Value 1 : "+a);
		System.out.println("Value 2 : "+b);
		System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
//		sum of 10 and 20 is 30
	}
	
	
	public void sub()
	{
		
	}
	public static void main(String[] args) {
		//classname objectname/instance = new classname();
		Calculator cal= new Calculator();
		cal.add(5,6);//--->function calling //instance.functionname
		System.out.println("Instance variable : "+cal.instant_var);//-->instance.variablename

	}

}
