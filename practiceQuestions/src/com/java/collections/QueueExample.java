package com.java.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println(queue);
		queue.remove();
		System.out.println(queue.peek());
		
		System.out.println(queue.isEmpty());
		System.out.println("Removed Element is : "+queue.poll());
		
		System.out.println(queue.offer(100));
		
		System.out.println(queue);
		
	}

}
