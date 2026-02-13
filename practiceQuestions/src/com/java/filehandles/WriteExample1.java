package com.java.filehandles;

import java.io.File;
import java.io.FileOutputStream;

public class WriteExample1 {

	public static void main(String[] args) throws Exception{
		File f = new File("./samplefile2.txt");
		
		String s =" This is Selenium File Writings Session\nParamesh";
		if(f.exists()) {
			f.delete();
		}
		f.createNewFile();
		
		FileOutputStream fo = new FileOutputStream(f);
		char[]c= s.toCharArray();
		for (char d : c) {
			fo.write((int)d);
			}
		fo.flush();
		fo.close();
		
	}

}
