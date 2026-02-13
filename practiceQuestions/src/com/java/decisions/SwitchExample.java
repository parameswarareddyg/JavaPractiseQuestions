package com.java.decisions;

public class SwitchExample {
	
	public static void main(String[] args) {
		byte b =1;
		
		switch(b)
		{
		case  1 :
		case  2 :
			 System.out.println("This is a second statement");
			 break;
		case  3 :
			 System.out.println("This is a third statement");
			 break;
		default :
			System.out.println("Invalid Option");
			break;
		
		}
	}

}
