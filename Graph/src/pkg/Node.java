package pkg;

import java.util.HashMap;

public class Node {
	
	private int data;
	private HashMap<Node, Integer> neighbors;
	
	public Node(int data) {
		this.data = data;
		this.neighbors = new HashMap<Node, Integer>();
	}
	
	public void addNode(Node n, int weight) {
		neighbors.put(n, weight);
	}
	
	public boolean hasNeighbor(Node n) {
		return neighbors.containsKey(n);
	}
	
	public int getWeight(Node n) {
		return neighbors.get(n);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
	
}
