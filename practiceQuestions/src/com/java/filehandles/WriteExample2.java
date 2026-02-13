package com.java.filehandles;

import java.io.File;
import java.io.FileWriter;

public class WriteExample2 {

	public static void main(String[] args) throws Exception{
		File f = new File("./samplefile2.txt");
		
		String s =" This is Selenium File Writing Session \n Today is Saturdy";
		if(f.exists())
			f.delete();
		f.createNewFile();
		
		FileWriter fw = new FileWriter(f);
		fw.write(s);
		fw.flush();
		fw.close();

	}

}
