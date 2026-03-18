package com.java.day22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class ReadDataFromFile {
	public void readDataUsingFileInputStream(File file) 	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int data;
			while(true)
			{
				if((data=fis.read()) !=-1)
				{
					System.out.print((char)data);
				}
				else {
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void readDataUsingScanner(File file)
	{
		try {
			Scanner sc = new Scanner(file);

			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void readDataUsingFileReader(File file)
	{
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			int data;
			while(true)
			{
				if((data =fr.read()) != -1)
				{
					System.out.print((char)data);
				}
				else
				{
					break;
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void readDataUsingBufferedReader(File file)
	{
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while(true)
			{
				if((line = br.readLine()) != null)
				{
					System.out.println(line);
				}
				else {
					break;
				}
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		/*
		 * Total 4 types 1)FileInputStream 2)FileReader 3)BufferedReader 4)Scanner
		 */
		ReadDataFromFile obj = new ReadDataFromFile();
		File file = new File(".\\src\\com\\java\\day22\\textdocument.txt");
		obj.readDataUsingFileInputStream(file); // helps byte to byte data reading ex: images,videos
		System.out.println();
		obj.readDataUsingScanner(file); //helps to read parsing data and numbers ex : numbers,strings 
		obj.readDataUsingFileReader(file);//helps to read data using char to char reading
		System.out.println();
		obj.readDataUsingBufferedReader(file); //helps to read Line by line or Bulk Data Reading


	}
}
