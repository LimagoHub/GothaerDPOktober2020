package de.client;

import de.template.CharacterCounter;
import de.template.FileProcessor;
import de.template.LineCounter;

public class Application {

	public static void main(final String[] args) {
		final FileProcessor processor = new FileProcessor();
		processor.addCharacterHandler(new CharacterCounter());
		processor.addCharacterHandler(new LineCounter());
		processor.run("data.txt");

	}

}
