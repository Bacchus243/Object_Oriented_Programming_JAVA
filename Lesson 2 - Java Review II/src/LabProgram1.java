import java.util.Scanner;

public class LabProgram1 {
   
   public static int feetToSteps(double userFeet) {
      int steps = (int) (userFeet / 2.5);
      return steps;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double feetWalked = scnr.nextDouble();
      System.out.println(feetToSteps(feetWalked));
   }
}