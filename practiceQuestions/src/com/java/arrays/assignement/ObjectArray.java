package com.java.arrays.assignement;

public class ObjectArray {
	
	public static void main(String[] args) {
		Object [] arr= new Object[2];
		arr[0]=1;
		arr[1]="Paramesh";
		
		for (Object object : arr) {
			System.out.println(object);
		}
	}
	
}
