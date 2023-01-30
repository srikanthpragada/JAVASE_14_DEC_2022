package coll;

public class GenericMethods {

	public static <T> void print(T a[]) {
		for (T v : a)
			System.out.println(v);
	}

	public static void main(String[] args) {
		Integer [] prices = {10,20,30};
		
		print(prices);

	}

}
