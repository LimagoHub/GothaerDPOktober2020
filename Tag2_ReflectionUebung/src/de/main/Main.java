package de.main;

import de.services.BeanCreator;

public class Main {

	public static void main(String[] args) {
		System.out.println(new BeanCreator().createAndFillBean("de.beans.Person"));
	}

}
