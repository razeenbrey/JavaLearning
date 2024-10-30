import java.io.File;
import java.io.FileNotFoundException;
//
import java.util.Scanner;
/**
 * See Assignment II Question II
 *
 * @author Stephan Jamieson
 * @version 26/7/2019
 */
public class MarketPlace 
{
    
    private MarketPlace() {}
    
    private final static Currency RAND = new Currency("R", "ZAR", 100);
    
    // Create an instance of Seller with attributes ID, name, location, product, 
    // unit_price and number_of_units
    private static Seller makeSeller(final String data) 
    {
        final Scanner scanner = new Scanner(data.trim());
        scanner.useDelimiter("\\s*,\\s*");
        
        // Add your code here
        
        String inpID = scanner.next();
        String inpName = scanner.next();
        String inpLocation = scanner.next();
        String inpProduct = scanner.next();
        String inpPrice = scanner.next();
        int inpUnits = scanner.nextInt();

        Seller seller = new Seller();
        
        seller.ID = inpID;
        seller.Name = inpName;
        seller.Location = inpLocation;
        seller.Product = inpProduct;
        seller.unit_price = new Money (inpPrice, RAND);
        seller.number_of_units = inpUnits;
        
        return seller;
     }
    
    // Read the contents of CSV file into an array.
    // See the Appendix on page 4 of the Assignment sheet.
    
    private static Seller[] parseFile(final String fileName) throws FileNotFoundException 
    {
        final Scanner inFile = new Scanner(new File(fileName));
        Seller[] sellers = null;
    
        if (inFile.hasNextLine()) 
        {
            sellers = new Seller[Integer.parseInt(inFile.nextLine().trim())];
            for (int index=0; index<sellers.length; index++) 
            
            {
                sellers[index] = makeSeller(inFile.nextLine());
            }
        }
        
        else
        {
           System.out.println("The file contains no seller data.");
           System.exit(0);
        }
        
        inFile.close();
        return sellers;
    }
    
    public static void main(final String[] args) throws FileNotFoundException 
    {
        final Scanner inKey = new Scanner(System.in);
        System.out.println("Enter the name of a \"Comma Separated Values\" (CSV) file:");
        final Seller[] sellers = parseFile(inKey.nextLine());
        
        // Your Code here
        
        if( (sellers!=null) && (sellers.length !=0) )
        {
            System.out.println("Enter the name of a product:");
            String prod = inKey.nextLine();
            System.out.println("Enter the number of units required:");
            int numb = inKey.nextInt();
            inKey.nextLine();
            System.out.println("Enter the maximum unit price:");
            Money price = new Money (inKey.nextLine(), RAND);
            
            int matches = 0;
            int x;
            
            // loop through sellers[]
            for (x =0; x<sellers.length; x++)
            {
               // if name
               if(sellers[x].Product.equals(prod))
               {
                  // if num units
                  if(sellers[x].number_of_units >= numb)
                  {  
                     // if price
                     if(sellers[x].unit_price.compareTo(price) <= 0)
                     {
                        System.out.println(sellers[x].ID + " : " + sellers[x].Name  + " in " 
                        + sellers[x].Location + " has " + sellers[x].number_of_units + " " +
                          sellers[x].Product +" for " + sellers[x].unit_price + " each." );
                        
                        matches ++;

                     }
                  } 
               }
               
            }
            
            // if no matches
            if (matches == 0)
            {
               System.out.println("None found.");
            }
        }
        
        
        
    }
}
