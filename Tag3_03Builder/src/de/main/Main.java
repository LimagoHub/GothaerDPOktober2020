package de.main;

import de.beans.Person;

public class Main {

	public static void main(final String[] args) {
		final Person p = Person.builder().anrede("Miss").vorname("Jane").build();
		System.out.println(p);
		
		
		

	}

}
