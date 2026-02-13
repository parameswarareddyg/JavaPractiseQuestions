package com.java.oops.inheritance;

public class Admin extends Developer {
	

	public void write()
	{
		System.out.println("Write admin method");
	}
	
	public void manage()
	{
		System.out.println("Manage method");
		super.write();
		read();
	}

}
