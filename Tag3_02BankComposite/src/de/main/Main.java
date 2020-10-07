package de.main;

import de.composite.Konto;
import de.composite.Kontogruppe;

public class Main {

	public static void main(final String[] args) {

		final Kontogruppe root = new Kontogruppe("ROOT");
		
		final Kontogruppe e1_1 = new Kontogruppe("E1_1");
		root.appendChild(e1_1);
		
		final Kontogruppe e1_2 = new Kontogruppe("E1_2");
		root.appendChild(e1_2);
		
		
		final Kontogruppe e2_1 = new Kontogruppe("E2_1");
		e1_1.appendChild(e2_1);
		
		final Kontogruppe e2_2 = new Kontogruppe("E2_2");
		e1_1.appendChild(e2_2);
		
		
		final Konto e2_3 = new Konto("e2_3");
		e1_2.appendChild(e2_3);
		
		root.print();
	}
	
	

}
