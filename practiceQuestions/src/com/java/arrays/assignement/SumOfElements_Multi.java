package com.java.arrays.assignement;

public class SumOfElements_Multi {

	public static void main(String[] args) {
		
		int sum =0;
		int [][] arr = new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				sum +=arr[i][j];
			}
		}
		
		System.out.println("Sum of 3*3 Array : "+sum);
		

	}

}
