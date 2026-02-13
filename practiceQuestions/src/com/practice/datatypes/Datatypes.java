package com.practice.datatypes;

public class Datatypes {
	public static void main(String[] args) {
		System.out.println("Size                        Minimum Value                         Maximum Value");
		System.out.println("size of char    : "+Character.SIZE/8+" Bytes, Minimum : "+Character.MIN_VALUE+" Maximum Value : "+Character.MAX_VALUE);
		System.out.println("size of Byte    : "+Byte.SIZE/8 +" Bytes, Minimum : "+Byte.MIN_VALUE+"                     Maximum Value : "+Byte.MAX_VALUE);
		System.out.println("size of Short   : "+Short.SIZE/8+" Bytes, Minimum : "+Short.MIN_VALUE+"                   Maximum Value : "+Short.MAX_VALUE);
		System.out.println("size of Integer : "+Integer.SIZE/8+" Bytes, Minimum : "+Integer.MIN_VALUE+"              Maximum Value : "+Integer.MAX_VALUE);
		System.out.println("size of Long    : "+Long.SIZE/8+" Bytes, Minimum : "+Long.MIN_VALUE+"     Maximum Value : "+Long.MAX_VALUE);
		System.out.println("size of Float   : "+Float.SIZE/8+" Bytes, Minimum : "+Float.MIN_VALUE+"                  Maximum Value : "+Float.MAX_VALUE);
		System.out.println("size of Double   : "+Double.SIZE/8+" Bytes, Minimum : "+Double.MIN_VALUE+"                  Maximum Value : "+Double.MAX_VALUE);
		
		VarDatatype obj = new VarDatatype();
//		System.out.println("My name is : "+obj.name);
	}
}
