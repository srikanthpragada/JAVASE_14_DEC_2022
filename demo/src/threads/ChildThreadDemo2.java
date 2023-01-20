
package threads;

class Task implements Runnable {
	@Override 
	public void run() {
		for (int i = 1; i <= 25; i++)
			System.out.println("Child : " + i);
	}
}

public class ChildThreadDemo2 {

	public static void main(String[] args) throws InterruptedException {
        System.out.println("In Main Thread!");
        Thread ct = new Thread(new Task());
        // ct.setDaemon(true);
        ct.start();  // calls run() in Task object 
        
        for (int i = 1; i <= 25; i++)
			System.out.println("Main : " + i);
        
//        System.out.println("Waiting for child to terminate!");
//        ct.join();
//        System.out.println("The End!");
	}

}
