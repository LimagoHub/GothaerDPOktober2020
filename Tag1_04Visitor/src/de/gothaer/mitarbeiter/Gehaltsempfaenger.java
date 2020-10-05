package de.gothaer.mitarbeiter;

import de.gothaer.mitarbeiter.visitors.MitarbeiterVisitor;

public class Gehaltsempfaenger extends AbstractMitarbeiter {

	private double gehalt = 1000;
	
	public Gehaltsempfaenger() {
		
	}

	public Gehaltsempfaenger(String name) {
		super(name);
		
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gehaltsempfaenger [gehalt=");
		builder.append(gehalt);
		builder.append(", Name=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void accept(MitarbeiterVisitor visitor) {
		visitor.visit(this);
		
	}

	

	
	
}
