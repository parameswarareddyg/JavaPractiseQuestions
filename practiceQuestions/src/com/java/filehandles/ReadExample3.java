package com.java.filehandles;

import java.io.File;
import java.io.FileReader;

public class ReadExample3 {

	public static void main(String[] args) throws Exception{
		File f = new File("./samplefile1.txt");
		FileReader fr = new FileReader(f);
		int i =0;
		while((i =fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();

	}

}
