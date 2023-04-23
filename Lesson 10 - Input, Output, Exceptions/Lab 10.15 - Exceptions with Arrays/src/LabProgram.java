import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] names = { "Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny" };
      int index;

		index = scnr.nextInt();
      
      try {
         if (index >= (names.length) || index < 0) {   
            throw new ArrayIndexOutOfBoundsException("Exception! Index " + index + 
                                                         " out of bounds for length " + names.length);
         }
         else {
            System.out.println("Name: " + names[index]);
         }
      }
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println(e.getMessage());
         if (index < 0) {
            System.out.println("The closest name is: " + names[0]);
         }
         if (index >= names.length) {
            System.out.println("The closest name is: " + names[names.length-1]);
         }
      }
   }
}



