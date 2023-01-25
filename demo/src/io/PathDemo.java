package io;

import java.nio.file.Files;
import java.nio.file.Path;

public class PathDemo {

	public static void main(String[] args) {
		 Path p  = Path.of("d:\\classroom\\nov14");
		 
		 System.out.println(p.getClass());
		 System.out.println(Files.isDirectory(p));
		 

	}

}
