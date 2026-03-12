package com.java.day21;

class Calculator {

     int add(int a, int b) {
        return a + b;
    }
     int add(int a,int b,int c)
     {
    	 return a+b+c;
     }
     double add(double a, double b) {
        return a + b;
    }
}

//Compile Time Polymorphism  or Method Overloading
public class CompileTimePolymorphism {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(7.5, 5.6));
		System.out.println(obj.add(10, 20,30));
		

	}

}
