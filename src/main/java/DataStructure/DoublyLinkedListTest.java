package DataStructure;

public class DoublyLinkedListTest {

	public static vDoublylinkedlist addNode(vDoublylinkedlist head, long data) {
		vDoublylinkedlist node = new vDoublylinkedlist(data, null, null);

		if (head == null)  {
			head = node;
			return head;
		}
		vDoublylinkedlist iteratornode = head;
		while(iteratornode.next != null) iteratornode = iteratornode.next;
		node.prev = iteratornode;
		iteratornode.next = node;
		return head;
	}
	

	public static void displayNode(vDoublylinkedlist head) {
		vDoublylinkedlist iteratornode = head;
		while(iteratornode != null) {
			System.out.println(iteratornode.data + " ");
			iteratornode = iteratornode.next;
		}
	}
	
	public static void displayReversed(vDoublylinkedlist head) {
		vDoublylinkedlist iteratornode = head;
		while(iteratornode.next != null) {
			iteratornode = iteratornode.next;
		}
		
		while(iteratornode != null) {
			System.out.println(iteratornode.data + " ");
			iteratornode = iteratornode.prev;
		}

	}
	
	public static void main (String args[]) {
		vDoublylinkedlist head = null;
		for (int i = 0; i< 10; i++) {
			head = addNode(head, Math.round((Math.random() * 100)));
		}
		
		displayNode(head);
		System.out.println("=========================Now in reverse ======================");
		
		displayReversed(head);

	}
}

class vDoublylinkedlist {
	long data;
	vDoublylinkedlist next;
	vDoublylinkedlist prev;
	
	public vDoublylinkedlist(long data, vDoublylinkedlist next, vDoublylinkedlist prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
}

