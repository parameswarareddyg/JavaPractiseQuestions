package com.java.collections;

import java.util.Deque;
import java.util.LinkedList;


public class DequeueExample {
	
	static void print(Object o)
	{
		System.out.println(o);
	}
	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		deque.add(10);
		deque.add(20);
		deque.add(30);
		print(deque.peek());
		print(deque.peekFirst());
		print(deque.peekLast());
		print(deque.poll());
		deque.offer(400);
		deque.offer(400);
		print(deque);
		print(deque.pollFirst());
		print(deque.pollLast());
		print(deque.isEmpty());
		print(deque.remove());
		print(deque.removeFirst());
		print(deque.offer(100));
		print(deque.removeLast());
		print(deque);
	}
}
