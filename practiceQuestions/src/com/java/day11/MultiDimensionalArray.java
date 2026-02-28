package com.java.day11;

public class MultiDimensionalArray {

	public static void main(String[] args) {
//		🔹 Best Real-Life Example: Student Marks System
//
//		Imagine a school where:
//
//		3 students
//
//		4 subjects
//
//		We can store marks like this:
//                  0    1          2        3  
//			  		Math Science	English	History
//	0	Student 1	85		90		78			88
//	1	Student 2	76		85		89			90
//	2	Student 3	92		88		95			91
//
//		Instead of creating 12 separate variables, we use a 2D array.
		
		//single dimensional array : datatype [] arrayname = new datatype[size]; --> byte [] student1 = new byte[4];{99,100,74,89}
		//2 dimensional array : datatype [][] array name = new datatype[rowsize][columns];
		
		byte [][] studentMarks = new byte[3][4];
		studentMarks[0][0]=85;
		studentMarks[0][1]=90;
		studentMarks[0][2]=78;
		studentMarks[0][3]=88;
		studentMarks[1][0]=76;
		studentMarks[1][1]=85;
		studentMarks[1][2]=89;
		studentMarks[1][3]=90;
		studentMarks[2][0]=92;
		studentMarks[2][1]=88;
		studentMarks[2][2]=95;
		studentMarks[2][3]=91;
		System.out.println(studentMarks.length);
		System.out.println(studentMarks[0].length);
		System.out.println(studentMarks[1].length);
		System.out.println(studentMarks[2].length);
		for(int i=0;i<studentMarks.length;i++)
		{
			System.out.println("i = "+i);
			for(int j=0;j<studentMarks[i].length;j++)
			{
				System.out.print("[StudentMarks  : "+i+" Subject "+j+" "+studentMarks[i][j]+"]  ");
				//System.out.println("j = "+j);
			}
			System.out.println();
		}
		
		
		//byte [][][] schoolReports = new byte[2][2][2]; //classes,students,subjects
//		schoolReports[0][0][0] = 98;
//		schoolReports[0][0][1] = 99;
//		schoolReports[0][1][0] =55;
//		schoolReports[0][1][1] =65;
//		schoolReports[1][0][0]=100;
//		schoolReports[1][0][1]=98;
//		schoolReports[1][1][0]=35;
//		schoolReports[1][1][1]=15;
		
		byte [][][] schoolReports = {{{98,99},{55,65}},    {{100,98},{35,15}}};
		for(int i=0;i<schoolReports.length;i++)
		{
			System.out.println("Class "+i);
			for(int j=0;j<schoolReports[i].length;j++)
			{
				System.out.print("Student "+j+"----> ");
				for(int k=0;k<schoolReports[i][j].length;k++)
				{
					System.out.print(schoolReports[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
