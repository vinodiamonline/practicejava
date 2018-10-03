package DataStructure;

public class LinkedListTest {
	public static vlinkedlist addNode(vlinkedlist head, long data) {
		vlinkedlist node = new vlinkedlist(data, null);

		if (head == null)  {
			head = node;
			return head;
		}
		vlinkedlist iteratornode = head;
		while(iteratornode.next != null) iteratornode = iteratornode.next;
		iteratornode.next = node;
		return head;
	}
	
	public static void displayNode(vlinkedlist head) {
		vlinkedlist iteratornode = head;
		while(iteratornode != null) {
			System.out.println(iteratornode.data + " ");
			iteratornode = iteratornode.next;
		}
	}
	
	public static void main (String args[]) {
		vlinkedlist head = null;
		for (int i = 0; i< 100; i++) {
			head = addNode(head, Math.round((Math.random() * 100)));
		}
		
		displayNode(head);
	}
}

class vlinkedlist {
	long data;
	vlinkedlist next;
	public vlinkedlist(long data, vlinkedlist next) {
		this.data = data;
		this.next = next;
	}
}

