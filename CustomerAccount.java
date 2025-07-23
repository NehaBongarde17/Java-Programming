package com.sunbeam;

import java.util.Scanner;

class CustomerAccount{
	private int account_number;
	private int balance;
	private int total_items_charged;
	private int total_credits;
	protected int credit_limit;
	
	public CustomerAccount(int account_number,int balance,int total_items_charged,int total_credits,int credit_limit) {
		this.account_number = account_number;
		this.balance = balance;
		this.total_items_charged = total_items_charged;
		this.total_credits = total_credits;
		this.credit_limit = credit_limit;
	}
	public int calcNewBalance() {
		int NewBalance;
		NewBalance = balance + total_items_charged - total_credits;	
		return NewBalance;
	}
	public void checkCreditLimit() {
        int newBalance = calcNewBalance();
        System.out.println("Account Number: " + account_number);
        System.out.println("New Balance: " + newBalance);
        System.out.println("Credit Limit: " + credit_limit);
        if (newBalance > credit_limit) {
            System.out.println("Credit limit exceeded.\n");
        } else {
            System.out.println("Within credit limit.\n");
        }
    }
}

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int numCustomers = scanner.nextInt();

        for (int i = 0; i < numCustomers; i++) {
            System.out.println("\nEnter details for customer " + (i + 1));

            System.out.print("Account Number: ");
            int accNo = scanner.nextInt();

            System.out.print("Beginning Balance: ");
            int balance = scanner.nextInt();

            System.out.print("Total Items Charged: ");
            int charges = scanner.nextInt();

            System.out.print("Total Credits: ");
            int credits = scanner.nextInt();

            System.out.print("Credit Limit: ");
            int limit = scanner.nextInt();

            CustomerAccount customer = new CustomerAccount(accNo, balance, charges, credits, limit);
            customer.checkCreditLimit();
        }

        scanner.close();
    }
    
}
