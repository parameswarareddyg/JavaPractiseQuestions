package com.java.strings;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Hello World";
		String i =null;
		String s1 ="hello world";
		String s2 = "    Hello World      ";
		String s3 = "";
		String s4=" ";
		
		System.out.println(s.startsWith("h"));
		System.out.println(s.endsWith("H"));
		System.out.println(s.contains("el"));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.length());
		System.out.println(s2.trim().length());
		char [] c = s.toCharArray();
		System.out.println(c);
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf('o'));
		System.out.println(s.lastIndexOf('d'));
		System.out.println(s.substring(6));
        String [] ar = s.split(" ");
        //System.out.println(ar);
        
        System.out.println(s.charAt(2));
        System.out.println(s.replace('o', 't'));
        System.out.println(s.replaceAll(s1, s2));
        System.out.println(i.valueOf(345) +  567);
        System.out.println(345+567);
        System.out.println(s3.isEmpty() + " "+s4.isEmpty());
        System.out.println(s3.isBlank() + " "+s4.isBlank());
   
	}

}
