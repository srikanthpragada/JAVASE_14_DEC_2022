package network;

import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class TimeClient {

	public static void main(String[] args) throws Exception {
		Socket cs = new Socket("localhost", 2000); // connect to server
		// get stream to read data from server
		InputStream is = cs.getInputStream();
		// Use Scanner to read a line
		Scanner scanner = new Scanner(is);
		String line = scanner.nextLine();
		System.out.println(line);
		cs.close();
	}

}
