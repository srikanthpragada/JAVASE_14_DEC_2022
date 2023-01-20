
package threads;

public class MainThreadDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();

		System.out.println(t.getName());
		System.out.println(t.getPriority());
	}

}
