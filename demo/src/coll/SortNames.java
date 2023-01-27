package coll;

import java.util.ArrayList;

public class SortNames {

	public static void main(String[] args) {
		 var names = new ArrayList<String>();
		 
		 names.add("Scott");
		 names.add("Bill");
		 names.add("Larry");
		 names.add("Bill");
		 
		 names.sort(null);
		 
		 for(var n : names)
			 System.out.println(n);
	}

}
