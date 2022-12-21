package oop;

public class TestAccount {

	public static void main(String[] args) {
		Account a; // object reference

		a = new Account(101, "Martin");
		a.deposit(10000);
		a.deposit(15000);
		System.out.println(a.getBalance());

		Account a2 = new Account(200, "Larry");
		System.out.println(a2.getBalance());
	}

}
