package com.java.day19;

public class Cat implements Animal{

	@Override
	public void eat(){
		System.out.println("Cat is eating");
	}
	
	@Override
	public void show()
	{
		System.out.println("Cat is showing tail");
	}
	public static void main(String[] args) {

		Cat c = new Cat();
		c.eat();
		c.show();
	}



}
