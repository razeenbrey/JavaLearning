// Test Shopping Cart
// Name: Razeen
// Student Number: BRYRAZ002
// Date: 15/08/23

import java.util.Scanner;

public class TestShoppingCart
{
   public static void main(String[] args)
   {
      // Create Scanner
      Scanner cursor = new Scanner(System.in);
      System.out.println("How many items would you like to add to your Shopping Cart?:");
      int itemno = cursor.nextInt();
      
      // exit sequence for no items
      if (itemno == 0)
      {
         System.out.println("Your Shopping Cart is empty.");
         System.exit(0);
      }
      
      // if items
      else
      {
         // create shopping cart cart
         ShoppingCart cart = new ShoppingCart();
         // take inputs and convert to items for n items specified
         for (int i = itemno; i !=0; i--)
         {
            System.out.println("Enter the Product Name:");
            String p = cursor.next();
            
            System.out.println("Enter the Quantity:");
            int q = cursor.nextInt();
            
            System.out.println("Enter the Unit Cost:");
            double uc = cursor.nextDouble();
            // convert to item
            Item itemNew = new Item(p, q, uc);
            // add item
            cart.addItems(itemNew);

            
         }
         // load discount
         cart.getDiscount("WELCOME20");
         // print invoice
         System.out.println("The Shopping Cart has the following items:");
         cart.queryCart();
         System.out.println("--- Shopping Cart with all items ---");
         cart.printInvoice();
         
         
      }
      
      // close scanner
      cursor.close();
   }
}