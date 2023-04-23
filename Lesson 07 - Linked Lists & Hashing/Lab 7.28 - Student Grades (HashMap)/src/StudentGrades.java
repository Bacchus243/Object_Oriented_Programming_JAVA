import java.util.Scanner;
import java.util.HashMap;

public class StudentGrades {
       
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      String studentName;
      double studentGrade;
      //double oldStudentGrade;
      
      HashMap<String, Double> studentGrades = new HashMap<String, Double>();
      
      // Students's grades (pre-entered)
      studentGrades.put("Harry Rawlins", 84.3);
      studentGrades.put("Stephanie Kong", 91.0);
      studentGrades.put("Shailen Tennyson", 78.6);
      studentGrades.put("Quincy Wraight", 65.4);
      studentGrades.put("Janine Antinori", 98.2);
      
      // TODO: Read in new grade for a student, output initial 
      //       grade, replace with new grade in HashMap,
      //       output new grade
      
      studentName = scnr.nextLine();
      studentGrade = studentGrades.get(studentName);
      System.out.println(studentName + "'s original grade: " + studentGrade);
      
      studentGrade = scnr.nextDouble();
      studentGrades.put(studentName, studentGrade);
      System.out.println(studentName + "'s new grade: " + studentGrade);
      
      
      
      
      
      
      /*studentName = scnr.next();
      studentGrade = scnr.nextDouble();
      
      oldStudentGrade = studentGrades.get(studentName);
      studentGrades.put(studentName, studentGrade);
      
      System.out.println(studentName + "'s original grade: " + oldStudentGrade);
      System.out.println(studentName + "'s new grade: " + studentGrade);
      */
   }
}
