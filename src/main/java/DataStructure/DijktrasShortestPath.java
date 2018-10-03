package DataStructure;

import java.util.Arrays;

public class DijktrasShortestPath {

	public static void main(String[] args) {
		BinaryHeap bh = new BinaryHeap(30);
	}

	
	
}

class BinaryHeap {
	public static final int d = 2;
	private int heapsize;
	private int []heap;
	
	public BinaryHeap(int capacity) {
		heapsize=0;
		heap = new 	int [capacity+1];
        Arrays.fill(heap, -1);
	}
	
	public boolean isEmpty() {
		return heapsize == 0;
	}
	
	public boolean isFull() {
		return heapsize == heap.length;
	}
	
	/** Clear heap */
    public void makeEmpty( )
    {
        heapsize = 0;
    }
    
    /** Function to  get index parent of i **/
    private int parent(int i) 
    {
        return (i - 1)/d;
    }
    /** Function to get index of k th child of i **/
    private int kthChild(int i, int k) 
    {
        return d * i + k;
    }
    
}
