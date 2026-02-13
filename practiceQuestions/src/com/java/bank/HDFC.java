package com.java.bank;
/**
 * THis Class is used for HDFC Banking application
 * @author Paramesh
 * @since 2023
 * @version v5
 * @see hdfcnetbanking
 */
public class HDFC {
	static int currentBalance =3000;

	/**
	 * This method is used to deposit the cash
	 * @param amount  The amount you want to deposit
	 */
	public void deposit(int amount)
	{
		currentBalance += amount;
	}

	public static void withdraw(int amount)
	{
		currentBalance -= amount;
	}


	public int getCurrentBalance()
	{
		return currentBalance;
	}
	public static void greeting()
	{
		System.out.println("Welcome to HDFC Banking application");
	}
	public static void main(String[] args) {
		HDFC h = new HDFC();
		greeting();
		h.deposit(500);
		System.out.println("Balance:" +h.getCurrentBalance());
	    withdraw(400);
		System.out.println("Balance :" +h.getCurrentBalance());

	}
}
