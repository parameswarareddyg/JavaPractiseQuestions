package com.java.filehandles;
import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {


		String path = System.getProperty("user.dir");
		String loc = path +File.separator+"directory";
		File f = new File(loc);
		boolean b =f.mkdir();
		System.out.println(b);

		// System.out.println(f.isHidden());
	}

}
