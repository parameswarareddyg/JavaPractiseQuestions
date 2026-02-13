package com.java.strings.assignment;

public class EvenPositionWordsFromString {

	public static void main(String[] args) {
		String val = new String("Hello this is Parameshwara Reddy");
		String [] words = val.split(" ");
		String [] evenwords =new String[words.length];
		int index =0;
		for(int i=0;i<words.length;i++)
		{
			if(i%2 == 0)
			{
				evenwords[index] = words[i];
				index++;
			}
		}
		
		for(String a:evenwords)
		{
			if(a != null)
			{
				System.out.print(a+" ");
			}
		}

	}

}
