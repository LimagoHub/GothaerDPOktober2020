package de.template;

import java.io.FileWriter;
import java.io.IOException;

public class FileCopy implements CharacterHandler {
	
	private FileWriter out;
	
	@Override
	public void init() {
		try {
			out = new FileWriter("output.txt");
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void process(final char c) {
		try {
			out.write(c);
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Override
	public void close() {
		try {
			out.close();
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
