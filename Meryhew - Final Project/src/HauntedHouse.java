import java.util.ArrayList;
import java.util.Scanner;

public class HauntedHouse {

	public static void start (Scanner scnr) {

		System.out.println("\n");
		System.out.println("Escape the Haunted House.\n\n");
		String message;
		
		Node A = new Node("A");
		Node B = new Node("B");
		Node C = new Node("C");
		Node D = new Node("D");
		Node E = new Node("E");
		Node F = new Node("F");
		Node G = new Node("G");
		Node H = new Node("H");
		Node I = new Node("I");
		Node J = new Node("J");
		Node K = new Node("K");
		Node L = new Node("L");
		
		A.setCardinals(null, B, E, null);
		B.setCardinals(null, C, F, A);
		C.setCardinals(null, D, null, B);
		D.setCardinals(null, null, H, C);
		E.setCardinals(A, null, I, null);
		F.setCardinals(B, G, null, null);
		G.setCardinals(null, null, K, F);
		H.setCardinals(D, null, null, null);
		I.setCardinals(E, J, null, null);
		J.setCardinals(null, null, null, I);
		K.setCardinals(G, L, null, null);
		L.setCardinals(null, null, null, K);
		
		Node currNode = A;
		String selection;
		
		
		while (currNode != L) {
			message = findOptions(currNode);
			System.out.println("You are in room " + currNode.name + " of the Haunted House. " + message);
			selection = scnr.next();
			currNode = decisionMaker(selection, currNode);
		}
		
		System.out.println("\n\nYou are in room L of the Haunted House. You made it out alive!\n\n");
	}
	
	
	
	
	public static Node decisionMaker(String selection, Node currNode) {
		Node nextNode;
		
		if (selection.equals("N") && currNode.north != null) {
			nextNode = currNode.north;
		}
		else if (selection.equals("E") && currNode.east != null) {
			nextNode = currNode.east;
		}		
		else if (selection.equals("S") && currNode.south != null) {
			nextNode = currNode.south;
		}
		else if (selection.equals("W") && currNode.west != null) {
			nextNode = currNode.west;
		}
		else {
			System.out.println("You can't go in that direction!");
			nextNode = currNode;
		}
		
		
		return nextNode;
	}

	
	


	public static String findOptions(Node myNode) {
		String message = "You can go ";
		
		String place1 = "north";
		String place2 = "east";
		String place3 = "south";
		String place4 = "west";
		
		ArrayList<String> options = new ArrayList<String>();
		
		
		if (myNode.north != null) {
			options.add(place1);
		}
		
		if (myNode.east != null) {
			options.add(place2);
		}
		
		if (myNode.south != null) {
			options.add(place3);
		}
		
		if (myNode.west != null) {
			options.add(place4);
		}
		
		
		if (options.size() == 1) {
			message = message + options.get(0);
		}
		
		if (options.size() == 2) {
			message = message + options.get(0) + " or " + options.get(1);
		}
		
		if (options.size() == 3) {
			message = message + options.get(0) + ", " + options.get(1) 
										+ ", or " + options.get(2);
		}
		
		if (options.size() == 4) {
			message = message + options.get(0) + ", " + options.get(1) 
							+ ", " + options.get(2) + ", or " + options.get(3);
		}
		
		message = message + ".";
		
		
		return message;
	}
}