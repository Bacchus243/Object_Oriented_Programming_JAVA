import java.util.Scanner;

public class TryCatchExample2 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("What's your favorite number?");
		
		try {
			int n = scnr.nextInt();
			System.out.println(n);			
		}
		catch(Exception e) {
			System.out.println("Sorry, please enter a number");
		}
	}
}
