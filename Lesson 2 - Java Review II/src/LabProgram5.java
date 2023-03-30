import java.util.Scanner;

public class LabProgram5 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      double loanAmt = scnr.nextDouble();
      double paymentAmt = scnr.nextDouble();
      double interestRate = scnr.nextDouble();
      
      int numPayments = 0;
      
      // System.out.println(loanAmt);
      // System.out.println(paymentAmt);
      // System.out.println(interestRate);
      
      while(loanAmt > 0) {
         loanAmt = loanAmt * (1+interestRate);
         loanAmt = loanAmt - paymentAmt;
         ++numPayments;         
      }
      if(numPayments < 2) {
         System.out.println(numPayments + " payment");
      }
      else {
         System.out.println(numPayments + " payments");
      }
   }
}
