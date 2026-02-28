package com.java.day11;

import java.util.Scanner;

public class JaggedArray {

	public void display(byte [][] arr)
	{System.out.println("***********************Array Started ****************************");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("***********************Array Ended ****************************");
	}
	
	public byte[][] readStudentDetails()
	{
		
		Scanner sc = new Scanner(System.in);
		byte rows=0;
		byte  columns=0;
		System.out.println("Enter How Many Student Details need to Add");
		rows= sc.nextByte();
		byte [][] studentMarksArray = new byte[rows][];//Jagged Array
		for(int i=0;i<studentMarksArray.length;i++)
		{
			System.out.println("Enter How Many Subject Marks need to store for Student"+i);
			columns = sc.nextByte();
			studentMarksArray[i] = new byte[columns];
			
			for(int j=0;j<studentMarksArray[i].length;j++)
			{
				System.out.println("Enter Subject "+j+" Marks");
				studentMarksArray[i][j] = sc.nextByte();
			}
		}
		sc.close();
		return studentMarksArray;
	}
	public static void main(String[] args) {
		
		byte [][] studentDetailsArray = new byte[3][]; //array row size declaration
		studentDetailsArray[0] = new byte[4]; //column size declaration
		studentDetailsArray[1] = new byte[2];
		studentDetailsArray[2] = new byte[3];
		
		studentDetailsArray[0][0] = 99; //values initialisation
		studentDetailsArray[0][1] = 86;
		studentDetailsArray[0][2] = 91;
		studentDetailsArray[0][3] = 92;
		studentDetailsArray[1][0] = 45;
		studentDetailsArray[1][1] = 78;
		studentDetailsArray[2][0] = 89;
		studentDetailsArray[2][1] = 84;
		studentDetailsArray[2][2] = 90;
		
		JaggedArray obj = new JaggedArray();
		obj.display(studentDetailsArray);
		
		byte [][] studentDetailsArray1 = {{55,89,78,35,66},{98,100}};
		obj.display(studentDetailsArray1);
		
		obj.display(obj.readStudentDetails());
		
		
	}

}
