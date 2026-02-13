package com.java.collections;

import java.util.*;
public class MapperExample {

	public static void main(String[] args) {

		String s = "This is is Gunnampalli Parameswara Reddy";
		
		Map<Character,Integer> mapper = new LinkedHashMap<>();
		
		Map<Character,Integer> tree=new TreeMap<>();
		Map<Character,Integer> hashMap = new HashMap<>();
		
		Map<String,Integer> wordcount = new HashMap<>();
		String [] arr = s.split(" ");
		
		for(char c:s.toCharArray())
		{
			mapper.put(c, mapper.getOrDefault(c,0)+1);
		}
		hashMap.putAll(mapper);
		System.out.println("*******************************************************************");
		for(Map.Entry<Character,Integer> obj:hashMap.entrySet())
		{
			System.out.println(obj.getKey()+" "+obj.getValue());
		}
		System.out.println("*******************************************************************");
		System.out.println(mapper);
		
		for (Map.Entry<Character,Integer> obj : mapper.entrySet()) {
			System.out.println(obj.getKey()+" "+obj.getValue());
		}
		
		System.out.println("*******************************************************************");
		tree.putAll(mapper);
		
		for(Map.Entry<Character,Integer>obj:tree.entrySet())
		{
			System.out.println(obj.getKey()+" "+obj.getValue());
		}
		
		
		for(String word:arr)
		{
			wordcount.put(word, wordcount.getOrDefault(word,0)+1);
		}
		for(Map.Entry<String,Integer> entry:wordcount.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
