package com.java.day26;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {

	public static void main(String[] args) {
		String sentence = "Hello this is paramesh wara reddy. this is Java Training session.";
		String [] words = sentence.split(" ");
		
//		Map<key,value>
		Map<String,Integer> maps = new LinkedHashMap<>();
		
		for(String word:words)
		{
			System.out.println(word);
			maps.put(word,maps.getOrDefault(word, 0)+1);
		}
		System.out.println("******************************************************************");
		System.out.println("************************Duplicate Values****************************");
		for(Map.Entry<String, Integer> map : maps.entrySet())
		{
			if(map.getValue()>1)
			{
				System.out.print(map.getKey()+" ");
			}
			
		}
		System.out.println();
		System.out.println("************************Duplicate Values****************************");
		System.out.println(maps);
		
		System.out.println("******************************************************************");
		Map<Integer,String> hashmap = new HashMap<Integer,String>();
		hashmap.put(10, "apple");
		hashmap.put(2, "orange");
		hashmap.put(3, "grapes");
		hashmap.put(4, "apple");
		hashmap.put(1, "watermelon");
		hashmap.put(4, "grapes");
		hashmap.put(null, "nullvalue");
		hashmap.put(null, "nullvalue2");
		hashmap.put(null, null);
		hashmap.put(null, "grapes");
		hashmap.put(5, null);
		hashmap.put(6, null);
		System.out.println(hashmap);
		System.out.println(hashmap.get(1));
		System.out.println(hashmap.get(5));
		System.out.println(hashmap.values());
		System.out.println("******************************************************************");
		Map<Integer,String> linkedhashmap = new LinkedHashMap<Integer,String>();
		linkedhashmap.put(10, "apple");
		linkedhashmap.put(2, "orange");
		linkedhashmap.put(3, "grapes");
		linkedhashmap.put(4, "apple");
		linkedhashmap.put(1, "watermelon");
		linkedhashmap.put(4, "grapes");
		linkedhashmap.put(null, "nullvalue");
		linkedhashmap.put(null, "nullvalue2");
		linkedhashmap.put(null, null);
		linkedhashmap.put(null, "grapes");
		linkedhashmap.put(5, null);
		linkedhashmap.put(6, null);
		System.out.println(linkedhashmap);
		System.out.println(linkedhashmap.get(1));
		System.out.println(linkedhashmap.get(5));
		System.out.println(linkedhashmap.values());
		
		System.out.println("******************************************************************8");
		Map<Integer,String> treemap = new TreeMap<Integer,String>(); //only null values allowed in treemap
		treemap.put(10, "watermelon");
		treemap.put(2, "orange");
		treemap.put(3, "grapes");
		treemap.put(1, "apple");
		treemap.put(4, "watermelon");
		treemap.put(4, "grapes");
//		treemap.put(null, "grapes");
//		treemap.put(null, null);
//		treemap.put(null, "grapes");
		treemap.put(5, null);
		System.out.println(treemap);
		System.out.println(treemap.get(1));
		System.out.println(treemap.get(5));
		System.out.println(treemap.values());
		System.out.println("******************************************************************8");
		Map<Integer,String> hashtable = new Hashtable<Integer,String>(); //not allowed null key and null values in Hashtable.
		hashtable.put(10, "watermelon");
		hashtable.put(2, "orange");
		hashtable.put(3, "grapes");
		hashtable.put(1, "apple");
		hashtable.put(4, "watermelon");
		hashtable.put(4, "grapes");
//		hashtable.put(null, null);
//		hashtable.put(null, "grapes");
//		hashtable.put(5, null);
		System.out.println(hashtable);
		System.out.println(hashtable.get(1));
		System.out.println(hashtable.get(5));
		System.out.println(hashtable.values());
	}

}
