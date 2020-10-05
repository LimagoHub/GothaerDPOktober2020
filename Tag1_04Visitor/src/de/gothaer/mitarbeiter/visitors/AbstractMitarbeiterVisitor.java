package de.gothaer.mitarbeiter.visitors;

import de.gothaer.mitarbeiter.Gehaltsempfaenger;
import de.gothaer.mitarbeiter.Lohnempfaenger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor {

	@Override
	public void visit(Gehaltsempfaenger gehaltsempfaenger) {
		// Ok

	}

	@Override
	public void visit(Lohnempfaenger lohnempfaenger) {
		// Ok

	}

}
