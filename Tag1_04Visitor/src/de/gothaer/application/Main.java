package de.gothaer.application;

import de.gothaer.firma.Firma;
import de.gothaer.mitarbeiter.Gehaltsempfaenger;
import de.gothaer.mitarbeiter.Lohnempfaenger;
import de.gothaer.mitarbeiter.visitors.PrintVisitor;
import de.gothaer.mitarbeiter.visitors.ResetArbeitszeitVisitor;

public class Main {

	public static void main(String[] args) {
		Firma firma = new Firma();
		firma.addMitarbeiter(new Gehaltsempfaenger("Schmidt"));
		firma.addMitarbeiter(new Lohnempfaenger("Hinz"));
		firma.addMitarbeiter(new Lohnempfaenger("Kunz"));
		firma.addMitarbeiter(new Gehaltsempfaenger("Meyer"));
		firma.addMitarbeiter(new Gehaltsempfaenger("Schulz"));
		
		//firma.print();
		firma.iterate(new PrintVisitor());
		firma.iterate(new ResetArbeitszeitVisitor());
		firma.iterate(new PrintVisitor());
	}

}
