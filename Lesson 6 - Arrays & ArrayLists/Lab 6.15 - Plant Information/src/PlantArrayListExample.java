import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects  
   public static void printArrayList(ArrayList<Plant> myGarden) {
      for (int i = 0; i < myGarden.size(); ++i) {
         System.out.println("Plant " + (i+1) + " Information: ");
         myGarden.get(i).printInfo();
         System.out.println("");
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input = "";
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      ArrayList <Plant> myGarden = new ArrayList<Plant>();

      // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual
      String plantName = "";
      String plantCost = "";
      String flowerName = "";
      String flowerCost = "";
      String colorOfFlowers = "";
      boolean isAnnual;
      
      Plant currPlant;
      Flower currFlower;
      
      if (scnr.hasNext()) {
         input = scnr.next();
         //System.out.println("Current Type:" + input);
      }
      
      while(!input.equals("-1")){
         // TODO: Check if input is a plant or flower
         if (input.equals("flower")) {
            //System.out.println("You are in the FLOWER world!");
            //System.out.println("Current :" + input);
            
            flowerName = scnr.next();
            //System.out.println("Current Flower Name:" + flowerName);
            
            flowerCost = scnr.next();
            //System.out.println("Current Flower Cost:" + flowerCost);
            
            isAnnual = scnr.nextBoolean();
            colorOfFlowers = scnr.next();
            //System.out.println("Current Flower Color:" + colorOfFlowers);
            
            currFlower = new Flower();
            
            currFlower.setPlantName(flowerName);
            currFlower.setPlantCost(flowerCost);
            currFlower.setPlantType(isAnnual);
            currFlower.setColorOfFlowers(colorOfFlowers);
            myGarden.add(currFlower);
         }
         
         else {
            //System.out.println("You are in the PLANT world!");
            plantName = scnr.next();
            //System.out.println("Current Plant Name:" + plantName);
            
            plantCost = scnr.next();
            //System.out.println("Current Plant Cost:" + plantCost);
            
            currPlant = new Plant();
            currPlant.setPlantName(plantName);
            currPlant.setPlantCost(plantCost);
            myGarden.add(currPlant);
         }
         input = scnr.next();
         //System.out.println("Current Type:" + input);
      }
      
      // TODO: Call the method printArrayList to print myGarden
      printArrayList(myGarden);
   }
}
