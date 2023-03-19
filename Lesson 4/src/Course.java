public class Course{
   // TODO: Declare private fields
   /*Given main(), define a Course base class with methods to set and get private fields of the following types:
   
   String to store the course number
   String to store the course title */
   
   private String courseNumber;
   private String courseTitle;


   // TODO: Define mutator methods - 
   //       setCourseNumber(), setCourseTitle()
   public void setCourseNumber(String courseNum) {
      this.courseNumber = courseNum;
   }
   
   public void setCourseTitle(String courseTitle) {
      this.courseTitle = courseTitle;
   }
   
   

   // TODO: Define accessor methods - 
   //       getCourseNumber(), getCourseTitle()
   public String getCourseNumber() {
      String courseNums = this.courseNumber;
      return courseNums;
   }
   
   public  String getCourseTitle() {
      String title = this.courseTitle;
      return title;
   }

   // TODO: Define printInfo()
   /*Define Course's PrintInfo() method that outputs the course number and title.*/
   public void printInfo() {
      System.out.println("Course Information:");
      System.out.println("   Course Number: " + this.courseNumber);
      System.out.println("   Course Title: " + this.courseTitle);
   }
 
}
