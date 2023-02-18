public class Boat extends Vehicle {
   private int numEngines;
   
   
   public Boat(int num) {
      numEngines = num;
   }
   
   public String toString() {
      return super.toString() + " " + numEngines; 
   }
 

	public static void main(String[] args) {
		
		Boat fastBoat = new Boat(2); 
		
		fastBoat.setName("Firebird"); 
		
		System.out.println(fastBoat);
	}
}