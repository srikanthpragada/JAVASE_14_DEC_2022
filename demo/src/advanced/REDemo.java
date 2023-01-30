package advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REDemo {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("\\d{4,}", "12345"));
		System.out.println(Pattern.matches("[A-Z]{3}\\d+", "AA3434"));
		
		Pattern p = Pattern.compile("\\s+");
		
		var parts = p.split("abc    xyz     pqr");
		
		for(var pt : parts)
			System.out.println(pt);
		
		p = Pattern.compile("\\d");
		Matcher m = p.matcher("abc123xyz345pq999");
		
		System.out.println(m.replaceAll("*"));
		
		
		 

	}

}
