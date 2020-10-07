package de.composite;

import java.util.Collections;
import java.util.List;

public abstract class AbstractNode implements INode {

	private INode parent = null;
	private String label;
	
	
	
	public AbstractNode(String label) {
		this.label = label;
	}



	@Override
	public INode getParent() {
		return parent;
	}



	@Override
	public void setParent(INode parent) {
		this.parent = parent;
	}



	@Override
	public String getLabel() {
		return label;
	}



	@Override
	public void setLabel(String label) {
		this.label = label;
	}


	@Override
	public List<AbstractNode> getChildren() {
		return Collections.emptyList();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AbstractNode [parent=");
		builder.append(parent);
		builder.append(", label=");
		builder.append(label);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
