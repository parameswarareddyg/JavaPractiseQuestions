package com.java.constructors;

import com.java.bank.HDFC;

public class Default {
	int i;
	public void test()
	{
		System.out.println("Testing");
	}

	
	/*
	 * public Default() { i =20; System.out.println(i); }
	 */
	 
	public Default(int i)
	{
	   this.i=i;
	   System.out.println(i);
	}
	
	public static void main(String[] args) {
		Default d = new Default(20);
		d.test();
	}

}
