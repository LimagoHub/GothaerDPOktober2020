package de.template;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {
	private final List<CharacterHandler> handlers = new ArrayList<>();
	
	public void addCharacterHandler(final CharacterHandler handler) {
		handlers.add(handler);
	}
	
	public void removeCharacterHandler(final CharacterHandler handler) {
		handlers.remove(handler);
	}
	
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
	
	private void init() {
		handlers.forEach(CharacterHandler::init);
	}
	
	private void process(final char c) {
		handlers.forEach(h->h.process(c));
	}
	
	private void close() {
		handlers.forEach(CharacterHandler::close);
	}

}
