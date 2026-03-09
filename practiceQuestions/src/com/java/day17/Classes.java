package com.java.day17;

class Car {
	
	//Properties
	private String color;
	private String brand;
	private double price;
	
	Car()
	{
		this.brand ="Unknown";
		this.color ="White";
		this.price = 100000.000;
	}
	
	Car(double price)
	{
		this.brand ="Benz";
		this.color = "Red";
		this.price = price;
	}
	Car(String color,double price)
	{
		this.brand ="Benz";
		this.color = color;
		this.price = price;
	}
	Car(String color,String brand,double price)
	{
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	
	
	//behaviour
	void engineOn()
	{
		System.out.println("Engine Started or On");
	}
	
	void engineOff()
	{
		System.out.println("Engine Stop or Off");
	}
	
	void accerate()
	{
		System.out.println("Acceratee....");
	}
	
	void brake()
	{
		System.out.println("Brake...");
	}
	
	void gearChange()
	{
		System.out.println("Changing Gear");
	}
	
	void display()
	{
		System.out.println("Car Properties");
		System.out.println("Brand : "+brand);
		System.out.println("color : "+color);
		System.out.println("Price : "+price);
	}
}

class BenzCar extends Car
{
	String seatingCapacity;
	
	void acFunctionality()
	{
		
	}
}
public class Classes {
	
	public static void main(String[] args) {
////		syntax
////		Classname objectname = new Classname();
//		
//		Car audi = new Car();
//
//		Car benz = new Car("Black","Benz",200000);
//		
//		Car obj = new Car(1200000);
//		
//		audi.display();
//		benz.display();
//		obj.display();
//		
		BenzCar obj1= new BenzCar();
		obj1.accerate();
		obj1.acFunctionality();
	}
	
}
