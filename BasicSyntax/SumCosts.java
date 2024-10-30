// Sum Costs
// Name: Razeen
// Student Number: BRYRAZ002
// Date: 02/08/23

import java.util.Scanner;

public class SumCosts
{
   public static void main(String[] args)
   {
   
   Scanner cursor = new Scanner(System.in);                          // Create input "cursor"
   String inp = "";                                                  // Blank var for input
   Currency rand = new Currency("R", "ZAR", 100);                    // Set currency
   Money randTotal = new Money("R0", rand);                          // Set total
   
   System.out.println("Enter an amount or '[D]one' to print the sum and quit:");
   inp = cursor.nextLine();

   
   while ( inp.equals("D") == false || inp.equals("Done") == false)
   {
      if (inp.equals("D"))
      {
         break;
      } else if (inp.equals("Done"))
      {
         break;
      } else{
      
      Money randInp = new Money(inp, rand);
      randTotal = randTotal.add(randInp);
   
      System.out.println("Enter an amount or '[D]one' to print the sum and quit:");
      inp = cursor.nextLine();
      }
      
   }
   
   System.out.println("Total: " + randTotal.toString());
      
   }
}