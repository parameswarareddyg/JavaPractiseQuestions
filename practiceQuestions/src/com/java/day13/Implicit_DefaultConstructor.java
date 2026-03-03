package com.java.day13;


class Car {

    String brand;
    String model;
    int year;
    double price;

    // Method to display car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("------------------------");
    }
}

public class Implicit_DefaultConstructor {

	public static void main(String[] args) {
		Car benzcar = new Car();
		benzcar.displayDetails();
	}

}
