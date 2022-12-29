package oop;

public class Account {
	// instance variables
	private int acno;
	private String ahname;
	private double balance;
	
	// static or class variable
	private static int minbal = 5000;

	public static int getMinbal() {
		return minbal;
	}

	// Constructor
	public Account(int acno, String ahname) {
		this.acno = acno;
		this.ahname = ahname;
	}

	public Account(int acno, String ahname, double balance) {
		this(acno, ahname); // call another constructor
		this.balance = balance;
	}

	// Methods
	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (this.balance - amount >= Account.minbal)
			this.balance -= amount;
	}

	public double getBalance() {
		return this.balance;

	}
}
