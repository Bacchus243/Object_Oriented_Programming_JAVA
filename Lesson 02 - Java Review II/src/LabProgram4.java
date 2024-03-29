import java.util.Scanner;
import java.util.Random;

public class LabProgram4 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int ROCK = 0;
      final int PAPER = 1;
      final int SCISSORS = 2;
      Random rand = new Random();
      int seed = scnr.nextInt();
      rand.setSeed(seed);
      
// Task 1 // 
      
      String player1 = scnr.next();
      String player2 = scnr.next();
      int numRounds = scnr.nextInt();
      
      while(numRounds < 1) {
         System.out.println("Rounds must be > 0");
         numRounds = scnr.nextInt();
      }
      System.out.println(player1 + " vs " + player2 + " for " + numRounds + " rounds");
      
      
// Task 2 //
      
      int player1Num;
      int player2Num;
      
      int p1WinCount = 0;
      int p2WinCount = 0;
      
   
      for(int i = 0; i < numRounds; ++i){
         
         player1Num = rand.nextInt(3);
         player2Num = rand.nextInt(3);
         
         while(player1Num == player2Num) {
            System.out.println("Tie");
            player1Num = rand.nextInt(3);
            player2Num = rand.nextInt(3);
         }   
         
   // Task 3 //
   
         
         // Player 1 == ROCK
         if(player1Num == ROCK) { 
                     
            if(player2Num == PAPER) {
               System.out.println(player2 + " wins with paper");
               p2WinCount++;
            }
            
            else {
               System.out.println(player1 + " wins with rock");
               p1WinCount++;
            }
         }
         
         
         // PLAYER 1 == PAPER
         else if(player1Num == PAPER) {
   
            if(player2Num == ROCK) {
               System.out.println(player1 + " wins with paper");
               p1WinCount++;
            }
            
            else {
               System.out.println(player2 + " wins with scissors");
               p2WinCount++;
            }
            
         }
            
         // PLAYER 1 == SCISSORS
         else {
            
            if(player2Num == ROCK) {
               System.out.println(player2 + " wins with rock");
               p2WinCount++;
            }
   
            else {
               System.out.println(player1 + " wins with scissors");
               p1WinCount++;
            }
         }
      } 
      
      if(p1WinCount > p2WinCount) {
         System.out.println(player1 + " wins " + p1WinCount + " and " + player2 + " wins " + p2WinCount);
      }
      else {
         System.out.println(player2 + " wins " + p2WinCount + " and " + player1 + " wins " + p1WinCount);
      }
      
   }
}
