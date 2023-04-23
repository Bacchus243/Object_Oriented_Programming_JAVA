import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class BaggageWeight {
    public static void main(String args[]) throws FileNotFoundException {
    	FileInputStream fileByteStream = null;
    	Scanner inFS = null;
    	int val = 0;
    	fileByteStream = new FileInputStream("/Users/trenton/Library/Mobile Documents/com~apple~CloudDocs/Github/CSC205/Lesson10Quiz/src/data.txt");
    	inFS = new Scanner(fileByteStream);
    	val = inFS.nextInt();
    	System.out.println("Val:" + val);
    	inFS.close();
    }
}
