package com.java.day25;

import java.util.*;
public class QueueLinkedList {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(50);
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.remove(10));
		System.out.println(q);
		q.clear();
		System.out.println(q.remove(30));
		q.remove(30);
		q.poll();
		System.out.println(q);
	}

}
