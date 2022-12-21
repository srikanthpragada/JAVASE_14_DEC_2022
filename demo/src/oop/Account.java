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
	// Methods
	public void deposit(double amount) {
		balance += amount;
	}

	public double getBalance() {
		return balance;

	}
}
