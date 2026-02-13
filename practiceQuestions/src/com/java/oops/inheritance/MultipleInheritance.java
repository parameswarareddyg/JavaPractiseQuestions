package com.java.oops.inheritance;

/*
 * Java doesn’t support multiple inheritance with classes directly to avoid ambiguity issues like the diamond problem.
 *  But it does support multiple inheritance through interfaces.
 * */

interface Flyable
{
	void fly(); //abstract method by default
}
interface Swimmable
{
	void swim();//abstract method by default
}
class Duck implements Flyable,Swimmable
{
	public void fly()
	{
		System.out.println("Flying...");
	}
	public void swim()
	{
		System.out.println("Swimming ...");
	}
}


public class MultipleInheritance  {

	public static void main(String[] args) {
		Duck b = new Duck();
		b.fly();
		b.swim();
	}

}
