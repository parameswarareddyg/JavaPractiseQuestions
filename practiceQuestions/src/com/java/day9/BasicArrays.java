package com.java.day9;import java.io.CharConversionException;

public class BasicArrays {

	public static void main(String[] args) {
		//without array need to declare multiple variable for each value
//		int rollno1 = 1;
//		String name ="paramesh";
//		float salary = 55000;
//		int rollno2 = 2;
//		int rollno3 = 3;
//		
       int [] rollno_arr= new int[6]; // array with memory allocation
       rollno_arr[0] = 10;
       rollno_arr[1]=20;
       rollno_arr[2]=30;
       rollno_arr[3]=40;
       rollno_arr[4]=50;
       rollno_arr[5]=60;
       System.out.println(rollno_arr[0]);
       rollno_arr[0] = 40;
       System.out.println(rollno_arr[0]);
       
       String [] usernames = {"Paramesh","Lokesh","Rajesh","Mukhaddar"};// array with initialization
       
       System.out.println(usernames);
       System.out.println("Size of username array : "+usernames.length);
       System.out.println(usernames[3]);
       
       
       float [] salary ; // array without initilization
       
       salary = new float[10];
       //for(initilization;condition;increment/decrement){}
       
       for(int i=0;i<rollno_arr.length;i++)
       {
    	   System.out.print(rollno_arr[i]+" "); //40 20 30 40 50 60
       }										//0  1  2  3  4  5
       
       System.out.println("Reverse an Array using loops");
       for(int i=rollno_arr.length-1;i >= 0;i--)
       {
    	   System.out.println(rollno_arr[i]+" ");
       }
       
       
       for(int i=0;i<usernames.length;i++)
       {
    	   if(usernames[i].equals("Lokesh"))
    	   {
    		   String name = usernames[i];
    		   System.out.println(name);//Lokesh
    		   char [] characters = name.toCharArray();
    		   
    		   for(int j=0;j<characters.length;j++)
    		   {
    			   System.out.print(characters[j]+" ");
    		   }
    		   System.out.println();
    		   for(int j=characters.length-1;j>=0;j--)
    		   {
    			   System.out.print(characters[j]+" ");
    		   }
    		   System.out.println();
//    		   break;
    	   }
    	   if(usernames[i].equals("Rajesh"))
    	   {
    		   System.out.println("Rajesh Executed");
    		   break;
    	   }
    	   System.out.println("Loop Continuing......");
    	   
       }

       //replacing character 'a' with '$'
       String sentence = new String("Hello this Paramesh Today I am Explaining about arrays");
	   char[] letters = sentence.toCharArray();
	   System.out.println(letters);
	   for(int i=0;i<letters.length;i++)
	   {
		   if(letters[i]=='a')
		   {
			   letters[i] = '$';
		   }
	   }
	   
	   System.out.println(letters);
       
       
	}

}
