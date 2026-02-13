package com.java.strings.assignment;
import java.util.*;

public class RepeatedNonRepeatedCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Character firstRepeated=null,firstNonRepeated=null;
		String input;
		
		Map<Character,Integer> charCount = new LinkedHashMap<>();
		
		System.out.println("Enter a String");
		input = sc.nextLine();
		
		for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
		
		for (char ch : input.toCharArray()) {
            if (charCount.get(ch) > 1) {
                firstRepeated = ch;
                break;
            }
        }
		
		for (char ch : input.toCharArray()) {
            if (charCount.get(ch) == 1) {
                firstNonRepeated = ch;
                break;
            }
        }

        System.out.println("First Repeated Character: " + (firstRepeated != null ? firstRepeated : "None"));
        System.out.println("First Non-Repeated Character: " + (firstNonRepeated != null ? firstNonRepeated : "None"));
		
		sc.close();
	}

}
