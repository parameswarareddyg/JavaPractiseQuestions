package com.java.strings.assignment;

public class EvenOddStringConditionBased {

	public static void main(String[] args) {
		
		String val = new String("Hello this is Parameshwara Reddy");
		String [] words = val.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			if(i%2 == 0)
			{
				for(int j=words[i].length()-1;j>=0;j--)
				{
					System.out.print(words[i].charAt(j));
				}
			}
			else
			{
				System.out.print(words[i].toUpperCase());
			}
			System.out.print(" ");
		}

	}

}
