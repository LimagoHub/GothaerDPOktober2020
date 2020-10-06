package de.commands;

public class CommandFactory {
	
	public static Command create(final String zeile) {
		Command result = null;
		String [] tokens = zeile.split(" ");
		switch (tokens[0]) {
		case "Add":
			result = new AddCommand();
			result.parse(tokens);
			break;

		case "Print":
			result = new PrintCommand();
			result.parse(tokens);
			break;

		default:
			break;
		}
		return result;
	}

}
