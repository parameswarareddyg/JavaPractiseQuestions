package com.java.day17;
// Non Static or Instance Nested Class
//class Outer
//{
//    class Inner
//    {
//        void display()
//        {
//            System.out.println("Static Inner Class");
//        }
//    }
//    
//    void display1()
//    {
//    	System.out.println("Outer Class");
//    }
//}

// Nested Static inner Class
class Outer
{
	void disp()
	{
		System.out.println("Outer Class");
	}
    static class Inner
    {
        void display()
        {
            System.out.println("Static Inner Class");
        } 
    }
}
public class NestedClass {

	public static void main(String[] args) {
//		Outer outObj = new Outer();
//		outObj.display1();
		
//		/outerclassname.innerclassname innerobjectname = outerObjectName.newkeyword InnerClassname();
//		Outer.Inner inObj = outObj.new Inner();
//		inObj.display();

		Outer.Inner obj = new Outer.Inner();
		obj.display();
		
		Outer inn = new Outer();
		inn.disp();
	}

}
