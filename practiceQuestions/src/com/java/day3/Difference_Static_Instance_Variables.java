//blueprint
package com.java.day3;

class Calculator
{
  public static int value = 10;//static variable//10->20->30
  public int value1 = 5;//instace variable
      //user1 --> 5--->20
      //user2 --> 5--->30
  int add(int a,int b)
  {
    return a+b;
  }
  int static sub(int a,int b)
  {
    return a-b;
  }
}

//
public class Difference_Static_Instance_Variables{

  public static void main(String[] args) {
    
    Calculator user1 = new Calculator();
    //int sum = user1.add(10,10);
    //System.out.println("User 1 : "+sum);
    System.out.println("User 1 Value : "+Calculator.value);//10
    System.out.println("User 1 Value1 : "+user1.value1);//5
    Calculator.value = 20;
    user1.value1=20;
    System.out.println("User 1 Value : "+Calculator.value);//20
    System.out.println("User 1 Value1 : "+user1.value1);//20
    
    Calculator user2 = new Calculator();
    //int sum1 = user2.add(20,10);
    // System.out.println("User 2 : "+sum1);
    System.out.println("User 2 Value : "+Calculator.value);//20
    System.out.println("User 2 Value1 : "+user2.value1);//5
    Calculator.value = 30;
    user2.value1=30;
    System.out.println("User 2 Value : "+Calculator.value);//30
    System.out.println("User 2 Value1 : "+user2.value1);//30
    
  }
}