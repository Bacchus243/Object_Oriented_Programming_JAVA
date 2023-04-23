import java.util.Scanner;

public class MileageTrackerLinkedList {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);

      // References for MileageTrackerNode objects
      MileageTrackerNode headNode;                                           
      MileageTrackerNode currNode;
      MileageTrackerNode lastNode;

      double miles;
      String date;
      int i;

      // Front of nodes list                                                                         
      headNode = new MileageTrackerNode();
      lastNode = headNode;

      // TODO: Scan the number of nodes
      i = scnr.nextInt();
         
      // TODO: For the scanned number of nodes, scan
      //       in data and insert into the linked list
      for (int j = 0; j < i; ++j) {
         miles = scnr.nextDouble();
         // System.out.println("Miles: " + miles);
         
         scnr.nextLine();
         date = scnr.nextLine();
         // System.out.println("Date: " + date);
         
         currNode = new MileageTrackerNode(miles, date);
         
         lastNode.insertAfter(currNode);
         
         lastNode = currNode;         
      }
      

      // TODO: Call the printNodeData() method 
      //       to print the entire linked list
      
      currNode = headNode.getNext();
      
      while (currNode != null) {
         currNode.printNodeData();
         currNode = currNode.getNext();
      }
            
   }
}