package com.java.day3;

public class ParameterizedVariables {

	void add(int a,int b) //int a,int b are parameterized variables
	{
		System.out.println("Adding of Variable a : "+a+ " and Variable b : "+b+" is : "+(a+b));
	}
	
	public static void main(String[] args) {
		ParameterizedVariables pv = new ParameterizedVariables();
		pv.add(10,20);//10, 20 are arguments
	}

}
