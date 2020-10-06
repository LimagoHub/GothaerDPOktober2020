package de.tiere;

import de.tiere.memento.SchweineMemento;

public class Schwein {

	

	private String name;
	private int gewicht;
	
	
	


	public Schwein() {
		this("nobody");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
		
	}

	public int getGewicht() {
		return gewicht;
	}

	private void setGewicht(int gewicht) {
		this.gewicht = gewicht;
		
	}

	public Schwein(String name) {
		this.gewicht = 10;
		this.name = name;
	}

	public void fressen() {
		setGewicht(getGewicht() + 1);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Schwein [name=");
		builder.append(name);
		builder.append(", gewicht=");
		builder.append(gewicht);
		builder.append("]");
		return builder.toString();
	}
	
	public SchweineMemento getMemento() {
		return new MySchweineMemento(name, gewicht);
	}

	public void setMemento(SchweineMemento memento) {
		MySchweineMemento mySchweineMemento = (MySchweineMemento) memento;
		this.gewicht = mySchweineMemento.getGewicht();
		this.name = mySchweineMemento.getName();
	}
	
	private static class MySchweineMemento implements SchweineMemento {
		private final String name;
		private final int gewicht;
		public MySchweineMemento(final String name, final int gewicht) {
			this.name = name;
			this.gewicht = gewicht;
		}
		public String getName() {
			return name;
		}
		public int getGewicht() {
			return gewicht;
		}
		
	}
		


}
