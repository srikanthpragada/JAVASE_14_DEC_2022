package advanced;

import java.util.Arrays;

public class ArrayToStream {

	public static void main(String[] args) {
		int a[] = {11,12,45,56,33};
		
		Arrays.stream(a)
		      .filter( v -> v % 2 != 0)
		      .sorted()
		      .forEach(System.out::println);
		
		var sum = Arrays.stream(a).sum();
		System.out.println(sum);
	      
	}

}
