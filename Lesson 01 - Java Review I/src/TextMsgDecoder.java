import java.util.Scanner;

public class TextMsgDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int BFF = -1;
      int IDK = -1;
      int JK = -1;
      int TMI = -1;
      int TTYL = -1;
      
      System.out.println("Enter text:");
      
      String userString = scnr.nextLine();
      
      System.out.print("You entered: ");
      System.out.println(userString);
   
      
      BFF = userString.indexOf("BFF");
      IDK = userString.indexOf("IDK");
      JK = userString.indexOf("JK");
      TMI = userString.indexOf("TMI");
      TTYL = userString.indexOf("TTYL");
      
      if (BFF >= 0){
         System.out.println("BFF: best friend forever");
      }
      if (IDK>= 0){
         System.out.println("IDK: I don't know");
      }
      if (JK>= 0){
         System.out.println("JK: just kidding");
      }
      if (TMI>= 0){
         System.out.println("TMI: too much information");
      }
      if (TTYL>= 0){
         System.out.println("TTYL: talk to you later");
      }  
      
   }
}
