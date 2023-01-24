package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames {

	public static void main(String[] args) throws IOException {
		String names[] = { "Java", "Python", "JavaScript", "C#", "TypeScript" };

		try (FileWriter fw = new FileWriter("d:\\classroom\\nov14\\names.txt")) {
			for (var n : names)
				fw.write(n + "\n");
		}
	}

}
