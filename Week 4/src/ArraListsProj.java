import java.util.ArrayList;

public class ArraListsProj {
	
	public static void main(String[] args) {
		
		String[] fruits = new String[3];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Strawberry";
		System.out.println(fruits[1]);
		
		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		
		fruitList.remove("Strawberry");
		System.out.println(fruitList.contains("cherry"));
		
		System.out.println(fruitList);
		
	}

}
