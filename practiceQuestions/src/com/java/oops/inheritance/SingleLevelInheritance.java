package com.java.oops.inheritance;

class ParentClass
{
	public void fun()
	{
		System.out.println("Parent Class Fun");
	}
}

public class SingleLevelInheritance extends ParentClass {

	
	public static void main(String[] args) {
		SingleLevelInheritance s = new SingleLevelInheritance();
		s.fun();
	}

}
