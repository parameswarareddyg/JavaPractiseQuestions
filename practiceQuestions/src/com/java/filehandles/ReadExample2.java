package com.java.filehandles;

import java.io.File;
import java.util.Scanner;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {

		File f = new File("./samplefile1.txt");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNext())
		{
			System.out.print(sc.next()+" ");
		}
		
		sc.close();
	}

}
