package com.java.arrays.assignement;

public class ArrayBasedCondition {

	public static void main(String[] args) {
		int [][] a = new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		int [][] b = new int[][] {
			{1,11,12},
			{13,5,14},
			{15,16,9}
		};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j] == b[i][j])
				{
					System.out.printf("%-3d",1);
				}
				else
				{
					System.out.printf("%-3d",0);	
				}
			}
			System.out.println();
		}

	}

}
