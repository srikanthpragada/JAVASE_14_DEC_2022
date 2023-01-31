package advanced;

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("Thead1");
	}
}

public class LambdaDemo {

	public static void printNumbers() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Task());
		t1.start();

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Thread2");
			}
		});
		t2.start();

		// Lambda Expression
		Thread t3 = new Thread(() -> System.out.println("Thread3"));
		t3.start();

		// Lambda Block
		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 5; i++)
				System.out.println(i);
		});

		t4.start();

		// Method Reference
		Thread t5 = new Thread(LambdaDemo::printNumbers); // run()
		t5.start();

	}

}
