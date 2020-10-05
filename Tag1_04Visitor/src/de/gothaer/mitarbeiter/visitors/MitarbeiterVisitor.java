package de.gothaer.mitarbeiter.visitors;

import de.gothaer.mitarbeiter.Gehaltsempfaenger;
import de.gothaer.mitarbeiter.Lohnempfaenger;

public interface MitarbeiterVisitor {
	
	void visit(Gehaltsempfaenger gehaltsempfaenger);
	void visit(Lohnempfaenger lohnempfaenger);

}
