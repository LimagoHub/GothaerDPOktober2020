package de.gothaer.mitarbeiter.visitors;

import de.gothaer.mitarbeiter.Gehaltsempfaenger;
import de.gothaer.mitarbeiter.Lohnempfaenger;

public class PrintVisitor implements MitarbeiterVisitor {

	@Override
	public void visit(Gehaltsempfaenger gehaltsempfaenger) {
		System.out.println(gehaltsempfaenger);
	}

	@Override
	public void visit(Lohnempfaenger lohnempfaenger) {
		System.out.println(lohnempfaenger);
	}

}
