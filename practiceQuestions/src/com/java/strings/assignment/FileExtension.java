package com.java.strings.assignment;

import java.util.*;
public class FileExtension {

	public static void main(String[] args) {
		String fileName;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a filename to find .extension");
		fileName = sc.next();
		 
		System.out.println(fileName.substring(fileName.lastIndexOf('.')+1));
		 sc.close();

	}

}
