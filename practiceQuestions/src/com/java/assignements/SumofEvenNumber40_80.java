package com.java.assignements;

public class SumofEvenNumber40_80 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i= 40; i<=80;i++)
		{
			if(i%2 == 0)
			{
				sum +=i;
			}
		}
		
		System.out.println("Sum of even numbers between 40 to 80 is "+sum);
	}

}
