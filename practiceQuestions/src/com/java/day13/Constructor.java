package com.java.day13;

class Student {

    int id;
    String name;
    String course;

    //No argument Constructor
//    Student() {
//        id = 0;
//        name = "Unknown";
//        course = "Not Assigned";
//    }
    // Only Parameterized Constructor
    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

public class Constructor {

	public static void main(String[] args) {

//		Student s1 = new Student();   // ❌ Trying to create without arguments
		Student s2 = new Student(101, "Ravi", "Java");
	}

}
