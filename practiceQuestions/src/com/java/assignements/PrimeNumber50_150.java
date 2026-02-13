package com.java.assignements;

public class PrimeNumber50_150 {

	private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num-1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		
		System.out.println("Prime numbers between 50 and 150:");

        for (int num = 50; num <= 150; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
	}

}
