package network;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TimeServer {

    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(2000, 10);
        System.out.println("TimeServer is ready...");
        while (true) {
            Socket cs = ss.accept();  // wait for client
            PrintWriter pw = new PrintWriter(cs.getOutputStream(), true);
            pw.println(new Date().toString()); // write to client
        } // end of while
    } // end of main
} // end of class

