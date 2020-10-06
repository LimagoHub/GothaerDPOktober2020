package de.tiere;

import java.util.ArrayList;
import java.util.List;

import de.goather.events.PropertyChangedEvent;
import de.goather.events.PropertyChangedListener;

public class Schwein {

	private List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();
	private List<PropertyChangedListener> propertyChangedListeners = new ArrayList<>();

	public void addPigTooFatListener(PigTooFatListener listener) {
		pigTooFatListeners.add(listener);
	}

	public void removePigTooFatListener(PigTooFatListener listener) {
		pigTooFatListeners.remove(listener);
	}

	public void addPropertyChangedListener(PropertyChangedListener listener) {
		propertyChangedListeners.add(listener);
	}

	public void removePropertyChangedListener(PropertyChangedListener listener) {
		propertyChangedListeners.remove(listener);
	}

	private void firePigTooFatEvent() {
		// pigTooFatListeners.forEach(c->c.pigTooFat(this));
		for (PigTooFatListener listener : pigTooFatListeners) {
			listener.pigTooFat(this);
		}
	}

	private void firePropertyChangedEvent(final String propertyName, final Object oldValue, final Object newValue) {
		firePropertyChangedEvent(new PropertyChangedEvent(this, propertyName, oldValue, newValue));
	}

	private void firePropertyChangedEvent(final PropertyChangedEvent event) {
		propertyChangedListeners.forEach(c->c.propertyChanged(event));
	}

	private String name;
	private int gewicht;

	public Schwein() {
		this("nobody");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		PropertyChangedEvent propertyChangedEvent = new PropertyChangedEvent(this, "name", this.name, name);
		this.name = name;
		firePropertyChangedEvent(propertyChangedEvent);
	}

	public int getGewicht() {
		return gewicht;
	}

	private void setGewicht(int gewicht) {
		firePropertyChangedEvent("gewicht", this.gewicht, this.gewicht = gewicht);
		if (gewicht >= 20)
			firePigTooFatEvent();
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

}
