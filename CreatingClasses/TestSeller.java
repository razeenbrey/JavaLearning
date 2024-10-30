// Test Seller
// Name: Razeen
// Student Number: BRYRAZ002
// Date: 07/08/23

import java.util.Scanner;
public class TestSeller
{
   public static void main(String[] args)
   {
      Scanner cursor = new Scanner(System.in);                          // Create Scanner "cursor"
      Currency rand = new Currency("R", "ZAR", 100);                    // Create Currency Rand
      
      System.out.println("Please enter the details of the seller.");    // Take inputs
      System.out.print("ID: ");
      String inpID = cursor.nextLine();
      System.out.print("Name: ");
      String inpName = cursor.nextLine();
      System.out.print("Location: ");
      String inpLocation = cursor.nextLine();
      System.out.print("Product: ");
      String inpProduct = cursor.nextLine();
      System.out.print("Price: ");
      String inpPrice = cursor.nextLine();
      System.out.print("Units: ");
      int inpUnits = cursor.nextInt();
       
      cursor.close();                                                     // Close scanner object
      
      Seller shop = new Seller();                                         // Record inputs as Seller objects
      shop.ID = inpID;
      shop.Name = inpName;
      shop.Location = inpLocation;
      shop.Product = inpProduct;
      shop.unit_price = new Money (inpPrice, rand);
      shop.number_of_units = inpUnits;
      
      
      System.out.println("The seller has been successfully created:");     // Output
      System.out.println("ID of the seller: " + shop.ID);
      System.out.println("Name of the seller: " + shop.Name);
      System.out.println("Location of the seller: " + shop.Location);
      System.out.println("The product to sell: " + shop.Product);
      System.out.println("Product unit price: " + shop.unit_price);
      System.out.println("The number of available units: " + shop.number_of_units);
      
      
   }
}