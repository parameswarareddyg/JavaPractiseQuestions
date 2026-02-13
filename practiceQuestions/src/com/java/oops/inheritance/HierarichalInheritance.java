package com.java.oops.inheritance;

//Parent class
class Animal {
	void eat() {
		System.out.println("This animal eats food.");
	}
}

//Child class 1
class Dog extends Animal {
	void bark() {
		System.out.println("Dog barks: Woof!");
	}
}

//Child class 2
class Cat extends Animal {
	void meow() {
		System.out.println("Cat meows: Meow!");
	}
}

public class HierarichalInheritance {

	public static void main(String []args)
	{
		Dog dog = new Dog();
		dog.eat();   // inherited from Animal
		dog.bark();  // specific to Dog

		Cat cat = new Cat();
		cat.eat();   // inherited from Animal
		cat.meow();  // specific to Cat
	}
}
