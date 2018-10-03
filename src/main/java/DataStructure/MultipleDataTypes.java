package DataStructure;


class MultipleDataTypes {
	
	public static void main (String args[]) {
		linkedlistMethods lm = new linkedlistMethods();
		
		lm.insert(10);
		lm.insert(11);
		lm.insert(12);
		lm.insert(13);
		lm.insert(14);
		lm.insert(15);
		lm.insert(16);
		lm.insert(17);
		lm.insert(18);
		lm.insert(19);
		lm.insert(20);
		lm.insert(21);
		lm.insert(22);
		lm.insert(23);
		lm.insert(24);
		lm.insert(25);
		lm.insert(26);
		lm.insert(27);
		lm.insert(28);
		lm.insert(29);
		lm.insert(30);
		
		lm.printnodetypes();
	}
}

class linkedlist {
	public linkedlist nextnode;
	public int value;
}


class junction extends linkedlist {
	linkedlist nextJunction;
}

class linkedlistMethods {
	private linkedlist root = null;

	public linkedlist getList() {
		return this.root;
	}
	
	public void printnodetypes() {
		linkedlist root1 = root;
		String typeofnodes = "";
		while (root1 != null) {
			if (root1 instanceof junction) {
				typeofnodes = " junction ";
			} else {
				typeofnodes = " nodes ";
			}
			System.out.println("Node Type " + typeofnodes + " value is " + root1.value);
			
//			if (root1 instanceof junction) {
//				junction jn = (junction) root1;
//				root1 = jn.nextJunction;
//			} else {
//				
//			}
			root1 = root1.nextnode;
		}
	}
	
	public void insert(int value) {
		if (root == null) {
			root = new junction();			
			root.nextnode = null;
			root.value = value;
			return;
		}
		int size = 1;
		junction jn = null;
		linkedlist root1 = root;
		while (root1.nextnode != null) {
			size++;
			if (root1 instanceof junction) {jn = (junction)root1;}
			root1 = root1.nextnode;
		}
		if (size%2 ==1) {
			linkedlist newnode = new linkedlist();
			newnode.nextnode = null;
			newnode.value = value;
			root1.nextnode = newnode;
		} else {
			junction j2 = new junction();
			j2.nextJunction = null;
			j2.nextnode = null;
			j2.value = value;
			if (jn !=null)jn.nextJunction = j2;
			root1.nextnode = j2;
		}
		return;
	}
}


