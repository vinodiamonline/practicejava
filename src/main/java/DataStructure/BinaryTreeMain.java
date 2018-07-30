package DataStructure;

public class BinaryTreeMain {
	public static void main(String [] args) {
		BinaryTree b = new BinaryTree();
		b.addElement(20);
		b.addElement(12);
		b.addElement(2);
		b.addElement(1);
		b.addElement(6);
		b.addElement(14);
		b.addElement(3);
		b.addElement(9);
		b.addElement(10);
		b.addElement(21);
		b.addElement(4);
		b.addElement(60);
		b.addElement(7);
		b.addElement(30);
		b.addElement(90);

		b.printInOrder();
	}
}
