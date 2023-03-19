
public class Printer <T>{
	
	T thingToPrint;
	
	public Printer(T thingToPrint) {	
		this.thingToPrint = thingToPrint;
	}
	 
	public void print() {
		//thingToPrint.eat();
		System.out.println(thingToPrint);
	}
	
}
