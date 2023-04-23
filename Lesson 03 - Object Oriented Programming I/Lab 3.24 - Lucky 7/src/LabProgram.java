import java.util.Scanner;

public class LabProgram {
   public static void main(String args[]){ 
      Scanner scnr = new Scanner(System.in);
      int credits;
      int seed;
      GVDie die1, die2;
      die1 = new GVDie();
      die2 = new GVDie();
    
      // Read random seed to support testing (do not alter)
      seed = scnr.nextInt();
      die1.setSeed(seed);
    
      // Read starting credits
      credits = scnr.nextInt();
      
      int val1;
      int val2;
      int sum;
      int goal=0;
      int numRounds = 0;   
      
      while(credits != 0) {
         
         die1.roll();
         die2.roll();         
         
         val1 = die1.getValue();
         val2 = die2.getValue();
         
         sum = val1 + val2;

      
         if(sum == 7 || sum == 11) {
            credits++;
         }
         else if(sum == 2 || sum == 3 || sum == 12) {
            credits--;
         }
         else {
            goal = sum;
         }
         
         System.out.println("Dice total: " + sum);
         
         if(sum == 7 || sum == 11 || sum == 2 || sum == 3 || sum == 12) {
            System.out.println("Credits: " + credits);
         }
         
       
            
            while(goal != -1) {
               die1.roll();
               die2.roll();
               
               val1 = die1.getValue();
               val2 = die2.getValue();
               sum = val1 + val2;
               System.out.println("Dice total: " + sum);
               
               if(sum == 7 && sum != goal) {
                  credits--;
                  goal = -1;
                  System.out.println("Credits: " + credits);
                  
               }
               if(sum == goal) {
                  credits++;
                  goal = -1;
                  System.out.println("Credits: " + credits);
               } 
            }
            
            numRounds++;
         }
         
      System.out.println("Rounds: " + numRounds);     
   }
}