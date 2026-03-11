package com.java.day20;
abstract class Animal{
	
	int a;
	Animal(int a)
	{
		System.out.println("Animal Class Constructor"+a);
		this.a=a;
	}
	abstract void sound();
	  // Concrete method
    void sleep() {
        System.out.println("Sleeping...");
        //System.out.println("Value of a : "+a);
    }
}

class dog extends Animal{
	
	dog(int a){
		super(a);
		System.out.println("dog class Constructor called");
	}

	@Override
	void sound() {
		System.out.println("Dog sounds bow bow....");
	}
	
}

class cat extends Animal{
	cat(int a){
		super(a);
		System.out.println("Cat class Constructor called");
	}

	@Override
	void sound() {
		System.out.println("Cat sounds meow meow....");
		
	}
}
public class AbstractClass {

	public static void main(String[] args) {
//		Animal a = new Animal();// don't have access to create an object for abstract class.
		System.out.println("**************************************************");
		dog d = new dog(100);
		d.sleep();
		d.sound();
		System.out.println("**************************************************");
		cat c = new cat(500);
		c.sleep();
		c.sound();
		System.out.println("**************************************************");
	}

}
