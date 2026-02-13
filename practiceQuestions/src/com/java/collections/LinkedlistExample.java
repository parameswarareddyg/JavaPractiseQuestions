package com.java.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedlistExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.add(60);
		l.add(40);
		l.add(50);
		l.add(60);
		System.out.println(l.size());
		
		System.out.println(l);
      
		TreeSet<Integer> t = new TreeSet<Integer>();
      
	   t.addAll(l);
	   System.out.println(t);
	}

}
