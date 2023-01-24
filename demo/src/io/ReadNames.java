package io;

import java.io.FileReader;
import java.io.IOException;

public class ReadNames {

	public static void main(String[] args) throws IOException {
        var fr = new FileReader("d:\\classroom\\nov14\\names.txt");
        int ch;
        
        
        while(true)
        {
        	ch = fr.read(); 
        	if (ch == -1) // EOF 
        		break;
        	
        	System.out.print((char) ch);
        }
       
        fr.close();
	}

}
