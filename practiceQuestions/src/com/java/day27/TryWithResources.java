package com.java.day27;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("./src/com/java/day27/FlowDiagram.txt")) {
			int val ;
			while((val =fr.read()) != -1)
			{
				System.out.print((char)val);
			}
			System.out.println();
			
		} catch (IOException  e) {
		    e.printStackTrace();
		}
		finally {
			System.out.println("Next Line");
		}
	}

}
