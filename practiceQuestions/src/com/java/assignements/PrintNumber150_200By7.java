package com.java.assignements;

public class PrintNumber150_200By7 {
    
    public static void main(String[] args) {
        short i = 150;
        System.out.println("Numbers Divisble by 7 between 150 - 200");
        while (i <= 200) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
