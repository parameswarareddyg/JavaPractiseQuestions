package com.java.collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> books = new Stack<String>();
		
		books.push("Red");
		books.add("Black");
		books.push("white");
		books.add("Pink");
		books.add("pink");
		books.add(null);
		books.add(null);
		
		System.out.println(books);
		System.out.println(books.peek());
		System.out.println(books);
		System.out.println(books.pop());
		System.out.println(books);
		System.out.println(books.search("Red"));
		
	}

}
