package com.java.strings.assignment;
import java.util.*;
public class MaximumLengthWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[] words = input.split(" "); 
        String maxWord = "";
        
        for (String word : words) {
            if (word.length() > maxWord.length()) {
                maxWord = word;
            }
        }

        System.out.println("Longest Word: " + maxWord);
        sc.close();
	}

}
