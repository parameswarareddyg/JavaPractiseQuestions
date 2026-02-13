package com.practice.classes;

public class SampleClass {

	//Instance Variables
	int id =0;
	String name = "";

	//Static Variables
	static int marks = 0;
	public SampleClass(int a,String b,int c)//Parameter Variables
	{
		id = a;
		name = b;
		marks = c;
	}
	void Display()
	{
		System.out.println("ID : "+id+", Name : "+name + " Marks : "+marks);
	}
	public static void main(String[] args) {
		//Local Variables
		int val =10;
		System.out.println("Local Variable : "+ val);
		SampleClass s = new SampleClass(1,"Paramesh",100);
		s.Display();
	}
}
