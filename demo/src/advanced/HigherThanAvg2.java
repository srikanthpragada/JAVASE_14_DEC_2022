package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HigherThanAvg2 {

	public static void main(String[] args) throws IOException {
		Path p  = Path.of("d:\\classroom\\nov14\\marks.txt");
		
		var marks = 
	     	Files.lines(p)
		    .mapToInt(Integer::parseInt);
		
		var avg = marks.average().getAsDouble();
				
		
		marks
		   .filter(v -> v > avg)
		   .forEach(System.out::println);
	}

}
