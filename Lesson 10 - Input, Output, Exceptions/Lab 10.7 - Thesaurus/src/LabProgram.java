import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      int NUM_CHARACTERS = 26;      // Maximum number of letters
      int MAX_WORDS = 10;           // Maximum number of synonyms per starting letter
      
         
      String[][] synonyms = new String[NUM_CHARACTERS][MAX_WORDS];  // Declare 2D array for all synonyms
      String[] words = new String[MAX_WORDS]; // The words of each input line

      int counter = 0;
      
      // Use scnr to capture letter requirement
      String keyWord = scnr.next();
      String modKeyword = keyWord + ".txt";
      // System.out.println(keyWord);
      // System.out.println(modKeyword);
      

      char keyLetter = scnr.next().charAt(0);
      char currWordChar;
      // System.out.println(keyLetter);
      
      String currWord;
      
      // Create the file reader
      FileInputStream fileInStream = new FileInputStream(modKeyword);
      
      // Create the scanner object for file reader
      Scanner inFS = new Scanner(fileInStream); 
      
      // Loop through the file searching for the words that start with Provided Letter
      while (inFS.hasNext()) {
         currWord = inFS.next();
         currWordChar = currWord.charAt(0);
         
         if (currWordChar == keyLetter) {
            System.out.println(currWord);
            ++counter;
         }
      }
      
      if (counter == 0) {
         System.out.println("No synonyms for " + keyWord + " begin with " + keyLetter + ".");
      }
            // Print out each word that qualifies
   }
}
