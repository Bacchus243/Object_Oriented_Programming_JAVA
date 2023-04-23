import java.util.Arrays;
import java.util.Scanner;
public class LabProgram {
   public static void main(String args[]) {
      Scanner scnr = new Scanner(System.in); 
      int nums[];
      int count;
      int i;
      boolean isPalindrome = true;
      
    
      // Step 0: Input array values
      count = scnr.nextInt();
      nums = new int[count];
      for (i = 0; i < count; ++i) {
         nums[i] = scnr.nextInt();
      }
      
      
      // Step 1: Find and output minimum and maximum values
      int min = nums[0];
      for (i = 1; i < nums.length; ++i) {
         if (min > nums[i]) {
            min = nums[i];
         }
      }
      
      int max = nums[0];
      for (i = 1; i < nums.length; ++i) {
         if (max < nums[i]) {
            max = nums[i];
         }
      }
      
      System.out.println("Minimum: " + min);
      System.out.println("Maximum: " + max);
      
      
      // Step 2: Calculate and output mean
      double average = 0;
      for (i = 0; i < nums.length; ++i) {
         average = average + nums[i];
      }
      
      average = average / nums.length;
      System.out.format("Mean: %.1f\n", average);
   
      // Step 3: Check if palindrome
      for (i = 0; i < nums.length; ++i) {
         if (nums[i] == nums[nums.length-1-i]) {
            isPalindrome = true;
         }
         else {
            isPalindrome = false;
         }
      }
      
      System.out.format("Palindrome: %b\n", isPalindrome);
            
      
      // Sort array elements in ascending order
      Arrays.sort(nums);
      
     
      
      // Step 4: Find and output median
      double middle = 0.0;
      
      if ((nums.length) % 2 == 0) {
         middle = nums[nums.length/2];
         middle = ((nums[nums.length/2]) + (nums[nums.length/2 - 1])) / 2.0;
      }
      else {
         middle = nums[nums.length/2];
      }
         
      System.out.println("Median: "+ middle);
   
      // Step 5: Find and output mode
      int mode = nums[0];
      int countA = 0;
      int countB = 0;
      
      if (nums[1] == nums[0]) {
         ++countB;
         countA = countB;
      }
      
      for (i = 2; i < nums.length; ++i) {
         if (nums[i] == nums[i-1]) {
            //System.out.println("B count: " + countB);
            //System.out.println("REPEAT NUMBER");
            ++countB;
            //System.out.println("New B count: " + countB);
         }
         else {
            if (countB > countA) {
               mode = nums[i];
               //System.out.println("Not a Repeat");
               countA = countB;
               //System.out.println("A count: " + countA);
               countB = 0;
            }
         }
      }
      
      System.out.println("Mode: " + mode);
            
      scnr.close();
    
   }
}

/* Step 5 (3 pts). Challenging! Identify the mode after the array is sorted in ascending order. The mode 
is the value that appears most frequently. Assume only one mode exists. Hint: Use a loop to process each 
array element, looking for the longest sequence of identical values. Submit for grading to confirm all 
tests pass.*/


/* Step 4 (1 pt). main() includes a call to Arrays.sort(), which sorts the array elements into ascending 
order. Do not sort the array before step 4. After sorting, identify the median. The median is located in 
the middle of the array if the array's length is odd. Otherwise, the median is the average of the middle 
two values. Output the median with one decimal place. Submit for grading to confirm four tests pass.*/



/*Step 3 (2 pts). Use a loop to determine if the array is a palindrome, meaning values are the same from 
front to back and back to front. Output "true" or "false". Submit for grading to confirm three tests pass.*/


/* Step 2 (2 pts). Use a loop to sum all array elements and calculate the mean (or average). Output the mean 
with one decimal place using System.out.printf("Mean: %.1f\n", mean);. Submit for grading to confirm two 
tests pass.*/


/*Step 1 (2 pts). Use a loop to process each array element and output the minimum and maximum values. 
Submit for grading to confirm one test passes.*/


/*Step 0. Review the starter code in main(). An array is filled with integers from standard input. 
The first value indicates how many numbers are to follow and be placed in the array.*/

