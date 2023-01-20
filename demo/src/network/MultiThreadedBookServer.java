package network;

import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadedBookServer {
	public static void main(String args[]) throws Exception {
		ServerSocket ssocket = new ServerSocket(3000, 10);
		System.out.println("Book server started and ready!");
		// create a Thread Pool to handle clients
		ExecutorService executor = Executors.newFixedThreadPool(10);
		while (true) {
			Socket clientsocket = ssocket.accept();
			System.out.println("Accepted Client Request...");
			ClientHandler client = new ClientHandler(clientsocket);
			executor.execute(client);
		}
	}
} // end of class

class ClientHandler implements Runnable {
	Socket client;

	public ClientHandler(Socket client) {
		this.client = client;
	}

	public void run() {
		String books[] = { "Java Complete Reference", "Core Java Vol I & II", "Thinking in Java" };
		try {
			// read string from client
			Scanner scanner = new Scanner(client.getInputStream());
			PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
			int bookno;
			String title;
			while (true) {
				bookno = scanner.nextInt();
				// exit loop, run and thread if book number is 0
				if (bookno == 0) {
					break;
				}

				// check whether book number is valid
				if (bookno - 1 < books.length) {
					title = books[bookno - 1];
				} else {
					title = ""; // book not found
				}
				// send title back to client
				pw.println(title);
			} // end of while
			System.out.println("Client Connection Closed");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	} // end of run
} // end of class
