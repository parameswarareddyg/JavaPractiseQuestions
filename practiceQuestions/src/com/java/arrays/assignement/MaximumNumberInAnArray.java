package com.java.arrays.assignement;

public class MaximumNumberInAnArray {

	public static void main(String[] args) {
		int []a = new int[]{10,5,7,2,4,50};
		int max=a[0],index=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				index = i;
			}
		}
		System.out.println("Maximum Number in Array is "+max+" at index "+index);

	}

}
