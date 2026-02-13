package com.java.operators;

public class UnaryOperations {

	public static void main(String[] args) {

		byte i =20;
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);

		byte j = 30;
		System.out.println(--j);
		System.out.println(j--);
		System.out.println(j);


		int k =5,l;

		l = ++k + ++k + k++;

		System.out.println("L ="+l);

		l = k++ + ++k + ++k;

		System.out.println("L ="+l);

		k = ++k + ++k + k++;

		System.out.println("k ="+k);
	
	}
}
