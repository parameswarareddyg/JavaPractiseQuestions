package com.java.day26;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		Set<Integer> hashset=new HashSet();
		hashset.add(10);
		hashset.add(11);
		hashset.add(12);
		hashset.add(11);
		hashset.add(10);
		hashset.add(null);
		hashset.add(null);
		System.out.println(hashset);
		
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(10);
		linkedHashSet.add(11);
		linkedHashSet.add(12);
		linkedHashSet.add(11);
		linkedHashSet.add(10);
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		System.out.println(linkedHashSet);
		
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(20);
		treeSet.add(10);
		treeSet.add(30);
//		treeSet.add(null);
		System.out.println(treeSet);
		
//        for(int i=0;i<hashset.size();i++)
//        {
//        	System.out.println(hashset[i]);
//        }
        
        for (Integer val : treeSet) {
			System.out.println(val);
		}
	}

}
