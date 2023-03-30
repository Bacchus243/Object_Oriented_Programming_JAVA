import java.util.Scanner;

public class LabProgram3 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int par;
      int strokes;
      int difference;
      
      par = scnr.nextInt();
      strokes = scnr.nextInt();
      
      difference = par - strokes;
      
      if (par==3 || par ==4 || par==5) {
         
         switch (difference) {
         
         case 2:
            System.out.println("Eagle");
            break;
            
         case 1:
            System.out.println("Birdie");
            break;
            
         case 0:
            System.out.println("Par");
            break;
         
         case -1:
            System.out.println("Bogey");
            break;
         
         default:
            break;
         }
      }
      else {
         System.out.println("Error");
         
         
         //default:
           // System.out.println("Error");
            //break;
      }
      
      
      
   }
}
