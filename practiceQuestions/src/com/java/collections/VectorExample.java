package com.java.collections;

import java.util.Vector;


public class VectorExample {

	public static void main(String[] args) {

		
		  
		  Vector v1= new Vector(); 
		  v1.add(23); 
		  v1.add(300);
		  v1.add(65);
		  
		  Vector v = new Vector();
		  
		  v.add(30);
		  v.add(40);
		  v.add(50);
		  v.add(1,55);
		  v.add(null);
		  
		  System.out.println(v); 
		  System.out.println(v.get(2));
		  System.out.println(v.getFirst()); 
		  System.out.println(v.getLast());
		  System.out.println(v.capacity());
		  
		  v.addAll(v1); 
		  System.out.println(v);
		  v.removeAll(v1); 
		  System.out.println(v); 
		  v.remove(2); 
		  System.out.println(v);
		  v.removeAllElements(); 
		  System.out.println(v);
		 

//		  Vector<Integer> v = new Vector<>(); 
//		  System.out.println(v.capacity());
//		  v.add(20); v.add(30); v.add(40);
//		  v.remove(1);
//		  
//		  
//		  int i = 0;
//		  for (Object object : v) {
//		  
//			  i+= (int)object;
//		  } 
//		  System.out.println("i : "+i);

	}

}
