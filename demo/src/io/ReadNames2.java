package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadNames2 {

	public static void main(String[] args) throws IOException {
		var fr = new FileReader("d:\\classroom\\nov14\\names.txt");
		var br = new BufferedReader(fr);

		String line;

		while (true) {
			line = br.readLine();
			if (line == null) // EOF
				break;
			System.out.println(line);
		}

		fr.close();
	}

}
