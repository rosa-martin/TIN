package pkg;

public class Main {

	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree(new Node(7));
		
		bt.insert(5);
		bt.insert(14);
		bt.insert(1);
		bt.insert(6);
		bt.insert(10);
		bt.insert(16);
		bt.insert(9);
		
		System.out.println(bt.contains(1));
		System.out.println(bt.contains(25));
		System.out.println();
		
		bt.printPreOrder(bt.getRoot());
		System.out.println();
		bt.printInOrder(bt.getRoot());
		System.out.println();
		bt.printPostOrder(bt.getRoot());
		System.out.println();
		System.out.println();
		
		bt.sumUpLeafs(bt.getRoot());
		System.out.println(bt.getSumOfLeafs());
		bt.sumUpInner(bt.getRoot());
		System.out.println(bt.getSumOfInner());
		System.out.println();
		bt.printAtLevel(bt.getRoot(), 3);
		System.out.println();
		
		bt.sumUpAll(bt.getRoot());
		System.out.println(bt.getSumOfAll());

	}

}
