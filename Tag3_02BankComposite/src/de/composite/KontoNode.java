package de.composite;

import java.util.Iterator;
import java.util.List;

public interface KontoNode {

	KontoNode getParent();

	void setParent(KontoNode parent);

	String getLabel();

	void setLabel(String label);

	List<AbstractKontoNode> getChildren();
	
	void print();
	
	Iterator<KontoNode> iterator();

}