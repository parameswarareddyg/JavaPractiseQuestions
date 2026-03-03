package com.java.day12;
//Default or Implicit Constructor
class Bike {
	int speed;
	
	public void display()
	{
		System.out.println("Speed of the Bikes is : "+speed);
	}
}

class Car{
	int topspeed;
	Car()//No Argument constructor - Class name should be same as constructor name and without parameters
	{
		topspeed = 100;
		System.out.println("Implicit Constructor");
	}
	Car(int topspd){ //parameterised constructor-Class name should be same as constructor name and with parameters
		topspeed = topspd;
	}
	public void displayCarTopSpeed()
	{
		System.out.println("Speed of the Car is : "+topspeed);
	}
}


public class Constructors {
	public static void main(String[] args) {
		Bike b= new Bike(); //implicit constructor will be created
							//if any Class doesn't implemented constructor
							//and call by at the time of object creation.
		b.display();
		
		Car c = new Car();
		c.displayCarTopSpeed();
		
		Car tataNexon = new Car();
		tataNexon.displayCarTopSpeed();

		Car benzCar = new Car(210);
		benzCar.displayCarTopSpeed();
		
		
	}
}
