package com.java.arrays.assignement;

public class AddTheElement_Multi {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, 
					  { 4, 5, 6 }, 
					  { 7, 8, 9 }, 
					  { 10, 11, 12 }
					 };

		int[][] b = { { 1, 2, 3 },
				      { 4, 5, 6 }, 
				      { 7, 8, 9 } 
				      };

		int rows = Math.min(a.length, b.length);
		int cols = Math.min(a[0].length, b[0].length);

		int[][] sum = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

		for (int[] row : sum) {
			for (int num : row) {
				System.out.printf("%-4d", num);
			}
			System.out.println();
		}

	}

}
