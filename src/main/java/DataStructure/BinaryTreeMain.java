package DataStructure;

public class BinaryTreeMain {
	public static void main(String [] args) {
		BinaryTree b = new BinaryTree();
		for (int i = 0; i< 50; i++) {
			b.addElement((int)Math.round(Math.random()*100));
			System.out.println("Height = " + b.HeightOfBinarytree());
			System.out.println("HeightR = " + b.HeightOfBinarytreeR(b.root));			
			System.out.println("HeightNew = " + b.HeightOfBinarytreeNew(b.root));			
		}
//		b.addElement(20);
//		b.addElement(12);
//		b.addElement(2);
//		b.addElement(1);
//		b.addElement(6);
//		b.addElement(14);
//		b.addElement(3);
//		b.addElement(9);
//		b.addElement(10);
//		b.addElement(21);
//		b.addElement(4);
//		b.addElement(60);
//		b.addElement(7);
//		b.addElement(30);
//		b.addElement(90);

//		b.printInOrder();

		System.out.println("==================");
		b.PrintPreOrderR();
		System.out.println("==================");		
		b.PrintInOrderR();
		System.out.println("==================");
		b.PrintPostOrderR();
		
//		int itemtodelete = 6;
//		
//		b.deleteNode(itemtodelete);
//		
//		b.printInOrder();
//		
//		System.out.println(b.findelement(itemtodelete));
		
		System.out.println("Height = " + b.HeightOfBinarytree());
	}
}
