package com.java.day25;

import java.util.ArrayDeque;

public class ArrayDequeExample {
	public static void main(String[] args) {

		ArrayDeque<Integer> dq = new ArrayDeque<>();

		dq.add(10);
		dq.addFirst(5);
		dq.addLast(20);

		System.out.println(dq); // [5, 10, 20]

		dq.removeFirst();
		System.out.println(dq); // [10, 20]

		dq.removeLast();
		System.out.println(dq); // [10]
	}
}