package de.gothaer.mitarbeiter;

import de.gothaer.mitarbeiter.visitors.MitarbeiterVisitor;

public class Lohnempfaenger extends AbstractMitarbeiter {

	private double arbeitszeit = 40;
	private double stundenlohn = 12.5;
	
	public Lohnempfaenger() {
		// TODO Auto-generated constructor stub
	}

	public Lohnempfaenger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public double getArbeitszeit() {
		return arbeitszeit;
	}

	public void setArbeitszeit(double arbeitszeit) {
		this.arbeitszeit = arbeitszeit;
	}

	public double getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(double stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lohnempfaenger [arbeitszeit=");
		builder.append(arbeitszeit);
		builder.append(", stundenlohn=");
		builder.append(stundenlohn);
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
