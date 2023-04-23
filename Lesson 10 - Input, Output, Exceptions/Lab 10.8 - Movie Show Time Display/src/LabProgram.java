import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      
      String fileName;
      FileInputStream fileInStream;
      Scanner inFS;
      
      String fullLine;
      String [] chunks;
      String time;
      String title;
      String rating;
      String tempTime;
      String tempTitle;
      String tempRating;
      
            
      
      // Capture file name
      fileName = scnr.nextLine();
      
      
      // Create filestream
      fileInStream = new FileInputStream(fileName);
      inFS = new Scanner(fileInStream);
      
      
      // Parse file
      
         // capture entire line
      fullLine = inFS.nextLine();
      //System.out.println(fullLine);
         
         // Split up the line by comma delimiter...
      chunks = fullLine.split(",");
      //System.out.println(Arrays.toString(chunks));
      
         // Assign first time variable, first movie name, first rating
      time = chunks[0];
      title = chunks[1];
      rating = chunks[2];
      //System.out.println(title + ", " + time + ", " + rating);
      
         
         
      // While Loop
      while (inFS.hasNextLine()) {
         fullLine = inFS.nextLine();
         //System.out.println(fullLine);
         
         chunks = fullLine.split(",");
         tempTime = chunks[0];
         tempTitle = chunks[1];
         tempRating = chunks[2];
         
         // Compare current title to previous title
            // if same title, append new time to time string
         if (tempTitle.equals(title)) {
            time = time + " " + tempTime;
         }
         
         // else, print out previous title, time, and rating strings. Then update variable.
         else {
            System.out.printf("%-44.44s | %5s | %s\n", title, rating, time);
            time = tempTime;
            title = tempTitle;
            rating = tempRating;
         }
      }
      // Print out last movie title, times, and rating
      System.out.printf("%-44.44s | %5s | %s\n", title, rating, time);
   }
}
