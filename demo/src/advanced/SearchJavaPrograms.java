package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SearchJavaPrograms {
	
	public static boolean hasString(Path file, String search) {
		try {
			var contents = Files.readString(file);
			return contents.contains(search);
		}
		catch(Exception ex) {
			return false; 
		}
	}

	public static void main(String[] args) throws IOException {
		 Path p = Path.of("d:\\classroom\\nov14\\demo");
		 
		 Files.walk(p)
		      .filter(file -> hasString(file,"Path"))
		      .forEach(System.out::println);
		 

	}

}
