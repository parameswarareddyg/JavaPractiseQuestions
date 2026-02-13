package com.java.oops.interfaces;

public class Lenovo implements Laptop {


	public void cut() {
		System.out.println("Lenovo cut code");

	}


	public void copy() {
		System.out.println("Lenovo copy code");
	}


	public void paste() {
		System.out.println("Lenovo paste code");

	}
	
	@Override
	public void security()
	{
		System.out.println("Lenovo Security Code");
	}
	
	

}
