package com.java.accessmodifiers;

public class Student {
	
	 int rollno =300;
	
	protected Student(int rollno)
	{
		this.rollno = rollno;
	}
	
	protected void printRollno()
	{
		System.out.println(rollno);
	}
	
	public static void main(String[] args) {
		
		Student s = new Student(202);
		System.out.println(s.rollno);
	   s.printRollno();
	}

}
