package com.java.variables;


public class TypesOfVariables {
	
	//Instance variable
	//with in the class outside the method
	//accessModifier datatype variablename  = value;
	private short number=200;//-->>instance variable
	protected short number1 = 300;
	public short number2 = 400;
	short number3 = 500;//default
	private final int value = 2000;
	
	//accessmodifier returntype functionname() {} --> object.functionname create chesi access function
	public void substraction(int i,int j)//non static function or instance function function definition
	{
		System.out.println("Value 1 : "+i+" Value 2 : "+j+" Difference : "+(i-j));
	}
	


	
	//accessmodifier static returntype functionname() {} --> Classname.functionname create chesi access function
	public static void display()//static function
	{
		//Syntax for variable and variable initillization
		//Variables which are declare inside the function is called Local Variables
//		datatype variablename;
//		datatype variablename = value;
		String name ="lokesh";//-->local variables
		byte i=10,j=20;
		System.out.println("Local Variable :  "+name);
		//output : Local Variable : lokesh
		
		
		//Final Variable
		final int number;
		number = 1000;
		//number = 2000; ---> Unable to edit becuase only once need to initiallize hence it is final variable.
		int sum=0;
		System.out.println("Final Variable : "+number);
	}
	
	public void sum(int i,int j)
	{
		int sum;
		sum=0;
		sum =1;
		System.out.println("Sum Value before sum() : "+sum);
		
		sum=i+j;
		System.out.println("Sum Value After sum() : "+sum);
	}
	
	public static void main(String[] args) {
		TypesOfVariables obj= new TypesOfVariables();
		System.out.println("Instance Variable : "+obj.number);
		System.out.println("Instance Variable : "+obj.number1);
		System.out.println("Instance Variable : "+obj.number2);
		System.out.println("Instance Variable : "+obj.number3);
		obj.substraction(10, 10);//-->Function call
		display();//-->function Call
		//		obj.value = 3000;--> Final variable cannot be modified once it is initiallized it can be 
		//an instance final variable or local final variable or static final variable
	}
	
}
