package oop;

import java.util.Scanner;

public class ExDemo {

	public static void main(String[] args) {

		int prices[] = { 40, 55, 30, 45, 80 };

		System.out.print("Enter product id :");
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();

		try {
			System.out.println(prices[id]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Sorry! Invalid id. It must be 0 to 4");
		}
	}

}
