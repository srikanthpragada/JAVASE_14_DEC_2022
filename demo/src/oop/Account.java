package oop;

public class Account {
	// instance variables
	private int acno;
	private String ahname;
	private double balance;

	// Constructor
	public Account(int no, String name) {
		acno = no;
		ahname = name;
	}

	public Account(int no, String name, double bal) {
		acno = no;
		ahname = name;
		balance = bal;
	}
	
	// Methods
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public double getBalance() {
		return balance;

	}
}
