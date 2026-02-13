package com.practice.datatypes;

public class VarDatatype {
	//instance variable
	private String name ="paramesh";
	
	public static void main(String[] args) {
		//local variable
	   //var k;
	   //k=50;
		
		//variables
		int k;
		//String name="paramesh";
		var i =20.1234;
		var j = 30;
		var n = "tinku";
		var b = true;
		System.out.println(i);
		System.out.println(n);
		System.out.println(b);
		VarDatatype v = new VarDatatype();
		//var sum = v.print(i,j);
		//System.out.println(sum);
		VarDatatype obj = new VarDatatype();
		System.out.println(obj.name);
	}
	
	public int print(int g ,int h)
	{
		return g+h;
	}

}
