import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Sentiment {

	@SuppressWarnings("resource")
	public static void start (Scanner scnr) {
		
		HashSet<String> posHash = new HashSet<String>();
		FileInputStream positiveInStream = null;
		
		HashSet<String> negHash = new HashSet<String>();
		FileInputStream  negativeInStream = null;
		
		FileInputStream userFileStream = null;
		
		String currLine;
		String currWord;
		String userFileName = null;
		String currPosWord = "";
		String currNegWord = "";
		String sentiment = null;
		String doAgain = "Y";
		
		int posWordsLoaded = 0;
		int negWordsLoaded = 0;		
		int totalUserWords = 0;
		int numPosWords = 0;
		int numNegWords = 0;
		
		double numberPosWords;
		double numberNegWords;
		double percentPos = 0;
		double percentNeg = 0;
		
		Iterator<String> posIT;
		Iterator<String> negIT;
		

		System.out.println("\n");
		System.out.println("Sentiment Analysis.\n");

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
					++posWordsLoaded;
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
					++negWordsLoaded;
				}
			}
			catch (Exception e) {
			}
		}
		
		
		
		System.out.println(posWordsLoaded + " Positive Words Successfully Loaded");
		System.out.println(negWordsLoaded + " Negative Words Successfully Loaded");
		
		
		
		
		
		while (doAgain.equals("Y")) {
			
		
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
				currWord = currWord.replaceAll("[^a-zA-Z]","");
				++totalUserWords;
				
		
				// Compare each word to Positive HashSet
					// if word == positive, set PosWord == TRUE && increment positive counter
				posIT = posHash.iterator();
				while (posIT.hasNext()) {
					currPosWord = posIT.next();
					if (currWord.equals(currPosWord)) {
						++numPosWords;
					}
				}
				
				
				// IF PosWord == FALSE, Compare each word to Negative HashSet
					// if word == negative, set NegWord == TRUE && increment negative counter
				negIT = negHash.iterator();
				while (negIT.hasNext()) {
					currNegWord = negIT.next();
					if (currWord.equals(currNegWord)) {
						++numNegWords;
					}
				}
			}
			
		// Math for running the calculations on the results
			numberPosWords = numPosWords;
			numberNegWords = numNegWords;
			
			percentPos = (numberPosWords / totalUserWords) * 100;
			percentNeg = (numberNegWords / totalUserWords) * 100;
			
			
			if ((percentPos - percentNeg) >= 5) {
				sentiment = "positive";
			}
			
			else if ((percentNeg - percentPos) >= 5) {
				sentiment = "negative";
			}
			
			else {
				sentiment = "neutral";
			}
			
			
			
			System.out.println("\nSentiment Report for " + userFileName + ":");
			
			System.out.println("There were " + numPosWords + " positive words, " 
								+ numNegWords + " negative words and " + totalUserWords + " total words.");
			
			System.out.printf("That's %.1f%% positive and %.1f%% negative. Overall the file's sentiment was %s.\n\n",  
									percentPos, percentNeg, sentiment);
			
			
			System.out.print("Would you like to analyze another file Y/N? ");
			doAgain = scnr.next();
			doAgain = doAgain.toUpperCase();
			
		// Zero out variables
			numPosWords = 0;
			numNegWords = 0;
			totalUserWords = 0;
		}
			
		
	// Print Method for outputting the information 
		
	}
}




