package com.java.day21;

class Animal {
	//abstraction
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
    
    void eat()
    {
    	System.out.println("eating....");
    }
}

//RunTime Polymorphism or Operator Overriding or Method Overriding
public class RunTimePolymorphism {

	public static void main(String[] args) {

		Animal d = new Dog();//run time polymorphism
		d.sound();
//		d.eat();
		
		Dog d1 = new Dog(); //normal dog object -->No Polymorphism
		d1.sound();
		d1.eat();
	}

}
