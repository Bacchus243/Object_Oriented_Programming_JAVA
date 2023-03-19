import java.util.ArrayList; 

public class SimpleCar {

	@Override
	public String toString(){
		return "I drive fast";
	}
	public static void main(String[] args){
		ArrayList <Object> myStuff;
		myStuff = new ArrayList<Object>();
		myStuff.add(new String("Greetings"));
		myStuff.add(new Object());
		myStuff.add(new SimpleCar());
		for(Object item : myStuff){
			System.out.println(item.toString());
		}
	}
}