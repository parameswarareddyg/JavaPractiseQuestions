package com.java.operators;

public class UnaryOperations {

	public static void main(String[] args) {

		/*
		 * k -> variable name
		 * 5  ->value
		 * 0x1 ->address
		 */
		byte i =20;   
		System.out.println(++i);//-->20 --> 21
		System.out.println(i++);//21->22
		System.out.println(i);//22

		byte j = 30;
		System.out.println(--j);//29
		System.out.println(j--);//29
		System.out.println(j);//28


		int k =5,l;
		//	6+7+7
		l = ++k + ++k + k++;

		System.out.println("L ="+l);
		//k=8
		/*
		 * k 
		 * 11
		 * 0x1
		 */
		//8+10+11
		l = k++ + ++k + ++k;

		System.out.println("L ="+l);
		//k =11;
		//12+13+13
		k = ++k + ++k + k++;

		System.out.println("k ="+k);
	
	}
}
