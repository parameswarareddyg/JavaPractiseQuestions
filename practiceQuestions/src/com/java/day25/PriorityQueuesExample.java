package com.java.day25;

import java.util.PriorityQueue;

public class PriorityQueuesExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(30);
		pq.add(10);
		pq.add(20);
		pq.add(50);
		pq.offer(5);
//		pq.add(null);
		System.out.println(pq);
		pq.remove();
		System.out.println(pq.peek());
		System.out.println(pq.element());
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		pq.remove(50);
		System.out.println(pq);
		System.out.println(pq.size());
		System.out.println(pq.isEmpty());
		
		pq.clear();
		System.out.println(pq.peek());
		System.out.println(pq.isEmpty());
//		System.out.println(pq.element());
	}

}
