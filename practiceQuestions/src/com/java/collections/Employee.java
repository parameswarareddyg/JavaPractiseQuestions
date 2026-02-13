package com.java.collections;
import java.util.*;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee(int id,String name,double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getid()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public double getSalary()
	{
		return salary;
	}
	public static void main(String[] args) {
		Vector<Employee> v = new Vector<>();
		v.add(new Employee(1,"Ramesh",99999.01));
		v.add(new Employee(2,"Shyam",7084.998));
		v.add(new Employee(3,"Revanth",99865.78));

		for (Employee employee : v) {
			
			System.out.println("Employee Id : "+employee.getid());
			System.out.println("Employee Name : "+employee.getName());
			System.out.println("Employee Salary : "+employee.getSalary());
			System.out.println();
			
		}
	}

}
