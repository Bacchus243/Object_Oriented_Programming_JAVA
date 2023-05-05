import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class LabProgram {

   // Input 5 Integers and return the Integers in an ArrayList
   public static ArrayList<Integer> inputIntegers(Scanner scnr) {
      int nextNum;
      ArrayList<Integer> myIntegers = new ArrayList<Integer>();
      
      for (int i = 0; i < 5; ++i) {
         nextNum = scnr.nextInt();
         myIntegers.add(nextNum);
      }
      return myIntegers;
   }

   // Input 5 Doubles and return the Doubles in an ArrayList
   public static ArrayList<Double> inputDoubles(Scanner scnr) {
      double nextNum;
      ArrayList<Double> myDoubles = new ArrayList<Double>();
      for (int i = 0; i < 5; ++i) {
          nextNum = scnr.nextDouble();
          myDoubles.add(nextNum);
       }
      return myDoubles;
   }

   // Input 5 Strings, and return the Strings in an ArrayList
   public static ArrayList<String> inputWords(Scanner scnr) {
      String nextStr = null;
      ArrayList<String> myStrings = new ArrayList<String>();
      for (int i = 0; i < 5; ++i) {
    	  nextStr = scnr.next();
    	  myStrings.add(nextStr);
      }
      return myStrings;
   }

   // Output the elements of the ArrayList parameter
   public static <TheType extends Comparable<TheType>>
      void print(ArrayList<TheType> list) {
      for (int i = 0; i < list.size(); ++i) {
    	  TheType item = list.get(i);
    	  System.out.print(item +  " ");
      }
      System.out.print("\n");
   }

   // Return the min, median, and max of the ArrayList parameter in a new ArrayList
   public static <TheType extends Comparable<TheType>>
      ArrayList<TheType> getStatistics(ArrayList<TheType> list) {
	   
	   TheType min, median, max;
	   ArrayList<TheType> newList = new ArrayList<TheType>();
	   list.sort(null);
	   min = list.get(0);
	   median = list.get(2);
	   max = list.get(4);
	   newList.add(min);
	   newList.add(median);
	   newList.add(max);
	   return newList; 
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Input a list of 5 Integers and print the ArrayList's statistics
      ArrayList<Integer> integers = inputIntegers(scnr);
      print(integers);
      ArrayList<Integer> integerStatistics = getStatistics(integers);
      print(integerStatistics);
      System.out.println();

      // Input a list of 5 Doubles and print the ArrayList's statistics
      ArrayList<Double> doubles = inputDoubles(scnr);
      print(doubles);
      ArrayList<Double> doubleStatistics = getStatistics(doubles);
      print(doubleStatistics);
      System.out.println();

      // Input a list of 5 words (Strings) and print the ArrayList's statistics
      ArrayList<String> words = inputWords(scnr);
      print(words);
      ArrayList<String> wordStatistics = getStatistics(words);
      print(wordStatistics);
   }
}
