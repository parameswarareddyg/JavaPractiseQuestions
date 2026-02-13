package com.java.oops.abstraction;

//Abstract class
abstract class Vehicle {
 // Abstract method (no body)
 abstract void startEngine();

 // Regular method
 void fuelUp() {
     System.out.println("Fueling up the vehicle...");
 }
}

//Concrete subclass
class Car extends Vehicle {
 // Implementing the abstract method
 void startEngine() {
     System.out.println("Car engine started with key ignition.");
 }
}

//Another subclass
class ElectricScooter extends Vehicle {
 void startEngine() {
     System.out.println("Scooter engine started with button press.");
 }
}

//Main class to test
public class Main {
 public static void main(String[] args) {
     Vehicle myCar = new Car();
     myCar.startEngine();  // Output: Car engine started with key ignition.
     myCar.fuelUp();       // Output: Fueling up the vehicle...

     Vehicle myScooter = new ElectricScooter();
     myScooter.startEngine();  // Output: Scooter engine started with button press.
     myScooter.fuelUp();       // Output: Fueling up the vehicle...
 }
}
