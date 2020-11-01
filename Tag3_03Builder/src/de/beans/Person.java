package de.beans;

import java.io.Serializable;

public class Person implements Serializable{
	
	
	private static final long serialVersionUID = -1718694516945434380L;
	private String anrede;
	private String vorname;
	private String nachname;
	
	private Person() {
		this("Mister","John","Doe");
	}
	
	private Person(final String anrede, final String vorname, final String nachname) {
		this.anrede = anrede;
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(final String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(final String nachname) {
		this.nachname = nachname;
	}
	
	

	public String getAnrede() {
		return anrede;
	}

	public void setAnrede(final String anrede) {
		this.anrede = anrede;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Person [anrede=");
		builder.append(anrede);
		builder.append(", vorname=");
		builder.append(vorname);
		builder.append(", nachname=");
		builder.append(nachname);
		builder.append("]");
		return builder.toString();
	}
	
	public static PersonBuilder builder() {
		return new PersonBuilder();
	}
	
	public static class PersonBuilder {
		private final Person person = new Person();
		
		public PersonBuilder anrede(final String anrede) {
			person.setAnrede(anrede);
			return this;
		}
		public PersonBuilder vorname(final String vorname) {
			person.setVorname(vorname);
			return this;
		}
		public PersonBuilder nachname(final String nachname) {
			person.setNachname(nachname);
			return this;
		}
		
		public Person build() {
			// validierung
			return person;
		}
	}

}
