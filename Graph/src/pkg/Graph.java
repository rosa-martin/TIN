package pkg;

import java.util.LinkedList;
import java.util.List;

public class Graph {
	
	private List<Node> vertices;
	
	public Graph() {
		vertices = new LinkedList<Node>();
	}
	
	public void addSide(int val1, int val2, int weight) {
		Node n1 = null;
		Node n2 = null;
		
		for (Node node : vertices) {
			if(node.getData() == val1) {
				n1 = node;
			}
			if(node.getData() == val2) {
				n2 = node;
			}
		}
		
		if(n1 == null) {
			n1 = new Node(val1);
			vertices.add(n1);
		}
		
		if(n2 == null) {
			n2 = new Node(val2);
			vertices.add(n2);
		}
		
		n1.addNode(n2, weight);
		
		
	}
	
	public Node getNode(int i) {
		for (Node node : vertices) {
			if(node.getData() == i) {
				return node;
			}
		}
		System.out.println("Error: Node not in graph");
		return null;
	}
}
