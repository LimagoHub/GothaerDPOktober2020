package de.services;

import java.util.Scanner;

public class BeanCreator {
	
	
	
	public Object createAndFillBean(String fullQualifiedClassName) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Bitte Wert eingeben");
			String zeile = scanner.nextLine();
			System.out.println("Ihr Wert:" + zeile);
		} 
		return null;
	}

}
