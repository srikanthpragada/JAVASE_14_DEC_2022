package basics;

public class ArrayDemo {

	public static void main(String[] args) {
		//int[] a = { 10, 11, 22, 33, 44, 98, 87, 44, 20, 40 };

		int[] a = new int[5];
		
		for (int i = 0; i < 5; i++)
			System.out.printf("%5d", a[i]);

		for (int i = 0; i < a.length; i++)
			System.out.printf("%5d", a[i]);

		for (int n : a)
			System.out.printf("%5d", n);
	}

}
