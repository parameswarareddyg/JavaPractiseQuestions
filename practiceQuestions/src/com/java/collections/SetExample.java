package com.java.collections;
import java.util.*;
public class SetExample {
	
	public static void main(String[] args) {
		Set<Integer> s= new TreeSet<>();
		s.add(10);
		s.add(2);
		s.add(20);
		
		for(int c:s)
		{
			System.out.println(c);
		}
	}

}
