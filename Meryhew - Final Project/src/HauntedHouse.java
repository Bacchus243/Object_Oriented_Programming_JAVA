import java.util.Scanner;

public class HauntedHouse {

	public static void start (Scanner scnr) {

		System.out.println("\n");
		System.out.println("Escape the Haunted House.\n\n");
		
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
		
	}
}