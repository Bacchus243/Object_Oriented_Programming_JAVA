import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int size;
      int i;
      
      size = scnr.nextInt();
      int[] listA = new int[size];   // List A
      int[] listB = new int[size];   // List B

      for (i = 0; i < size; ++i) {
         listA[i] = scnr.nextInt();
      }
      
      for (i = 0; i < size; ++i) {
         listB[i] = scnr.nextInt();
      }
      
      int sum = 0;
      
      for (i = 0; i < size; ++i) {
         sum = sum + (listA[i] * listB[i]);
      }
      
      System.out.println(sum);

      scnr.close();
   }
}