package de.gothaer.mitarbeiter;

import de.gothaer.mitarbeiter.visitors.MitarbeiterVisitor;

public abstract class AbstractMitarbeiter {
	
	private String name;
	
	public AbstractMitarbeiter() {
		this("John Doe");
	}

	public AbstractMitarbeiter(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void accept(MitarbeiterVisitor visitor);

}
