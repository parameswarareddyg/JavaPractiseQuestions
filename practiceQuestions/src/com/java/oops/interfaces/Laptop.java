package com.java.oops.interfaces;


public interface Laptop {

	void cut();
	public void copy();
	public void paste();
	public static final int NAME=10;
	
	default void security() {
		commonCode();
		System.out.println("Security Code");
	}
	
	static void capture()
	{
		commonCode();
		System.out.println("Camera Capture");
	}
	
	private static void commonCode()
	{
		System.out.println("Common Code");
	}

}
