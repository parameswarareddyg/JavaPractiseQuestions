package com.java.assignements;

import java.util.Vector;
import java.util.Scanner;

public class Student {
	static int idcounter = 0;
	private int id = 0;
	private String name ="",college = "";
	static String collegeval ="GPCET";
	public Student()
	{
		this("Unknown");
	}
	
	public Student(String name)
	{
		this.id = ++idcounter;
		this.name = name;
		this.college = collegeval;
	}
	
	void Display()
	{
		System.out.printf("%-5d|%-20s|%-20s\n", id,name,college);
	}
	
	static void displayAllStudents(Vector<Student> vec)
	{
		System.out.printf("%-5s|%-20s|%-20s\n", "id", "Name", "College");

		System.out.println(("-").repeat(45));
		
		for(Student v :vec)
		{
			v.Display();
			
		}
	}
	public static void main(String[] args) {
	
		int size;
		String name,choice="";
		Vector<Student> vec = new Vector<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of students to be stored in the database.");
		
		while(!sc.hasNextInt())
		{
			System.err.println("Please enter a valid number of students to be stored in the database.");
			sc.next();
		}
		
		size = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < size; i++) {
		    while (!(choice.equals("yes") || choice.equals("no"))) {
		        System.out.println("Do you want to enter student details? (yes/no)");
		        choice = sc.nextLine().trim().toLowerCase();

		        if (!(choice.equals("yes") || choice.equals("no"))) {
		            System.err.println("Invalid input! Please enter 'yes' or 'no'.");
		        }
		    }

		    if (choice.equals("yes")) {
		        System.out.println("Enter Student Name:");
		        name = sc.nextLine();
		        vec.add(new Student(name));
		    } else {
		        vec.add(new Student()); // Adds a default student
		    }
		    
		}
		displayAllStudents(vec);
		sc.close();
	}
}
