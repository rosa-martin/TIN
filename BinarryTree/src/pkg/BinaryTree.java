package pkg;

public class BinaryTree {
	
	private Node root;
	private int sumOfLeafs = 0;
	private int sumOfInner = 0;
	private int lvlCtr = 1;
	
	public BinaryTree() {
		this.root = null;
	}
	
	public BinaryTree(Node root) {
		this.root = root;
	}
	
	public void insert(int value) {
		Node iter = root;
		Node newNode = new Node(value);
		
		while(true) {
			if(value > iter.getData()) {
				if(iter.getRightNode() != null) {
					iter = iter.getRightNode();
				} else {
					iter.setRightNode(newNode);
					return;
				}
				
			} else if(value < iter.getData()) {
				if(iter.getLeftNode() != null) {
					iter = iter.getLeftNode();
				} else {
					iter.setLeftNode(newNode);
					return;
				}
			} else if(value == iter.getData()) {
				System.out.println("Value " + value + " is already in the tree. Nothing was added");
				return;
			}
		}
	}
	
	public boolean contains(int value) {
		Node iter = root;
		
		while(iter != null) {
			if(value > iter.getData()) {
				iter = iter.getRightNode();
			} else if(value < iter.getData()) {
				iter = iter.getLeftNode();
			} else if(value == iter.getData()) {
				return true;
			}
		}
		
		return false;
	}
	
	public void printPreOrder(Node node) {
		if(node == null) {
			return;
		}
		
		System.out.print(node.getData() + " ");
		this.printPreOrder(node.getLeftNode());
		this.printPreOrder(node.getRightNode());
	}
	
	public void printInOrder(Node node) {
		if(node == null) {
			return;
		}
		
		this.printInOrder(node.getLeftNode());
		System.out.print(node.getData() + " ");
		this.printInOrder(node.getRightNode());
	}
	
	public void printPostOrder(Node node) {
		if(node == null) {
			return;
		}
		
		this.printPostOrder(node.getLeftNode());
		this.printPostOrder(node.getRightNode());
		System.out.print(node.getData() + " ");
	}
	
	public void sumUpLeafs(Node node) {
		if(node == null) {
			return;
		}
		
		if(node.getLeftNode() == null && node.getRightNode() == null) {
			this.sumOfLeafs += node.getData();
			return;
		}
		
		this.sumUpLeafs(node.getLeftNode());
		this.sumUpLeafs(node.getRightNode());
	}
	
	public void sumUpInner(Node node) {
		if(node == null) {
			return;
		}
		
		if(node != this.root && (node.getLeftNode() != null || node.getRightNode() != null)) {
			this.sumOfInner += node.getData();
		}
		
		this.sumUpInner(node.getLeftNode());
		this.sumUpInner(node.getRightNode());
		
	}
	
	public void printAtLevel(Node node, int lvl) {
		if(node == null) {
			return;
		}
		
		if(this.lvlCtr == lvl) {
			System.out.print(node.getData() + " ");
			this.lvlCtr--;
			return;
		}
		
		this.lvlCtr++;
		this.printAtLevel(node.getLeftNode(), lvl);
		this.lvlCtr++;
		this.printAtLevel(node.getRightNode(), lvl);
		this.lvlCtr = 1;
		
		
	}
	
	public boolean isEmpty() {
		return root == null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public int getSumOfLeafs() {
		return sumOfLeafs;
	}

	public int getSumOfInner() {
		return sumOfInner;
	}
	
	
}
