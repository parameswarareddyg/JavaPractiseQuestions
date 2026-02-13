package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		int[] i = new int[] {10,20,30,40,50};


		//List<Integer> l= Arrays.asList(i);
		ArrayList li = new ArrayList();

		li.add(20);
		li.add(30);
		li.add(20);
		li.add(30);
		li.add(20);
		li.add(30);
		li.add(20);
		li.add(30);
		li.add(20);
		li.add(30);
		li.add(52);
		System.out.println(li);

		Object[] obj =li.toArray();	

		System.out.println(obj);
		
		for (Object object : obj) {

			System.out.print(object+" ");

		}
		Collections.synchronizedList(li);
	}

}
