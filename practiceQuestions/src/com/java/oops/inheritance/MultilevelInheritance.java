package com.java.oops.inheritance;

class Eat
{
	public void eats()
	{
		System.out.println("Eating...");
	}
}
class Bark extends Eat
{
	public void barks()
	{
		System.out.println("Barking");
	}
}
public class MultilevelInheritance extends Bark{

	public static void main(String[] args) {
		MultilevelInheritance m = new MultilevelInheritance();
		m.eats();
		m.barks();
	}

}
