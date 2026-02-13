package com.java.exceptions;

import java.io.IOException;

public class Child extends Parent {

	public void m1() 
	{
		System.out.println("Method 2");
	}
	
	public static void main(String[] args) {
	
		Child c = new Child();
		c.m1();
	}

}
