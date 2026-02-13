package com.java.bank.sbi;

import java.util.Scanner;

public class SBI {

	private static double currentbalance = 5000;

	public void deposit(double amount) {
		if (amount > 0) {
			currentbalance += amount;
			System.out.println("Amount Deposited Successfully! Current Balance: " + currentbalance);
		} else {
			System.err.println("Enter a valid amount greater than zero");
		}
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.err.println("Enter a valid withdrawal amount greater than zero");
			return;
		}

		if (amount <= currentbalance) {
			currentbalance -= amount;
			System.out.println("Amount Withdrawn Successfully! Current Balance: " + currentbalance);
		} else {
			System.err.println("Withdraw amount " + amount + " is greater than current balance " + currentbalance);
		}
	}

	public void getCurrentBalance() {
		System.out.println("Current Balance: " + currentbalance);
	}

	public static void main(String[] args) {
		System.out.println("Hello Customer! Welcome to SBI Banking Services");

		Scanner sc = new Scanner(System.in);
		SBI sbi = new SBI();
		int servicetype;
		String servicerequired = "no";
		do {
			System.out.println("Choose an option below for service:");
			System.out.println("1. Deposit  2. Withdraw  3. Current Balance  4. Exit");

			// Ensure input is a valid integer
			while (!sc.hasNextInt()) {
				System.err.println("Invalid input! Please enter a number.");
				sc.next(); // Consume invalid input
			}
			servicetype = sc.nextInt();

			double amount = 0;
			switch (servicetype) {
			case 1:
				System.out.println("Enter amount to deposit:");
				while (!sc.hasNextDouble()) {
					System.err.println("Invalid amount! Please enter a valid amount.");
					sc.next();
				}
				amount = sc.nextDouble();
				sbi.deposit(amount);
				break;
			case 2:
				System.out.println("Enter amount to withdraw:");
				while (!sc.hasNextDouble()) {
					System.err.println("Invalid amount! Please enter a valid amount.");
					sc.next();
				}
				amount = sc.nextDouble();
				sbi.withdraw(amount);
				break;
			case 3:
				sbi.getCurrentBalance();
				break;
			case 4:
				System.out.println("Thank you for choosing SBI services!");
				break;
			default:
				System.err.println("Invalid option. Please choose a valid service.");
				break;
			}

			if(servicetype != 4)
			{
				System.out.println("Do you want to continue service!, Enter Yes/No");
				servicerequired=sc.next().trim();
				if(servicerequired.equalsIgnoreCase("no"))
					break;
			}
		} while (servicetype != 4);

		sc.close();
	}

}
