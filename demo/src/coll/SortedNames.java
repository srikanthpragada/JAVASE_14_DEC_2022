package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SortedNames {

	public static void main(String[] args) throws IOException {
		 Path p = Path.of("d:\\classroom\\nov14\\names.txt");
		 var lines = Files.readAllLines(p);
		 
		 lines.sort(null);
		 
		 for(var l : lines)
			 System.out.println(l);
		 

	}

}
