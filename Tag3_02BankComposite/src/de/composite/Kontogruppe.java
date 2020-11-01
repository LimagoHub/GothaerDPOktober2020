package de.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kontogruppe extends AbstractKontoNode {
	
	private final List<AbstractKontoNode> children = new ArrayList<>();

	public Kontogruppe(final String label) {
		super(label);
	}
	
	@Override
	public List<AbstractKontoNode> getChildren() {
		return Collections.unmodifiableList(children);
	}
	
	public void appendChild(final AbstractKontoNode child) {
		child.setParent(this);
		children.add(child);
	}

	public void removeChild(final KontoNode child) {
		child.setParent(null);
		children.remove(child);
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Kontogruppe [getLabel()=");
		builder.append(getLabel());
		builder.append("]");
		return builder.toString();
	}

	

	
	

}
