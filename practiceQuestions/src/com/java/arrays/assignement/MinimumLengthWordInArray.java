 package com.java.arrays.assignement;

public class MinimumLengthWordInArray {

	public static void main(String[] args) {
		String[] arr = new String[] {"Hello","this","is","Parameswara","Reddy"	};
		String word=arr[0];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length() < word.length())
			{
				word =arr[i];
				index =i;
			}
		}
		System.out.println("Minimum Length word is '"+word+"' at Index "+index);
	}

}
