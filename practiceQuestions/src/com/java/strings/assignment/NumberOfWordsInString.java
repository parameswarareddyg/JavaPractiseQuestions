package com.java.strings.assignment;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		String val = new String("Hello this is Parameshwara Reddy");
		String [] words = val.split(" ");
		System.out.println("Number of Words In String is "+words.length);

	}

}
