package com.java.day18;

class Bank{
	private int accountid;
	private String name;
	private double accountbalance;
	
	Bank(int accountid,String name,double accountbalance) {
		this.accountid = accountid;
		this.name = name;
		this.accountbalance = accountbalance;
	}
	
	public void setAccountbalance(double amount)
	{
		if(amount > 0)
		{
			this.accountbalance += amount;
		}
		else {
			System.err.println("Warning Invalid Amount Balance : "+amount);
		}
	}
	
	public double getAccountbalance()
	{
		return accountbalance;
	}

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Bank user1 = new Bank(101,"Ramesh",3000);
	//	System.out.println("User 1 Account Balance : "+user1.accountbalance);
//		user1.accountbalance = -10000;
		
		System.out.println("user1 Account Balance : "+user1.getAccountbalance());
		user1.setAccountbalance(5000);
		System.out.println("user1 Account Balance : "+user1.getAccountbalance());
		user1.setAccountbalance(-5000);
		
	}

}
