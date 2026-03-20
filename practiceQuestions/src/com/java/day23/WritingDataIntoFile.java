package com.java.day23;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataIntoFile {

	public void updateDataUsingFileOutputStream(String filename)
	{
		FileOutputStream fos =null;
		try {
			String data = new String("Hi this is paramesh \nwe are discussing about FileOutputStream Concept.");
			fos = new FileOutputStream(new File(".\\src\\com\\java\\day23\\"+filename+".txt"));
			byte []arr = data.getBytes();
			fos.write(arr);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updateDataUsingFileWriter(String filename) {
		
		FileWriter fw = null;
		String data = new String("Hi this is paramesh \nwe are discussing about FileWriter Concept.");
		try {
			fw = new FileWriter(new File(".\\src\\com\\java\\day23\\"+filename+".txt"));
			fw.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updateDataUsingBufferedwriter(String filename) {
		BufferedWriter bw = null;
		String data = new String("Hi this is paramesh \nwe are discussing about BufferedWritter Concept.");
		try {
			bw =  new BufferedWriter(new FileWriter(new File(".\\src\\com\\java\\day23\\"+filename+".txt")));
//			bw.write("Hi");
//			bw.newLine();
//			bw.write("This is paramesh");
//			bw.newLine();
//			bw.write("This is Buffered Writer Concept");
			bw.write(data);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	public static void main(String[] args) {
		//Mainly Java Provides 3 Types to Write into File
		//		1)FileOutputStream
		//		2)FileWriter
		//		3)BufferedWriter
		
		WritingDataIntoFile obj = new WritingDataIntoFile();
		obj.updateDataUsingFileOutputStream("file1");
		obj.updateDataUsingFileWriter("file2");
		obj.updateDataUsingBufferedwriter("file3");

	}
	
}
