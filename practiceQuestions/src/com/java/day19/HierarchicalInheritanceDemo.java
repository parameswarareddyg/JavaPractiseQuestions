package com.java.day19;

//Parent Class
class Vehicle
{
	void startEngine()
	{
		System.out.println("Engine Started");
	}
}

//Child Class 1
class Car extends Vehicle
{
	void drive()
	{
		System.out.println("Car is Driving");
	}
}

//Child Class 2
class Bike extends Vehicle
{
	void ride()
	{
		System.out.println("Bike is Riding");
	}
}

//Child Class 3
class Truck extends Vehicle
{
	void loadGoods()
	{
		System.out.println("Truck is Loading Goods");
	}
}

//Main Class
public class HierarchicalInheritanceDemo
{
	public static void main(String[] args)
	{
		Car c = new Car();
		c.startEngine();
		c.drive();

		Bike b = new Bike();
		b.startEngine();
		b.ride();

		Truck t = new Truck();
		t.startEngine();
		t.loadGoods();
	}
}