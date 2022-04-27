package pkg;

import java.util.LinkedList;

public class Path {
	
	private int price;
	private Node iter;
	private Graph g;
	private LinkedList<Node> nodes;
	
	public Path(Graph g) {
		this.price = 0;
		this.iter = null;
		this.g = g;
		this.nodes = new LinkedList<Node>();
	}
	
	public void addNextNode(int val) {
		if(iter == null) {
			iter = g.getNode(val);
			nodes.add(iter);
			return;
		}
		if(g.getNode(val) == null) {
			System.out.println("Node doesn't exist");
			return;
		}
		if(iter.hasNeighbor(g.getNode(val))) {
			nodes.add(g.getNode(val));
			this.price += iter.getWeight(nodes.getLast());
			iter = nodes.getLast();
		} else {
			System.out.println("Nodes aren't neighbors");
			return;
		}
		
	}
	
	public void printPath() {
		for (Node node : nodes) {
			if(node == nodes.getLast()) {
				System.out.println(node.getData());
				break;
			}
			System.out.print(node.getData() + "->");
		}
	}
	
	public int getPrice() {
		return this.price;
	}

}
