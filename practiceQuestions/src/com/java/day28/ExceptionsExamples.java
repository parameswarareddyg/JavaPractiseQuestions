package com.java.day28;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.Scanner;

public class ExceptionsExamples {

	public void disp()
	{
		System.out.println("HI.....");
	}
	public static void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative");
		}
		System.out.println("Age is: " + age);
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("*******************************************************************");
		try {
			ExceptionsExamples obj = null;
			obj.disp();
		}
		catch(NullPointerException e)
		{
			System.out.println("Object cannot be referenced Null Pointer exception");
		}
		System.out.println("Null Pointer Code End..");
		System.out.println("*******************************************************************");
		int[] arr = {1, 2, 3};
		System.out.println(arr[2]);
		try {
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bound Exception..");
		}

		System.out.println("ArrayIndexxoutofBound Exception ended..");

		System.out.println("*******************************************************************");

		String s = "JAVA Programming";
		System.out.println(s.length());
		System.out.println(s.charAt(15));
		try {
			System.out.println(s.charAt(16));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
		}
		System.out.println("String Index Out Of Bound Exception ended..");
		System.out.println("*******************************************************************");
		String s1="";
		int val=0;
		try {
			s1 = "1244645ad";
			val = Integer.parseInt(s1);
		}
		catch(NumberFormatException e) {
			System.out.println(e.toString());
		}

		System.out.println(val);
		System.out.println("*******************************************************************");
		Object obj = "Hello";
		Object [][] arr1 = {{1,3.2,"Hello"},{13,34}};
		for (Object[] object : arr1) {
			for(Object val1 :object) {
				System.out.println(val1);
			}
		}
		System.out.println("*******************************************************************");

		Object obj1 = "Hello";
		Object obj2 = 123;
		Integer num=0;
		try {
			num = (Integer) obj1;
			System.out.println(num);
		}
		catch(ClassCastException e)
		{
			e.printStackTrace();
		}
		Integer num1 = (Integer) obj2;
		System.out.println(num1);
		Thread.sleep(Duration.ofSeconds(10));//
		System.out.println("*******************************************************************");
		System.out.println("Illegal Argument Exception");
		setAge(5);
		Random r = new Random();
		try {
        int num3 = r.nextInt(-5);
        System.out.println(num3);
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
        
		System.out.println("*******************************************************************");
		Scanner sc = new Scanner(System.in);
		sc.close();
        try {
        sc.nextLine(); // ❌ IllegalStateException
        }
        catch(IllegalStateException e) {
        	System.out.println(e.toString());
        }
        
        System.out.println("*******************************************************************");
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write("Hello Java");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("*******************************************************************");
	}

}
