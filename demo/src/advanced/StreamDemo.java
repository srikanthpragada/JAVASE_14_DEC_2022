package advanced;

import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		 var s = Stream.of(10,11,25,50,15, 20);
		 
		 s.filter( n -> n % 2 == 0) // Predicate ( boolean test(T))
		  .sorted()
		  .forEach(System.out::println);  // Consumer( void accept(T))

		  //.forEach( v -> System.out.println(v));
		 

	}

}
