import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Sentiment {

	@SuppressWarnings("resource")
	public static void start (Scanner scnr) {

		System.out.println("\n");
		System.out.println("Sentiment Analysis.\n");
		
		HashSet<String> posHash = new HashSet<String>();
		FileInputStream positiveInStream = null;
		HashSet<String> negHash = new HashSet<String>();
		FileInputStream  negativeInStream = null;
		FileInputStream userFileStream = null;
		
		String currLine;
		String currWord;
		int numPosWords = 0;
		int numNegWords = 0;
		String userFileName = null;
		
		boolean posWord = false;
		boolean negWord = false;
		
		
		
		
		// Read in positive words to posHash
		try {
			positiveInStream = new FileInputStream("positive.txt");
		} 
		catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
		}
		
		
		Scanner inFS = new Scanner(positiveInStream);		
		while (inFS.hasNext()) {
			currLine = inFS.nextLine();
			//System.out.println(currLine);
			try {
				if (!(currLine.charAt(0)== ';')) {
					posHash.add(currLine.toUpperCase());
					++numPosWords;
				}	
			}
			catch (Exception e) {
			}
		}
		
		
		
		
		// Read in negative words to negHash
		try {
			negativeInStream = new FileInputStream("negative.txt");
		}
		catch (Exception e) {
			System.out.println("File Not Found!");
		}
		
		
		inFS = new Scanner(negativeInStream);		
		while (inFS.hasNext()) {
			currLine = inFS.nextLine();
			try {
				if (!(currLine.charAt(0)== ';')) {
					negHash.add(currLine.toUpperCase());
					++numNegWords;
				}
			}
			catch (Exception e) {
			}
		}
		
		
		
		System.out.println(numPosWords + " Positive Words Successfully Loaded");
		System.out.println(numNegWords + " Negative Words Successfully Loaded");
		
		
		
		
		// Ask user for name of file
		System.out.print("\nEnter the name of the text file to perform sentiment analysis:  ");
		userFileName = scnr.next();
		
		
		
		
		// Open filestream for user's file
		try {
			userFileStream = new FileInputStream(userFileName);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
		}
		
		
		
		
		// Analyze each word in User's file
		inFS = new Scanner(userFileStream);
		while (inFS.hasNext()) {
			
			// Read in next word
			currWord = inFS.next();
			currWord = currWord.toUpperCase();
			System.out.println(currWord);
	
			
			// Compare each word to Positive HashSet
				
				// if word == positive, set PosWord == TRUE && increment positive counter
				
				
				
			// IF PosWord == FALSE, Compare each word to Negative HashSet
				
				// if word == negative, set NegWord == TRUE && increment negative counter
				
				
				
			// if neutral, increment neutral counter

	
			
			// Reset PosWord && NegWord to == FALSE
		
		}
		
		
	// Math method for running the calculations on the results 
		
		
	// Print Method for outputting the information 
		
		inFS.close();
	}
}




