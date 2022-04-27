package pkg;

public class Main {

	public static void main(String[] args) {
		
		Graph g = new Graph();
		g.addSide(1, 6, 6);
		g.addSide(1, 2, 4);
		g.addSide(1, 7, 16);
		g.addSide(2, 3, 24);
		g.addSide(6, 3, 23);
		g.addSide(6, 5, 5);
		g.addSide(6, 7, 8);
		g.addSide(7, 8, 21);
		g.addSide(5, 3, 18);
		g.addSide(5, 4, 11);
		g.addSide(5, 8, 14);
		g.addSide(8, 4, 7);
		g.addSide(4, 3, 9);
		
		
		System.out.println("Path 1:");
		Path p1 = new Path(g);
		p1.addNextNode(1);
		p1.addNextNode(6);
		p1.addNextNode(5);
		p1.addNextNode(4);
		p1.addNextNode(3);
		p1.printPath();
		System.out.println(p1.getPrice());

		
		System.out.println("Path 2:");
		Path p2 = new Path(g);
		p2.addNextNode(1);
		p2.addNextNode(6);
		p2.addNextNode(7);
		p2.addNextNode(8);		
		p2.addNextNode(4);		
		p2.addNextNode(3);		
		p2.printPath();
		System.out.println(p2.getPrice());
	}

}
