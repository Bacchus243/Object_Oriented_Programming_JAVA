public class OfferedCourse extends Course {
   // TODO: Declare private fields
   private String instructorName;
   private String location;
   private String classTime;

   // TODO: Define mutator methods -
   //      setInstructorName(), setLocation(), setClassTime()
   public void setInstructorName(String name) {
      this.instructorName = name;
   }
   public void setLocation(String locale) {
      this.location = locale;
   }
   
   public void setClassTime(String time) {
      this.classTime = time;
   }


   // TODO: Define accessor methods -
   //      getInstructorName(), getLocation(), getClassTime()
   public String getInstructorName() {
      String nameBack = this.instructorName;
      return nameBack;
   }
   
   public String getLocation() {
      String physicalLocation = this.location;
      return physicalLocation;
   }
   
   public String getClassTime() {
      String times = this.classTime;
      return times;
   }

}

/* 
Then, define a derived class OfferedCourse with methods to set and get private fields of the following types:

String to store the instructor's name
String to store the location
String to store the class time
*/