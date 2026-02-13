package com.java.exceptions;

public class NullPointerExample {

	public static void main(String[] args) {
	      String s =null;
	      try {
	      System.out.println(s.length());
	      }catch(NullPointerException e)
	      {
	    	  e.printStackTrace();
	      }

	      System.out.println("Program ends");
	}

}
