package com.java.day27;



public class TryMultipleCatchExample {

	public static void main(String[] args) {

		try
		{
			int [] i = new int[5];
			i[5] =3;

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("*************************************************");
			System.out.println("getMessage() : "+e.getMessage());
			System.out.println("*************************************************");
			System.out.println("toString() : "+e.toString());
			System.out.println("*************************************************");
			System.out.println("printStackTrace() : ");
			e.printStackTrace();
			System.out.println("*************************************************");
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
		}
		catch(Throwable e)
		{
			System.out.println(" Throwable "+ e.toString());
			
		}
		System.out.println(1);
	}

}
