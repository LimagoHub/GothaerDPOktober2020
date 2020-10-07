package de.composite;

import java.util.List;

public interface INode {

	INode getParent();

	void setParent(INode parent);

	String getLabel();

	void setLabel(String label);

	List<AbstractNode> getChildren();

}