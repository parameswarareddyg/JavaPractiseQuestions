package com.java.oops.encapsulation;

public class Student {

	private int rollno;
	private String name;
	private boolean isAttendent;
	
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Student(int rollno)
	{
		this.rollno  = rollno;
	}
	
	public void setIsAttendant(boolean flag)
	{
		isAttendent = flag;
		System.out.println("student accessed the attendance");
	}
	
	public boolean getIsAttendance()
	{
		return isAttendent;
	}
}
