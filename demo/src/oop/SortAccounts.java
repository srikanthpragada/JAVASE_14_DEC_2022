package oop;

import java.util.Arrays;
import java.util.Comparator;

class CompareBalance implements Comparator<Account> {
	@Override
	public int compare(Account a1, Account a2) {
		 return  (int) (a1.getBalance() - a2.getBalance());
	}
}

public class SortAccounts {
	public static void main(String[] args) {
	    Account accounts [] = {
	    		 new Account(1, "A", 10000), 
	    		 new Account(2, "B", 5000),
	    		 new Account(3,"C", 1000)
	    		 };
	    
	    Arrays.sort(accounts); // sort by default order (compareTo())
	    Arrays.sort(accounts, new CompareBalance());
	    
	    Arrays.sort(accounts, new Comparator<Account>() {
			@Override
			public int compare(Account a1, Account a2) {
				 return  (int) (a1.getBalance() - a2.getBalance());
			}
	    });
	   
	    
	    for(var a : accounts)
	    	System.out.println(a);
	    }
 
}
