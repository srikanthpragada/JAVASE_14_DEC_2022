package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayNonBlankLines {

	public static void main(String[] args) throws IOException {
        var fr = new FileReader("d:\\classroom\\nov14\\test.txt");
        var br = new BufferedReader(fr);
        
        while(true)
        {
        	 var line = br.readLine();
        	 if(line == null)  // EOF 
        		 break; 
        	 
        	 if(line.trim().length() > 0)  // non-blank line 
        		 System.out.println(line);
        }
        
        br.close();
        fr.close();
       
	}

}
