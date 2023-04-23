import java.util.*;
public class LabProgram3 {

   // calcAverage() takes in an int array and returns the average value of elements in the array as a double.
   public static double calcAverage(int[] nums) {
      int i;
      double avg = 0;
      
      for(i=0; i<nums.length; i++) {
         avg += nums[i];
      }
      
      
      return avg/nums.length;
   }
   
   public static void main(String[] args) {
      int [] nums = {1,2,3,4,5};
      System.out.println(calcAverage(nums)); // calcAverage() should return 3.0.
   }
}