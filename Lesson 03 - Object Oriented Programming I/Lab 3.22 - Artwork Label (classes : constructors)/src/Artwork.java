public class Artwork {
   // TODO: Declare private fields - title, yearCreated
   private String title;
   private int yearCreated;
   
   // TODO: Declare private field artist of type Artist 
   Artist artist = new Artist();
   
   // TODO: Define default constructor
   public Artwork() {
      title = "unknown";
      yearCreated = -1;
   }

   // TODO: Define second constructor to initialize 
   //       private fields (title, yearCreated, artist)
   public Artwork(String title, int yearCreated, Artist artist) {
      this.title = title;
      this.yearCreated = yearCreated;
      this.artist = artist;
   }
   
   // TODO: Define get methods: getTitle(), getYearCreated()
   public String getTitle() {
      return title;
   }
   
   public int getYearCreated() {
      return yearCreated;
   }


   // TODO: Define printInfo() method
   //       Call the printInfo() method in Artist.java to print an artist's information                                                                                          
   public void printInfo() {
      artist.printInfo();
      System.out.println("Title: " + this.title + ", " + this.yearCreated);
   }


}

// The default constructor should initialize the title to "unknown", the year created to -1. printInfo() displays 
// an artist's information by calling the printInfo() method in Artist.java, followed by the artwork's title and 
// the year created. Declare a private field of type Artist in the Artwork class.