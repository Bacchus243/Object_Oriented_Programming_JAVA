import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      
      /* TODO: Declare any necessary variables here. */
      String lastName;
      String firstName;
      int midterm1score;
      int midterm2score;
      int finalScore;
      
      double mt1Sum = 0;
      double mt2Sum = 0;
      double finalSum = 0;
      char letterGrade;
      
      int studentCount = 0;
      
      double mt1Average;
      double mt2Average;
      double finalAverage;
   
      
      // Create Input and Output Streams
      Scanner inFS = null;
      String fileName;
      FileInputStream fileInStream = null;
      FileOutputStream fileOutStream = null;
      
      /* TODO: Read a file name from the user and read the tsv file here. */
      
         // use the scanner to get file name from user   
      fileName = "StudentInfo.tsv";
      
         
         // create the FileInputStream
      fileInStream = new FileInputStream(fileName);
      inFS = new Scanner(fileInStream);
      
         // create the FileOutputStream
      fileOutStream = new FileOutputStream("report.txt");
      PrintWriter outFS = new PrintWriter(fileOutStream);
      
      
      while (inFS.hasNext()) {
         studentCount++;
         
         lastName = inFS.next();
         firstName = inFS.next();
         
         
         midterm1score = inFS.nextInt();
         mt1Sum += midterm1score;
         
      
         midterm2score = inFS.nextInt();
         mt2Sum += midterm2score;
         

         finalScore = inFS.nextInt();
         finalSum += finalScore; 
         
         letterGrade = calcLetterGrade(midterm1score, midterm2score, finalScore);
         
         
         outFS.println(lastName + "\t" + firstName + "\t" + midterm1score + "\t" + midterm2score
                                           + "\t" + finalScore + "\t" + letterGrade);
         

      }
      
      
      /* TODO: Compute student grades and exam averages, then output results to a text file here. */
      mt1Average = mt1Sum / studentCount;
      mt2Average = mt2Sum / studentCount;
      finalAverage = finalSum / studentCount;
      

      
      outFS.printf("\nAverages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n", mt1Average, 
                                                                  mt2Average, finalAverage);
      outFS.close();
   }
   
   private static char calcLetterGrade(double val1, double val2, double val3) {
      char gradeLetter = 'o';
      double avg = (val1 + val2 + val3) / 3;
      
      if (avg < 60) {
         gradeLetter = 'F';
      }
      
      if (avg >= 60) {
         gradeLetter = 'D';
      }
      
      if (avg >= 70) {
         gradeLetter = 'C';
      }
      
      if (avg >= 80 ) {
         gradeLetter = 'B';
      }
      
      if (avg >= 90 ) {
         gradeLetter = 'A';
      }
      
      return gradeLetter;
   }
}




