package com.java.exceptions;



public class TryMultipleCatchExample {

	public static void main(String[] args) {

		try
		{
			int [] i = new int[5];
			i[5] =3;

		}
		catch(NullPointerException e)
		{
			System.out.println(e.toString());
		}catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.toString());
		}catch(Throwable e)
		{
			System.out.println(" Throwable "+ e.toString());
			
		}
		System.out.println(1);
	}

}
