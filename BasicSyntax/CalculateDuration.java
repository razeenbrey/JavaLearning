// Calculate Duration
// Name: Razeen
// Student Number: BRYRAZ002
// Date: 31/07/23

import java.util.Scanner;

public class CalculateDuration
{
   public static void main(String[] args)
   {
      Scanner getinp = new Scanner(System.in);           // defines scanner inp as getinp
      
      
      System.out.println("Enter time A:");               // prints prompt for time A
      String timeA = getinp.nextLine();                  // accepts inp and saves as timeA
      System.out.println("Enter time B:");               // prints prompt for time B
      String timeB = getinp.nextLine();                  // accepts inp and saves as timeB
      
      Time tA = new Time(timeA);                         // timeA converted to tA (clock)
      Time tB = new Time(timeB);                         // timeB converted to tB (clock)
      
      Duration ans = tB.subtract(tA);
      
      System.out.println("The time " + timeB + " occurs " + ans.intValue("minute") + " minutes after the time " + timeA + ".");
      
      
   }

}
