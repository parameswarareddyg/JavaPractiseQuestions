package com.java.day3;

class MyClass{
	static int value = 10; //different class static variable
}

class Students{
	static int value = 20;
}
public class StaticVariables {
	static int number  = 0; //same class static variable
	public static void main(String[] args) {
		System.out.println(number);
		System.out.println(MyClass.value);
		System.out.println(Students.value);
	
		number=10;
	
		MyClass.value =40;
		MyClass obj = new MyClass();
		MyClass obj1 = new MyClass();
		System.out.println(MyClass.value);
		System.out.println(obj.value);
		System.out.println(obj1.value);
	}

}
