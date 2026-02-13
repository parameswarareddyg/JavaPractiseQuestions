package com.java.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	static void print(Object o)
	{
		System.out.println(o);
	}
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(20);
		pq.add(10);
		pq.add(300);
		print(pq);
		print(pq.peek());
		print(pq.poll());
		print(pq);
		print(pq.offer(40));
		print(pq.remove());
		print(pq.isEmpty());
		print(pq);
	}
}
