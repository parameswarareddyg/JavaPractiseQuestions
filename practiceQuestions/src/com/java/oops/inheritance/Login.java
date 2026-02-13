package com.java.oops.inheritance;

public class Login implements Iguest,IDeveloper,Iadmin {

	@Override
	public void manage() {
		System.out.println("Delete");
		
	}

	@Override
	public void write() {
	System.out.println("write");
		
	}

	@Override
	public void read() {
	System.out.println("Read");
		
	}

	

}
