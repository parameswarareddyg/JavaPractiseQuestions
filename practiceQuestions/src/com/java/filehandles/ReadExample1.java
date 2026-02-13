package com.java.filehandles;

import java.io.File;
import java.io.FileInputStream;


public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		
		File f = new File("./samplefile1.txt");
         FileInputStream fis = new FileInputStream(f);
         int i =0;
         while((i =fis.read())!=-1)
         {
        	 System.out.print((char)i);
         }
         fis.close();    
	}

}
