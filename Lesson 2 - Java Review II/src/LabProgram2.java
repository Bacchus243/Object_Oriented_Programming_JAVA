import java.util.Scanner;

public class LabProgram2 {
   
   public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
      double cost = (milesDriven / milesPerGallon) * dollarsPerGallon;
      return cost;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double mpg = scnr.nextDouble();
      double gasPrice = scnr.nextDouble();
      
      System.out.printf("%.2f ", drivingCost(mpg, gasPrice, 10));
      System.out.printf("%.2f ", drivingCost(mpg, gasPrice, 50));
      System.out.printf("%.2f\n", drivingCost(mpg, gasPrice, 400));

   }
}
