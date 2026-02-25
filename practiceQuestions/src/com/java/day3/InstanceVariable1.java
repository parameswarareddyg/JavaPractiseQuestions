package com.java.day3;

public class InstanceVariable1 {

	//instance variable
	int value = 10; //creation

	public static void main(String[] args) {
		InstanceVariable1 obj = new InstanceVariable1();
		System.out.println(obj.value); //variable access
		InstanceVariable1 obj1 = new InstanceVariable1();
		System.out.println(obj1.value);
		obj.value = 20; //variable modify
		System.out.println(obj.value);
		System.out.println(obj1.value);
	}

}
