package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class ReplaceMultipleSpaces {

	public static void main(String[] args) throws IOException {
		 Path file = Path.of("d:\\classroom\\nov14\\test.txt");
		 var contents = Files.readString(file);
		 
         var p = Pattern.compile(" +");
         var m = p.matcher(contents);
         
         var newContents = m.replaceAll(" ");
         System.out.println(newContents);
         
         Files.writeString(file,newContents);
	}

}
