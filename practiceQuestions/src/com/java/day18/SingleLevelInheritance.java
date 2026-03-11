package com.java.day18;

class Employee {

    int salary = 50000;

    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

    void code() {
        System.out.println("Developer is coding");
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {

        Developer d = new Developer();

        System.out.println(d.salary);
        d.work();
        d.code();
    }
}
