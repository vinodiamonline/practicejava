package DataStructure;

class Node {
	int item;
	Node left, right;
	public Node(int key) {
		this.item = key;
		left = right = null;
	}
}

public class BinaryTree {	
	Node root;
	public BinaryTree() {
		root = null;
	}
	public void addElement(int item) {
		Node newNode = new Node(item);
		Node n = this.root;
		if (n == null) {
			root = newNode;
			return;
		}
		Node prevNode = n;
		while(n !=null) {
			prevNode = n;
			if (item > n.item) {
				n = n.right;
			} else {
				n = n.left;
			}
		}
		if (item > prevNode.item) {
			prevNode.right = newNode;
		} else {
			prevNode.left = newNode;
		}
	}
	public void printInOrder() {
		inOrder(this.root);
	}
	private void inOrder(Node n) {
		if (n == null) return;
		if (n.left != null && n.right != null) {
			inOrder(n.left);
			System.out.println(n.item);
			inOrder(n.right);
			return;
		}
		if (n.left != null) {
			inOrder(n.left);
			System.out.println(n.item);
			return;
		}
		if (n.right != null) {
			System.out.println(n.item);
			inOrder(n.right);
			return;
		}
			
		System.out.println(n.item);
	}
	private void deleteleftandrightwithminmaxvalue(Node n, int min, int max) {
		if (n == null) return;
		if (n.left != null && n.right != null) {
			inOrder(n.left);
			System.out.println(n.item);
			inOrder(n.right);
			return;
		}
		if (n.left != null) {
			inOrder(n.left);
			System.out.println(n.item);
			return;
		}
		if (n.right != null) {
			System.out.println(n.item);
			inOrder(n.right);
			return;
		}
			
		System.out.println(n.item);
	}
}


