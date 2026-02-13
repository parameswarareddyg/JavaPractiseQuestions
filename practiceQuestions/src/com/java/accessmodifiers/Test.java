package com.java.accessmodifiers;

public class Test  extends Student{

	protected Test(int rollno) {
		super(rollno);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(30);
		System.out.println(s.rollno);
		s.printRollno();

	}

}
