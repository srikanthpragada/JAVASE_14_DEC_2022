package threads;

class PrimeThread extends Thread {
	private int num;
	public PrimeThread(int num) {
		this.num = num;
	}
	public void run() {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.printf("%s is not prime\n", num);
				return;
			}
		}
		System.out.printf("%d is prime\n", num);
	}
}

public class TestPrime {
	public static void main(String[] args) {
		int nums[] = { 2223231, 3938389, 19, 39, 57 };

		for (int n : nums) {
			PrimeThread pt = new PrimeThread(n);
			pt.start();
		}
	}
}
