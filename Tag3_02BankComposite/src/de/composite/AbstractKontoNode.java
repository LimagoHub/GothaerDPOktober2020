package de.composite;

import java.util.Collections;
import java.util.List;

public abstract class AbstractKontoNode implements KontoNode {

	private KontoNode parent = null;
	private String label;
	
	
	
	public AbstractKontoNode(final String label) {
		this.label = label;
	}



	@Override
	public KontoNode getParent() {
		return parent;
	}



	@Override
	public void setParent(final KontoNode parent) {
		this.parent = parent;
	}



	@Override
	public String getLabel() {
		return label;
	}



	@Override
	public void setLabel(final String label) {
		this.label = label;
	}


	@Override
	public List<AbstractKontoNode> getChildren() {
		return Collections.emptyList();
	}
	
	@Override
	public void print() {
		System.out.println(this);
		for (final KontoNode child : getChildren()) {
			child.print();
		}
		
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("AbstractNode [parent=");
		builder.append(parent);
		builder.append(", label=");
		builder.append(label);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
