package com.java.day16;

import java.util.ArrayList;

public class MutableStrings {

	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer("Java");
//		sb.insert(4," Programming");
//		System.out.println(sb);
		
		String val="2";
		int num=Integer.parseInt(val);
		System.out.println("Squares of Number : "+num*num);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		System.out.println(list);
	}

}
