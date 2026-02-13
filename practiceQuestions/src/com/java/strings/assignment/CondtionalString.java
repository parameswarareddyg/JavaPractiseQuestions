package com.java.strings.assignment;
import java.util.*;
public class CondtionalString {

	public static void main(String[] args) {
		String firstInput,secondInput;
		String []first,second;
		boolean validate = false;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String Input1");
		firstInput = sc.nextLine();

		System.out.println("Enter a String Input2");
		secondInput = sc.nextLine();

		first = firstInput.split(" ");
		second = secondInput.split(" ");
		for(int i=0;i<first.length;i++)
		{
			for(int j=0;j<second.length;j++)
			{
				if(first[i].equals(second[j]))
				{
					validate = true;
				}
			}
			if(validate)
			{
				System.out.print("+ ");
				validate =false;
			}
			else
			{
				System.out.print(first[i]+" ");
			}
		}
		sc.close();

	}

}
