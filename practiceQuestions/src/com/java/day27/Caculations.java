package com.java.day27;

public class Caculations {

	public static void main(String[] args) {
		method2();
	}

	public static void method2()
	{
		method1();
	}
	public static void method1()
	{
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		try {
		System.out.println(5/0);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);

	}
}
