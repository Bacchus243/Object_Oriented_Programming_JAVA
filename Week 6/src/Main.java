import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      final int NUM_ELEMENTS = 6;
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> listInts = new ArrayList<Integer>();
      // Hint: Declare listNegInts
      ArrayList<Integer> listNegInts = new ArrayList<Integer>();
      int i;
      
      // Get input integers
      for (i = 0; i < NUM_ELEMENTS; ++i) {
         listInts.add(scnr.nextInt());
      }
      
      for (i = 0; i < listInts.size(); ++i) {
    	  if (listInts.get(i) < 0) {
    		  listNegInts.add(listInts.get(i));
    	  }
      }
      
      System.out.println(listNegInts.size());
      
      for (i = 0; i < listNegInts.size(); ++i) {
    	  System.out.println(listNegInts.get(i));
      }
    }
}
