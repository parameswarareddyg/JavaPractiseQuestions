package com.java.day14;


public class TypeConversion {

	public static void add(int i,int j)
	{
		System.out.println("Value 1 : "+i+"Value 2 : "+j+" is : "+(i+j));
	}
	public static void main(String[] args) {
		byte i = 10;

		add(i,i);


		//Implicit Type Conversion
		System.out.println("i : "+i+" "+((Object)i).getClass().getName());
		int a = i;
		System.out.println("a : "+a+" "+((Object)a).getClass().getName());
		double b = i;
		System.out.println("b : "+b+" "+((Object)b).getClass().getName());

		//Explicit Type Conversion
		System.out.println("i : "+i+" "+((Object)i).getClass().getName());
		int c =(int) i;
		System.out.println("c : "+c+" "+((Object)c).getClass().getName());
		double d =(double)i;
		System.out.println("d : "+d+" "+((Object)d).getClass().getName());

		String value = "100";
		String value1="200";
		//add(value,value1);//Type conversion
		add(Integer.parseInt(value),Integer.parseInt(value1));

		byte e = Byte.parseByte(value);
		System.out.println("Byte "+e);
		System.out.println("Short "+Short.parseShort(value));
		System.out.println("Int   "+Integer.parseInt(value));
		System.out.println("Long : "+Long.parseLong(value));
		System.out.println("Float : "+Float.parseFloat(value));
		System.out.println("Double : "+Double.parseDouble(value));
	}

}
