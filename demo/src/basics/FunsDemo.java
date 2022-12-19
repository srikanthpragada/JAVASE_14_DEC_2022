package basics;

public class FunsDemo {

	static int add(int a, int b) {
		return a + b;
	}

	static void process(int ... values) {

	}

	public static void main(String[] args) {

		System.out.println(add(10, 20));
		process(10, 20);
		process(10, 20, 30, 40);
	}

}
