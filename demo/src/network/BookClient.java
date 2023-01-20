package network;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class BookClient {
    public static void main(String args[])  throws Exception {
        // connect to server socket
        Socket s = new Socket("localhost", 3000);
        Scanner keyboard = new Scanner(System.in);
        Scanner sin = new Scanner(s.getInputStream());
        PrintWriter sout = new PrintWriter(s.getOutputStream(), true);
        String title;
        int bookno;
        while (true) {
            // take book no from user
            System.out.print("Enter book number[0 to stop]: ");
            bookno = keyboard.nextInt();
            sout.println(bookno);  // send bookno to server
            if (bookno == 0) {
                break;
            }
            title = sin.nextLine(); // Read title from server
            if (title.length() != 0) {
                System.out.println("Book Title : " + title);
            } else {
                System.out.println("Sorry! Invalid Book Number.");
            }
        } // while 
    } // end of main

}
