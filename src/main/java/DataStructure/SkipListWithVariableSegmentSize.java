package DataStructure;

public class SkipListWithVariableSegmentSize {
	int data;
	SkipListWithVariableSegmentSize Nextnode;
	public int findNode(SkipListWithVariableSegmentSize searchnode) {
		return searchnode.data == data 
				? 0 
				: (
					searchnode.data > data
					? 1
					: -1
				  );
	}
}

class Expressline {
	SkipListWithVariableSegmentSize expressnode;
	
	public int findSegment(SkipListWithVariableSegmentSize searchnode) {
		return searchnode.data == expressnode.data 
				? 0 
				: (
					searchnode.data > expressnode.data
					? 1
					: -1
				  );		
	}
}