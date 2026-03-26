package com.java.day27;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		int[] arr = null;
		try {
		     arr= new int[2];
		    arr[0] = 20;
		    arr[1]= 0;
		    arr[5] = 10;
		    
		} catch (ArithmeticException e) {
		    System.out.println("Arithmetic Error");
		} catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("Array Error");
		}
		finally {
			try {
			System.out.println(arr[0]/arr[1]);
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
		}

	}

}
