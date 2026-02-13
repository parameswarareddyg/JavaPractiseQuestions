package com.java.arrays.assignement;

public class SumofIntegerSingle {

	public static void main(String[] args) {
		
		int sum=0;
		
		int a[] = new int[] {10,90,50,60,75,30};
		
		for(int i:a)
		{
			sum += i;
		}
		
		System.out.println("Sum of Integers in an Array : "+sum);

	}

}
