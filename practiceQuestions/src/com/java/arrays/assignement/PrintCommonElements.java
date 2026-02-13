package com.java.arrays.assignement;

public class PrintCommonElements {

	public static void main(String[] args) {
		int element;
		int [][] a = new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		int [][] b = new int[][] {
			{1,11,12},
			{3,5,14},
			{15,16,9}
		};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				element = a[i][j];
				for(int k=0;k<b.length;k++)
				{
					for(int l=0;l<b[k].length;l++)
					{
						if(element == b[k][l])
						{
							System.out.print(element + " ");
						}
					}
				}
			}
		}

	}

}
