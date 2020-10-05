package de.gothaer.mitarbeiter.visitors;

import de.gothaer.mitarbeiter.Lohnempfaenger;

public class ResetArbeitszeitVisitor extends AbstractMitarbeiterVisitor {

	@Override
	public void visit(Lohnempfaenger lohnempfaenger) {
		lohnempfaenger.setArbeitszeit(0.0);
	}
}
