package com.java.day20;

interface PaymentGateway {

//	PaymentGateway(){
//		//Interface cannot have constructor.
//	}
	
    // public static final variable (constant)
    double TRANSACTION_FEE = 2.5;

    // abstract method
    void makePayment(double amount);

    // default method
    default void printReceipt(double amount) {
        validateTransaction(amount);
        System.out.println("Receipt Generated for amount: " + amount);
    }

    // static method
    static void gatewayInfo() {
        System.out.println("Welcome to Universal Payment Gateway");
    }

    // private method (used internally)
    private void validateTransaction(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Transaction Amount");
        } else {
            System.out.println("Transaction Validated");
        }
    }
}

class CreditCardPayment implements PaymentGateway {

    public void makePayment(double amount) {
        double total = amount + TRANSACTION_FEE;
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Total amount including fee: " + total);
    }
}

class UpiPayment implements PaymentGateway {

    public void makePayment(double amount) {
        System.out.println("Processing UPI Payment of " + amount);
    }
}
public class Interfaces {

	public static void main(String[] args) {
		 	PaymentGateway.gatewayInfo(); // static method call
		 	CreditCardPayment payment = new CreditCardPayment();
		 	payment.makePayment(100);
		 	payment.printReceipt(1000);
		 	System.out.println(PaymentGateway.TRANSACTION_FEE);
//		 	PaymentGateway.TRANSACTION_FEE = 10;
//	        PaymentGateway payment1 = new CreditCardPayment();
//	        payment1.makePayment(1000);
//	        payment1.printReceipt(1000);

	        System.out.println("------------------");
	        
	        
//
//	        PaymentGateway payment2 = new UpiPayment();
//	        payment2.makePayment(500);
//	        payment2.printReceipt(500);

	}

}
