package com.java.day13;

class Bike {

    String brand;
    String model;
    int year;
    double price;

    // 1️⃣ No argument constructor
    Bike() {
        brand = "Unknown";
        model = "Not Specified";
        year = 0;
        price = 0.0;
    }

    // 2️⃣ Parameterized Constructor
    Bike(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    // Method to display car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("------------------------");
    }
}


public class NoArgumentConstructor {

	public static void main(String[] args) {
		Bike honda = new Bike(); //No argument constructor
		honda.displayDetails();
		
		Bike pulsar = new Bike("Pulsar","125 Carbon",2026,140000); // Parameterised Constructor
		pulsar.displayDetails();
	}

}
