package com.java.day18;

class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog
{
    void weep()
    {
        System.out.println("Puppy is weeping");
    }
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.eat();
//		a.bark();
//		a.weep();
		
		Dog d = new Dog();
		d.eat();
		d.bark();
//		d.weep();
		
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();

	}

}
