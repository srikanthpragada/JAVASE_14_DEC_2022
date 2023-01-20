package threads;

public class Test {
	
	public static void process() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		 System.out.println(Thread.currentThread().getName());
		 process(); 

	}

}
