package com.java.day19;

interface Parent1{
	void show(); //declaration
}
interface Parent2 {
	void show();//declaration
}

class Child implements Parent1,Parent2{
	@Override
	public void show() //definition
	{
		System.out.println("Show Method");
	}
}

public class MultipleInheritanceusingInterface {

	public static void main(String[] args) {

		Child c = new Child();
		c.show();
	}

}
