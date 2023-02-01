package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SortLongNames {

	public static void main(String[] args) throws IOException {
		Path p  = Path.of("d:\\classroom\\nov14\\names.txt");
		
		Files.lines(p)
		.filter( l -> l.length() > 3)
		.sorted()
		.skip(2)
		.forEach(System.out::println);

	}

}
