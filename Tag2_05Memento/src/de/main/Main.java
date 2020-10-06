package de.main;

import de.tiere.Schwein;
import de.tiere.memento.SchweineMemento;

public class Main {

	public static void main(String[] args) {
		Schwein piggy = new Schwein("Miss Piggy");
		System.out.println(piggy);
		
		SchweineMemento memento = piggy.getMemento();
		
		
		piggy.fressen();
		
		piggy.setMemento(memento);
		
		System.out.println(piggy);
		

	}

}
