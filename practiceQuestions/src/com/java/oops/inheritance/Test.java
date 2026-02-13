package com.java.oops.inheritance;

import com.java.accessmodifiers.Student;

public class Test extends Student{

	protected Test(int rollno) {
		super(rollno);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Guest g = new Guest(); g.read();
		 * 
		 * 
		 * Developer d = new Developer(); d.read(); d.write();
		 * 
		 * Admin m = new Admin(); m.manage(); m.read(); m.write();
		 */
		 
		
		Iadmin l = new Login();
		l.read();
		l.write();
		l.manage();
		
	Test t =	new Test(30);
	
		
      
		

	}

}
