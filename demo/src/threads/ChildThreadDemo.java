
package threads;

class ChildThread extends Thread {
	@Override 
	public void run() {
		for (int i = 1; i <= 25; i++)
			System.out.println("Child : " + i);
	}
}

public class ChildThreadDemo {

	public static void main(String[] args) throws InterruptedException {
        System.out.println("In Main Thread!");
        ChildThread ct = new ChildThread();
        // ct.setDaemon(true);
        ct.start(); // invoking run() 
        
        for (int i = 1; i <= 25; i++)
			System.out.println("Main : " + i);
        
//        System.out.println("Waiting for child to terminate!");
//        ct.join(); // Main is waiting for child    
        System.out.println("End of Main");
	}

}
