import java.util.Scanner;
import java.util.LinkedList;

public class ShoppingList {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);

      // TODO: Declare a LinkedList called shoppingList of type ListItem
      LinkedList <ListItem> shoppingList = new LinkedList <ListItem>();

      String item;
      
      // TODO: Scan inputs (items) and add them to the shoppingList LinkedList
      //       Read inputs until a -1 is input
      
      item = scnr.nextLine();
      
      while (!item.equals("-1")) {
         ListItem newItem = new ListItem(item);
         shoppingList.add(newItem);
         item = scnr.nextLine();
      }
     
      
      // TODO: Print the shoppingList LinkedList using the printNodeData() method
      ListItem currNode;
      
      for (int i = 0; i < shoppingList.size(); ++i) {
         currNode = shoppingList.get(i);
         currNode.printNodeData();
      }
    
   }
}
