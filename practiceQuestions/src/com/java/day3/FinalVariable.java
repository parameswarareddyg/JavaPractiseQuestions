package com.java.day3;

public class FinalVariable {
	final int a = 10; //instance final variable
	final static int b = 10; //static final variable
	
	public static void main(String[] args) {
		//local variables
		int c = 20;
		System.out.println("Local Variabe value : "+c);
		FinalVariable obj = new FinalVariable();
		FinalVariable obj1 = new FinalVariable();
		//obj.a =20;
		//obj1.a=20;
		//b=20;
		obj.fun();
	
	}
	
	void fun()
	{
		System.out.println(b);
		FinalVariable obj = new FinalVariable();
		System.out.println(obj.a);
	}
}
