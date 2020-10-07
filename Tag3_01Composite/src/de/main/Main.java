package de.main;

import de.composite.INode;
import de.composite.Leaf;
import de.composite.Node;

public class Main {

	public static void main(String[] args) {

		Node root = new Node("ROOT");
		
		Node e1_1 = new Node("E1_1");
		root.appendChild(e1_1);
		
		Node e1_2 = new Node("E1_2");
		root.appendChild(e1_2);
		
		
		Node e2_1 = new Node("E2_1");
		e1_1.appendChild(e2_1);
		
		Node e2_2 = new Node("E2_2");
		e1_1.appendChild(e2_2);
		
		
		Leaf e2_3 = new Leaf("e2_3");
		e1_2.appendChild(e2_3);
		
		travers(root);
	}
	
	public static void travers(INode node) {
		System.out.println(node);
		for (INode child : node.getChildren()) {
			travers(child);
		}
	}

}
