package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListJavaPrograms {

	public static void main(String[] args) throws IOException {
		 Path p = Path.of("d:\\classroom\\nov14\\demo");
		 
		 Files.walk(p)
		      .filter(file -> file.toString().endsWith(".java"))
		      .forEach(System.out::println);
		 

	}

}
