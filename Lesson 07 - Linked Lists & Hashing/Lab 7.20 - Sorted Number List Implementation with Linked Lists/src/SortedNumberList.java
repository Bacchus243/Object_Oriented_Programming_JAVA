
public class SortedNumberList {
	public Node head;
	public Node tail;

	public SortedNumberList() {
		head = null;
		tail = null;
	}

   // Optional: Add any desired private methods here
   
   
	// Inserts the number into the list in the correct 
	// position such that the list remains sorted in 
	// ascending order.
	public void insert(double number) {
		
		// take in/assign the provided initial value
		double newData = number;
		boolean missionComplete = false;
		Node currNode = head;
		Node newNode = new Node(newData);
		Node tempNode;

		
		// if no head exists, set Node as the head object in list
		if (head == null) {
			head = newNode;
			tail = newNode;
			missionComplete = true;
		}
		
		
		
		while (missionComplete == false) {
			// compare currNodeData to this data
			
			if (currNode.getData() >= newData) {
				
				if(currNode == head) {
					head = newNode;
					newNode.setNext(currNode);
					currNode.setPrevious(newNode);
					currNode.setNext(null);
					tail = currNode;
				}
				
			
				else {
					tempNode = currNode.getPrevious();
					currNode.setPrevious(newNode);
					newNode.setNext(currNode);
					newNode.setPrevious(tempNode);
					missionComplete = true;
				}
			}
			
			
			else if (currNode.getData() < newData) {
				
				if (currNode.getNext() == null) {
					currNode.setNext(newNode);
					newNode.setPrevious(currNode);
					tail = newNode;
				}
				else {
					currNode = currNode.getNext();
				}
			}
		}
		

	}

	// Removes the node with the specified number value 
	// from the list. Returns true if the node is found 
	// and removed, false otherwise.
	public boolean remove(double number) {
	   // Your code here
	   
	   return false;
	}
}
