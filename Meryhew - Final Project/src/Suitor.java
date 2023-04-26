import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Suitor {

	public static void start (Scanner scnr) {
		LinkedList<Lady> listOfLadies = new LinkedList<Lady>();
		int numSuitors;
		int i;
		String suitorName;
		Lady currChick;
		
		System.out.println("\n");
		System.out.println("Select the suitor.");
		System.out.println("Enter the number of Suitors: ");
		
		numSuitors = scnr.nextInt();
		
		for (i = 1; i<numSuitors+1; ++i) {
			System.out.println("Enter the name of Suitor #" + i + ":  ");
			suitorName = scnr.next();
			
			currChick = new Lady(i, suitorName);
			listOfLadies.add(currChick);
		}
		
//		System.out.println(listOfLadies.size());
		
		currChick = listOfLadies.getFirst();
		
		
		ListIterator<Lady> list_Iter = listOfLadies.listIterator(0);
		list_Iter.next();
		list_Iter.next();
		list_Iter.remove();
		
		System.out.println(currChick.chickName);
		

	}
}




