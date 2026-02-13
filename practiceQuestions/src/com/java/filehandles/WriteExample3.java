package com.java.filehandles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteExample3 {

	public static void main(String[] args) throws Exception{

		File f = new File("./samplefile2.txt");

		String s ="This is new appended line";
		/*
		 * if(f.exists()) f.delete(); f.createNewFile();
		 */
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String str = null;
		String line ="";
		while((str=br.readLine())!=null)
		{
			line+= str+"\n";
		} 

		s= line+s;

		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(s);
		bw.flush();
		bw.close();
		fr.close();
		br.close();

	}

}
