
public class Encyclopedia extends Book {
   /*Given main() and a base Book class, define a derived class called Encyclopedia with member methods 
   to get and set private fields of the following types:

      String to store the edition
      int to store the number of pages

   Within the derived Encyclopedia class, define a printInfo() method that overrides the Book class' printInfo() 
   method by printing the title, author, publisher, publication date, edition, and number of pages.*/
   
   // TODO: Declare private fields
   private String edition;
   private int numPages;
  
   
   // TODO: Define mutator methods - 
   //       setEdition(), setNumPages()
   
   public void setEdition(String edition) {
      this.edition = edition;
   }
   
   public void setNumPages(int numberPages) {
      this.numPages = numberPages;
   }
   
   
  
   // TODO: Define accessor methods -
   //       getEdition(), getNumPages()
   
   public String getEdition() {
      String outEdition = this.edition;
      return outEdition;
   }
   
   public int getNumPages() {
      int outPages = numPages;
      return outPages;
   }
   
   // TODO: Define a printInfo() method that overrides 
   //       the printInfo in Book class 
   
  
   public void printInfo() {
      super.printInfo();
      System.out.println("   Edition: " + this.edition);
      System.out.println("   Number of Pages: " + this.numPages);
   }
   
}

/* Within the derived Encyclopedia class, define a printInfo() method that overrides the Book class' printInfo() 
   method by printing the title, author, publisher, publication date, edition, and number of pages.*/