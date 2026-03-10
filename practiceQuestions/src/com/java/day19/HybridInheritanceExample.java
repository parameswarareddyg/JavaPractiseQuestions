package com.java.day19;

//Parent Interface
interface A
{
 void methodA();
}

//Child Interface 1
interface B extends A
{
 void methodB();
}

//Child Interface 2
interface C extends A
{
 void methodC();
}

//Final Child Class
class D implements B, C
{
 public void methodA()
 {
     System.out.println("Method A from Interface A");
 }

 public void methodB()
 {
     System.out.println("Method B from Interface B");
 }

 public void methodC()
 {
     System.out.println("Method C from Interface C");
 }
}

public class HybridInheritanceExample
{
 public static void main(String[] args)
 {
     D obj = new D();

     obj.methodA();
     obj.methodB();
     obj.methodC();
 }
}