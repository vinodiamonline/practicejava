package DataStructure;

import java.util.ArrayList;
import java.util.Stack;

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
		while (n != null) {
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
		if (n == null)
			return;
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

	public void deletefromminmax(int min, int max) {
		ArrayList<Node> mylist = getElementsInArray();
		for (int i = 0; i < mylist.size(); i++) {
			int item = mylist.get(i).item;
			if (item < min || item > max) {
				if (findelement(item)) {
					deleteNode(item);
				}
			}
		}
	}

	public ArrayList<Node> getElementsInArray() {
		ArrayList<Node> retValue = new ArrayList<Node>();
		Stack<Node> nodeStack = new Stack<Node>();
		nodeStack.push(root);
		while (nodeStack.isEmpty() == false) {
			Node n = nodeStack.pop();
			retValue.add(n);
			if (n.left != null)
				nodeStack.push(n.left);
			if (n.right != null)
				nodeStack.push(n.right);
		}
		return retValue;
	}

	public boolean findelementwithstack(int item) {
		Stack<Node> nodeStack = new Stack<Node>();
		nodeStack.push(root);
		while (nodeStack.isEmpty() != true) {
			Node n = nodeStack.pop();
			if (n.item == item) {
				return true;
			}
			if (n.left != null) {
				nodeStack.push(n.left);
			}
			if (n.right != null) {
				nodeStack.push(n.right);
			}
		}

		return false;
	}

	public boolean findelement(int item) {
		Stack<Node> nodeStack = new Stack<Node>();
		nodeStack.push(root);
		while (nodeStack.isEmpty() != true) {
			Node n = nodeStack.pop();
			if (n.item == item) {
				return true;
			}
			if (n.left != null) {
				nodeStack.push(n.left);
			}
			if (n.right != null) {
				nodeStack.push(n.right);
			}
		}

		return false;
	}

	public void deleteNode(int item) {
		deleteElement(root, item);
	}

	private Node deleteElement(Node n, int item) {
		if (n == null) {
			return null;
		} else if (item < n.item) {
			n.left = deleteElement(n.left, item);
		} else if (item > n.item) {
			n.right = deleteElement(n.right, item);
		} else {
			if (n.left == null) {
				return n.right;
			} else if (n.right == null) {
				return n.left;
			} else {
				Node niterator = n.left.right;
				if (niterator == null) {
					n.item = n.left.item;
					n.left = deleteElement(n.left, n.item);
				} else {
					while (niterator.right != null) {
					}
					n.item = niterator.item;
					n.right = deleteElement(n.right, n.item);
				}
			}
		}
		return n;
	}
}
