package com.java.arrays;

public class Arrays {

	public static void main(String[] args) {

//		 int [] b = new int[] {4,5,6}; 
//		 int [] d = new int[] {4,5,6};
//		 int j =b.length;
//		 for(int i =0;i<j;i+=2)
//		 { 
//			 System.out.println(b[i]);
//		}
//		 System.out.println("------------"); 
//		 for(int h:b) { System.out.println(h); }
//		  
//		  System.out.println("-------------");
//		  Object [] obj = new Object[]{2,"Tinku","36.6"};
//		 
//		  for (Object v : obj) { System.out.println(v); }
		

//		// Arrays a = "TEST";
		String s = "TEST";
		String t = "TEST";

		String s1 = new String("TEST");
		System.out.println(s==t);
		System.out.println(s + " " + s1);

		System.out.println(s == s1);
		
		
		
		
		
//		int[][] i = new int[2][3];
//
//		i[0][0] = 3;
//		i[0][1] = 2;
//		i[0][2] = 3;
//
//		i[1][0] = 13;
//		i[1][1] = 22;
//		i[1][2] = 23;
//		for (int[] js : i) {
//			System.out.println(js);
//		}
//
//		System.out.println("---------------");
//		int[][] j = new int[][] { { 3, 4 }, { 4, 5, 5, 78 }, { 6, 8, 9 }
//
//		};
//
//		for (int k = 0; k < j.length; k++) {
//			// int [] l =j[k];
//			for (int m = 0; m < j[k].length; m++) {
//				System.out.print(j[k][m] + " ");
//			}
//			System.out.println();
//		}

		
		int [][] abc = new int [][] {{1,2},{1,2,3},{1,2,3,4,5}};
		for(int i=0;i<abc.length;i++)
		{
			for(int j=0;j<abc[i].length;j++)
			{
				System.out.print(abc[i][j]+" ");
			}
			System.out.println();
		}
	}

}
