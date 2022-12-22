package oop;

public class TestCounter {

	public static void main(String[] args) {
		Counter c  = new Counter();
		c.increment();
		c.increment();
		System.out.println(c.getValue());
	}

}
