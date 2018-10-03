package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.prefs.BackingStoreException;

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
		if (root == null) {
			root = newNode;
			return;
		}

		Node n = this.root;
		while (n != null) {
			if (n.item <= newNode.item) {
				if (n.left == null) {
					n.left = newNode;
					break;
				} else {
					n = n.left;
				}
			} else {
				if (n.right == null) {
					n.right = newNode;
					break;
				} else {
					n = n.right;
				}
			}
		}
	}

	public void addElementR(int item) {
		Node newNode = new Node(item);
		newNode.left = null;
		newNode.right = null;

		if (root == null) {
			root = newNode;
		} else {
			insertReverse(root, newNode);
		}
	}

	private void insertReverse(Node root, Node newNode) {
		if (root.item < newNode.item) {
			if (root.left == null) {
				root.left = newNode;
			} else {
				insertReverse(root.left, newNode);
			}
		} else {
			if (root.right == null) {
				root.right = newNode;
			} else {
				insertReverse(root.right, newNode);
			}
		}
	}

	public void PrintInOrderR() {
		inOrderR(this.root);
	}

	public void PrintPreOrderR() {
		PreOrderR(this.root);
	}

	public void PrintPostOrderR() {
		PostOrderR(this.root);
	}

	public void printInOrder() {
		inOrder(this.root);
	}

	private void visit(Node n) {
		System.out.print(n.item + ",");
	}

	private void inOrderR(Node n) {
		if (n == null)
			return;
		inOrderR(n.left);
		visit(n);
		inOrderR(n.right);
	}

	private void PreOrderR(Node n) {
		if (n == null)
			return;
		visit(n);
		PreOrderR(n.left);
		PreOrderR(n.right);
	}

	private void PostOrderR(Node n) {
		if (n == null)
			return;
		PostOrderR(n.left);
		PostOrderR(n.right);
		visit(n);
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

	public int HeightOfBinarytree() {
		if (root == null) return 0;
		Stack<Node> nodeStack = new Stack<>();
		nodeStack.push(root);
		HashMap<Node, Integer> hMap = new HashMap<>();
		Node n = root;
		hMap.put(root, 1);
		while(!nodeStack.isEmpty()) {
			n = nodeStack.pop();
			if(n.left != null) {
				nodeStack.push(n.left);
				hMap.put(n.left, hMap.get(n) + 1);
			}
			if(n.right != null) {
				nodeStack.push(n.right);
				hMap.put(n.right, hMap.get(n) + 1);
			}
		}

		int maxheight = 1;
		
		for (int i:hMap.values()) {
			maxheight = (i > maxheight) ? i : maxheight;
		}
		
		return maxheight;
	}
		
	public int HeightOfBinarytreeR(Node node) {
		if (node == null) return 0;
		
		int left = HeightOfBinarytreeR(node.left);
		int right = HeightOfBinarytreeR(node.right);
		
		return (left > right) ? left + 1 : right + 1;
	}
	
	public int HeightOfBinarytreeNew(Node node) {
		if (node == null) return 0;
		
		LinkedList<Node> list = new LinkedList<>();
		
		list.add(root);
		int height = 0;

		while(true) {
			int nodecount = list.size();
			if (nodecount == 0) return height;
			height++;
			while(nodecount > 0) {
				 Node n  = list.remove(0);
				 if (n.left != null) list.add(n.left);
				 if (n.right != null) list.add(n.right);
				 nodecount--;
			}
		}
	}
}
