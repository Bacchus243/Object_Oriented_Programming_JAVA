import java.util.Scanner; 

public class LabProgram2 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String firstName;
      String genericLocation;
      int wholeNumber;
      String pluralNoun;
      String tmpStr;
   
      //System.out.println("Enter your first name: ");
      firstName = scnr.next();
      
      //System.out.println("Enter a generic location: ");
      genericLocation = scnr.next();
      
      //System.out.println("Enter a whole number: ");
      wholeNumber = scnr.nextInt();
      
      //tmpStr = scnr.nextLine();
      
      //System.out.println("Enter a plural noun: ");
      pluralNoun = scnr.next();
   
      System.out.println(firstName + " went to " + genericLocation + " to buy " + wholeNumber + " different types of " + pluralNoun + ".");
   }
}
