package threads;

class Data {
	 synchronized public void print() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (Exception ex) {
			}
		}
	}
}

class CThread extends Thread {
	Data obj;

	public CThread(Data obj) {
		this.obj = obj;
	}

	public void run() {
		obj.print();
	}
} // end of CThread

public class TestSync {
	public static void main(String args[]) {
		CThread thread1, thread2;
		Data obj = new Data();
		// make two threads access the same object
		thread1 = new CThread(obj);
		thread2 = new CThread(obj);
		thread1.start();
		thread2.start();
	}
}
