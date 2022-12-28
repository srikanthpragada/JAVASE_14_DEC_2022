package oop;

public class TestAccount {

	public static void main(String[] args) {
		Account a; // object reference

		a = new Account(101, "Martin");
		a.deposit(10000);
		a.deposit(15000);
		a.withdraw(5000);
		System.out.println(a.getBalance());

		Account a2 = new Account(200, "Larry", 50000);
		a2.deposit(10000);
		System.out.println(a2.getBalance());
		
		 
	}

}
