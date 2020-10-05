package de.client;

import de.states.Blende;

public class Main {

	public static void main(String[] args) {
		Blende blende = new Blende();
		
		blende.drucken();
		blende.changeToB();
		blende.drucken();
		blende.changeToB();
	}

}
