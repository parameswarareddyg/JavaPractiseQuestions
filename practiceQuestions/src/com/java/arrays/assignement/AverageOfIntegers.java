package com.java.arrays.assignement;

public class AverageOfIntegers {

	public static void main(String[] args) {
		int sum=0;
		
		int a[] = new int[] {10,20,30,40};
		
		for(int i:a)
		{
			sum += i;
		}
		
		System.out.println("Average of Integers in an Array : "+(double)sum/a.length);

	}

}
