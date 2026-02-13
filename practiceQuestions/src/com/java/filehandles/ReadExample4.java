package com.java.filehandles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadExample4 {

	public static void main(String[] args) throws Exception{

		File f = new File("./samplefile1.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str = null;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}

		br.close();

	}

}
