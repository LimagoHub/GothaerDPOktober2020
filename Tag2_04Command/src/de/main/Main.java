package de.main;

import java.util.Scanner;

import de.commands.Command;
import de.commands.CommandFactory;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			
			while(true) {
				System.out.print("#>");
				String zeile = scanner.nextLine();
				if("ende".equalsIgnoreCase(zeile)) return ;
				Command command = CommandFactory.create(zeile);
				if(command == null) continue;
				command.execute();
			}
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
