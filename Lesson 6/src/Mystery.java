import java.util.ArrayList;

public class Mystery {
	public static void mystery(ArrayList<Integer> nums, int target) {
		   int i;
		   for(i = 0; i < nums.size(); ++i) {
		      if(nums.get(i) == target) {
		         nums.remove(i);
		         i = 0;
		      }
		   }
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> myInts = new ArrayList<Integer>();
		myInts.add(1);
		myInts.add(2);
		myInts.add(2);
		myInts.add(3);
		myInts.add(4);
		myInts.add(5);
		myInts.add(2);
		
		for (int i = 0; i < myInts.size(); ++i) {
			System.out.println(myInts.get(i));
		}
		
		mystery(myInts, 2);
		
		for (int i = 0; i < myInts.size(); ++i) {
			System.out.println(myInts.get(i));
		}
	}
}
