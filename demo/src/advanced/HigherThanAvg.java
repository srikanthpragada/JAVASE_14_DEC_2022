package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HigherThanAvg {

	public static void main(String[] args) throws IOException {
		Path p  = Path.of("d:\\classroom\\nov14\\marks.txt");
		
		var avg = Files.lines(p)
		     .mapToInt(Integer::parseInt)
		     .average()
		     .getAsDouble();
		
		
		Files.lines(p)
			 .mapToInt(Integer::parseInt)
			 .filter(v -> v > avg)
			 .forEach(System.out::println);
	}

}
