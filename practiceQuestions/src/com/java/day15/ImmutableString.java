package com.java.day15;

public class ImmutableString {

	public static void main(String[] args) {
		String s="Java"; //-->String Pool
		String s1 = "Java";
		String s2="java";
		
		System.out.println(s==s1);//address comparison == //true
		System.out.println(s==s2);//false
		System.out.println(s1==s2);//false
		
		System.out.println(s.equals(s1));//.equals();
		System.out.println(s.equals(s2));//false
		System.out.println(s1.equals(s2));//false
		
		s=s.concat("Programming");

		String s3="Paramesh";
		System.out.println(s3);
		s3.replace("a", "@");
		System.out.println(s3.replace("a", "@"));
		String s4 = s3.replace("a", "@");
		System.out.println(s4);
		
		System.out.println(s.contains("va"));
		String text = "Java is good. Java is powerful.";

		String result = text.replaceFirst("Java", "Python");

		System.out.println(result);//Python is good. Java is powerful.
		String result1 = text.replaceAll("Java", "Python");
		System.out.println(result1);
		String s5 = "My name is Paramesh Reddy.I am Teaching Java Programming";
		System.out.println(s5);
		String [] arr = s5.split("\\.");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
	}

}
