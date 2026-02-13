package com.practice.polymorphism;

public class Cat extends Animal{
	
	public Cat()
	{
		System.out.println("Cat Constructor Called");
	}
	
	@Override
	public void Sound()
	{
		System.out.println("Cat Sounds as Meow ");
	}
	
	@Override
	public void eat()
	{
		System.out.println("Cat is Eating ");
	}
	
	public void bark()
	{
		System.out.println("Cat is Barking");
	}
	
	public static void main(String[] args) {
		Animal ab = new Animal();
		ab.Sound();
		
		Animal a = new Cat();
		a.Sound();
		a.eat();
	}
}
