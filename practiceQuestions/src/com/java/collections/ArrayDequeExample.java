package com.java.collections;

import java.util.ArrayDeque;

public class ArrayDequeExample {
	static void print(Object o)
	{
		System.out.println(o);
	}
	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(10);
		ad.addFirst(20);
		ad.addLast(30);
		print(ad);
		print(ad.peek());
		print(ad.peekFirst());
		print(ad.peekLast());
		print(ad.offer(40));
		print(ad.offerFirst(200));
		print(ad.offerLast(100));
		print(ad.poll());
		print(ad.pollFirst());
		print(ad.pollLast());
		print(ad);
	}

}
