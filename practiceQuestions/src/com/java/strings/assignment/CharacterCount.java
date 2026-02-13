package com.java.strings.assignment;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
    	int uppercaseCount = 0, lowercaseCount = 0, digitCount = 0, specialCharCount = 0;
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else{
                specialCharCount++;
            }
        }

        System.out.println("Uppercase Letters: " + uppercaseCount);
        System.out.println("Lowercase Letters: " + lowercaseCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Characters: " + specialCharCount);
        sc.close();
        }
}
