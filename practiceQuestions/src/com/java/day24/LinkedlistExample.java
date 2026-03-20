package com.java.day24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistExample {

	static void display(List<Integer> lst)
	{
		for (Integer val : lst) {
			System.out.print(val+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		List<Integer> linkedList = new LinkedList<Integer>();
		System.out.println(linkedList.size());
		linkedList.add(10);
		linkedList.add(20);
		linkedList.remove(0);
		linkedList.add(20);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(10);
		
		display(linkedList);
		System.out.println("Size of List : "+linkedList.size());
		System.out.println(linkedList.contains(10));
		System.out.println(linkedList.contains(50));
		linkedList.addFirst(10);
		display(linkedList);
		linkedList.addLast(60);
		System.out.println(linkedList);
		linkedList.add(4, 50);
		System.out.println(linkedList);
		List<Integer> lst1 = new ArrayList<>();
		lst1.add(70);
		lst1.add(80);
		linkedList.addAll(lst1);
		System.out.println(linkedList);
		System.out.println(lst1);
		lst1.clear();
		System.out.println(lst1);
		System.out.println(linkedList.indexOf(20));
		System.out.println(linkedList.lastIndexOf(20));
		System.out.println(linkedList);
		linkedList.remove(2);
		System.out.println(linkedList);
		linkedList.removeFirst();
		linkedList.removeLast();
//		linkedList.remove(10);
		System.out.println(linkedList);
		linkedList.remove(linkedList.indexOf(10));
		System.out.println(linkedList);
		linkedList.add(null);
		linkedList.add(null);
		System.out.println(linkedList);
		
	}

}
