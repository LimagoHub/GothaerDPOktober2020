package de.template;

import java.io.FileReader;

public abstract class FileProcessor {
	
	public final void run(final String filename) {
		try(FileReader reader = new FileReader(filename)) {
			
			init();
			int zeichen;
			while((zeichen = reader.read()) != -1) {
				process((char) zeichen);
			}
			close();
			
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
	
	public void init() {
		
	}
	
	public abstract void process(final char c) ;
	
	public void close() {
		
	}

}
