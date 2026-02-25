package com.java.day10;

import java.awt.DisplayMode;

public class TypesOfLoops {

	public static void main(String[] args) {
		int [] marks = new int[10];
		marks[0]=100;
		marks[1]=99;
		marks[2]=45;
		marks[3]=65;
		marks[4]=21;
		marks[5]=89;
		
		//Types of Loops
//		1)for loop
//		2)for each loop
//		3)while loop
//		4)do while loop

//		for Loop
//		Syntax
//		for(initialization; condition; update/increment/decreent)
		for(byte i=0;i<marks.length;i+=3)
		{
			System.out.print(marks[i]+" "); //100 99 45 65 21 89
			if(i>5) {
			marks[i]=5;
			}
		}
		System.out.println();
		for(byte i=0;i<marks.length;i++)
		{
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		
//		foreach Loop
		for(int i : marks) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//While Loop
//		while(condition)-->true
//		{
//			
//		}
		
		byte j=2;//initiallization
		while(j<marks.length)//condition
		{
			System.out.print(marks[j]+" ");
			j++;//increment decrement or break
//			break;
		}
		System.out.println();
		
//		do {
//		//statements or lines of code
		//once code execute whether the condition satisfy or not
//	}while(condition);
		System.out.println(j);
		byte k=0;
		do {
			System.out.print(marks[k]+" ");
			k++;
		}while(k<marks.length);
	}
}
