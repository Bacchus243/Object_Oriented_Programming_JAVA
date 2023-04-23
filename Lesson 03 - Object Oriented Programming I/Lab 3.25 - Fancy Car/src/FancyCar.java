public class FancyCar{

   // Declare private fields


/* Step 0. 

Declare private fields for miles driven as shown on the odometer (int), gallons of gas in 
tank (double), miles per gallon or MPG (double), driving capacity (double), and car model (String). 
Note the provided final variable indicates the gas tank capacity of 14.0 gallons.*/   
   
   private final int FULL_TANK = 14;
   
   private int milesDriven;
   private double gasInTank;
   private double mpg;
   private double drivingCapacity;
   private String carModel;
   
   private boolean carOn;



/* Step 1 (2 pts).

1) Complete the default constructor by initializing the odometer to five miles, 
   tank is full of gas, miles per gallon is 24.0, and the model is "Old Clunker". 

2) Complete the second constructor by passing the model (String) and miles per gallon (double), and 
   initializing all other private fields the same as the default constructor. 

3) Complete the accessor methods to check the odometer, check the gas guage, get the model, and get 
   the miles per gallon. Submit for grading to confirm 2 tests pass. */


   // Default constructor
   public FancyCar() {
      this.milesDriven = 5;
      this.gasInTank = this.FULL_TANK;
      this.mpg = 24.0;
      this.carModel = "Old Clunker";
      this.carOn = false;  
   }
   
   // Constructor (String make, double mpg)
   public FancyCar(String make, double mpg) {
      this.milesDriven = 5;
      this.gasInTank = this.FULL_TANK;
      this.mpg = mpg;
      this.carModel = make;
      this.carOn = false;
   }

   // Return car model
   public String getModel() {  
      return carModel;
   }
    
   // Return miles per gallon (MPG)      
    public double getMPG(){  
       return mpg;
    }
    
   // Return miles on odometer    
   public int checkOdometer() {
      return milesDriven;
   } 
         
   // Return amount of gas in tank
   public double checkGasGauge() {  
      return gasInTank;
   }   
   
   
/* Step 2 (1 pt).

Complete the honkHorn() method to output the car model. Calling the honkHorn() method uses the 
model private field to provide the following output:

         The Honda Civic says beep beep!
         
Submit for grading to confirm 3 tests pass.*/


   // Honk horn
   public void honkHorn() {
      System.out.println("The " + this.carModel + " says beep beep!");
   }
   
   
/* Step 3 (1 pt). 

Complete the drive() method. Miles driven should increase by parameter distance 
and amount of gas should decrease by distance / MPG. Variables are only updated if parameter 
distance is positive. Submit for grading to confirm 4 tests pass.*/




/* Step 5 (2 pts). 

Update the drive() method to identify if the car runs out of gas. If so, the parameter distance 
will not be achieved and the gas tank will have 0.0 gallons. 

Ex: drive(100) will not be possible with only three gallons of gas and MPG of 20.0. The maximum driving distance is 60 miles with 
three gallons of gas and MPG of 20.0. 

Therefore, the odometer will only increase by 60 instead of the requested 100 and the gas tank will 
have 0.0 gallons (not a negative amount). Submit for grading to confirm 6 tests pass.*/




   // Drive car requested miles but check for enough gas and check for positive value
   
   public void drive(int milesToDrive) {
      if(carOn == true) {
         if(milesToDrive > 0) {
            if(this.gasInTank * this.mpg >= milesToDrive) {
               this.milesDriven = this.milesDriven + milesToDrive;
               this.gasInTank = gasInTank - (milesToDrive / this.mpg);
            }
            else {
               this.milesDriven = this.milesDriven + (int) (this.gasInTank * this.mpg);
               this.gasInTank = 0.0;
               carOn = false;
            }
         }
      }
    }
 
 
 /* Step 4 (2 pts). 
 Complete the addGas() method. Increase gas tank by parameter amount only if parameter is positive. 
 Set gas tank to FULL if too much gas was added. Submit for grading to confirm 5 tests pass.
 */
 
   // Add gas to tank. Check for positive value.
   public void addGas(double amtToAdd) {
      if(carOn == false) {   
         if(amtToAdd > 0) {
            this.gasInTank = this.gasInTank + amtToAdd;
            if(this.gasInTank > 14.0) {
               this.gasInTank = 14.0;
            }
         }
      }
   }
    

/* Step 6 (2 pts). 

1) Add a boolean private field to indicate if the car engine is on or off. 
2) Complete the startEngine() method to set the boolean variable to true. 
3) Complete the stopEngine() method to set the boolean variable to false. 
4) Update the constructors to start with the engine off. 
5) Update the drive() method to only update private fields if the engine is on, and the 
      engine turns off if the car runs out of gas. 
6) Update the addGas() method to only 
      add gas if the engine is off. Submit for grading to confirm all tests pass.  */
      
      
   // Set boolean variable to true
    public void startEngine(){
       carOn = true;
    }
      
   // Set boolean variable to false  
   public void stopEngine(){
      carOn = false; 
   } 
    
}