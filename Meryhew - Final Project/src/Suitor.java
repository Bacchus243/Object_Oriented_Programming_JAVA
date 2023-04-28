import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Suitor {

	public static void start (Scanner scnr) {
		LinkedList<Lady> listOfLadies = new LinkedList<Lady>();
		int numSuitors;
		int i;
		String suitorName;
		Lady currChick = null;
		
		System.out.println("\n");
		System.out.println("Select the suitor.\n");
		System.out.print("Enter the number of Suitors: ");
		
		
		numSuitors = scnr.nextInt();
		System.out.println();
		
		for (i = 1; i<numSuitors+1; ++i) {
			System.out.print("Enter the name of Suitor #" + i + ":  ");
			suitorName = scnr.next();
			currChick = new Lady(i, suitorName);
			listOfLadies.add(currChick);
		}
		
		System.out.println();
		
		
//		String test;
		
		ListIterator<Lady> list_Iter = listOfLadies.listIterator();
		
		

//		1test = list_Iter.next().chickName;
//		System.out.println(test);
		
		
		while (list_Iter.hasNext()) {

			for (i = 0; i < 3; ++i) {
				if (listOfLadies.size() > 1 && list_Iter.hasNext()) {
					currChick = list_Iter.next();
				}
				else {
					list_Iter = listOfLadies.listIterator();
					currChick = list_Iter.next();
				}
			}
			
			if (listOfLadies.size() > 1) {
				System.out.println("Suitor #" + currChick.linePosition + 
											", " + currChick.chickName + ", eliminated.");
				list_Iter.remove();
			}
			
			if (listOfLadies.size() > 1 && !(list_Iter.hasNext())) {
				list_Iter = listOfLadies.listIterator();
			}
		}
		
		

		
		currChick = listOfLadies.getFirst();
		System.out.println("\nThe correct suitor was #" + currChick.linePosition + 
				", " + currChick.chickName);
		
	}
}




