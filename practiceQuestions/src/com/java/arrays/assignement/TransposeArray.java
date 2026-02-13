package com.java.arrays.assignement;

public class TransposeArray {

	public static void main(String[] args) {
		int [][] a = new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				
					System.out.printf("%-3d",a[j][i]);
				
			}
			System.out.println();
		}
				
	}

}
