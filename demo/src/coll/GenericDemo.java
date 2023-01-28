package coll;

import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args) {
		var al = new ArrayList<String>();
		var nums = new ArrayList<Integer>();
		
		al.add("abc");
		//al.add(10);
		
		System.out.println(al.get(1).getClass());
		
		String s = al.get(0);
		
	}

}
