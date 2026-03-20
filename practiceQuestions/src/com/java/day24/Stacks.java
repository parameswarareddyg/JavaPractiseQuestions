package com.java.day24;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		//Last IN First Out
		Stack<Integer> stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack);
	}

}
