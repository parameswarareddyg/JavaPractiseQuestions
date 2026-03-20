package com.java.day24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	static void display(List<Integer> lst)
	{
		for (Integer val : lst) {
			System.out.print(val+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList();
		System.out.println(numList.size());
		System.out.println(numList);
		numList.add(20);
		numList.add(20);
		numList.add(30);
		numList.add(40);
		numList.add(10);
		
		display(numList);
		System.out.println("Size of List : "+numList.size());
		System.out.println(numList.contains(10));
		System.out.println(numList.contains(50));
		numList.addFirst(10);
		display(numList);
		numList.addLast(60);
		System.out.println(numList);
		numList.add(4, 50);
		System.out.println(numList);
		List<Integer> lst1 = new ArrayList<>();
		lst1.add(70);
		lst1.add(80);
		numList.addAll(lst1);
		System.out.println(numList);
		System.out.println(lst1);
		lst1.clear();
		System.out.println(lst1);
		System.out.println(numList.indexOf(20));
		System.out.println(numList.lastIndexOf(20));
		System.out.println(numList);
		numList.remove(2);
		System.out.println(numList);
		numList.removeFirst();
		numList.removeLast();
//		numList.remove(10);
		System.out.println(numList);
		numList.remove(numList.indexOf(10));
		System.out.println(numList);
		numList.add(null);
		numList.add(null);
		System.out.println(numList);
		
		
	}

}
