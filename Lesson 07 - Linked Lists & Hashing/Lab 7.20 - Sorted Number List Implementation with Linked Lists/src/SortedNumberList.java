
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

		
		

		while (missionComplete == false) {
			if (head == null) {		
				// make Head and Tail == newNode
				head = newNode;
				tail = newNode;
				missionComplete = true;
			}
			
			else {
				if (newData <= currNode.getData()) {
					if (currNode == head) {
						// make newNode the Head node in list, set missionComplete = true
						head = newNode;
						newNode.setNext(currNode);
						currNode.setPrevious(newNode);
						missionComplete = true;
					}
					else {
						// put newNode in front of currNode, set missionComplete = true
						tempNode = currNode.getPrevious();
						tempNode.setNext(newNode);
						newNode.setPrevious(tempNode);
						newNode.setNext(currNode);
						currNode.setPrevious(newNode);
						missionComplete = true;						
					}
				}
				
				else {	//if (newData > currNode.getData()) 
					if (currNode == tail) {
						// make newNode == tail, set missionComplete = true
						currNode.setNext(newNode);
						newNode.setPrevious(currNode);
						newNode = tail;
						missionComplete = true;
						
					}
					else {
						//update currNode and start over again
						currNode = currNode.getNext();
						
					}
				}
			}
			
			
		}
		
	}

	// Removes the node with the specified number value from the list. Returns true if the node is found and removed, false otherwise.
	public boolean remove(double number) {
	   // Your code here
	   
	   return false;
	}
}
