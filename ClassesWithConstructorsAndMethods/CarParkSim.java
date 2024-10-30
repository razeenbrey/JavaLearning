import java.util.Scanner;
/**
 * The CarParkSim class contains the main car park simulation method.
 * It creates and manipulates the main objects, and handles user I/O.
 *
 * @author Stephan Jamieson and Razeen Brey (BRYRAZ002)
 * @version 14/7/2019
 */
public class CarParkSim {
        
    public static void main(final String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        // YOUR CODE HERE.
        // Declare variables to store a Clock and a Register object, create the relevant objects and assign them.
        
        Time t = new Time("00:00:00");
        Clock watch = new Clock(t);
        Register log = new Register();
        
        System.out.println("Car Park Simulator");
        // YOUR CODE HERE.
        // Print current time.
        
        //
        TariffTable tt = new TariffTable(10);
        
        TimePeriod pOne = new TimePeriod(new Duration("minutes", 0), new Duration("minutes", 30));
        TimePeriod pOne = new TimePeriod(new Duration("minutes", 30), new Duration("hour", 1));
        TimePeriod pOne = new TimePeriod(new Duration("hour", 1), new Duration("hour", 3));
        TimePeriod pOne = new TimePeriod(new Duration("hour", 3), new Duration("hour", 4));
        TimePeriod pOne = new TimePeriod(new Duration("hour", 4), new Duration("hour", 5));
        TimePeriod pOne = new TimePeriod(new Duration("hour", 5), new Duration("hour", 6));
        TimePeriod pOne = new TimePeriod(new Duration("hour", 6), new Duration("hour", 8));
        TimePeriod pOne = new TimePeriod(new Duration("hour", 8), new Duration("hour", 10));
        TimePeriod pOne = new TimePeriod(new Duration("hour", 1), new Duration("hour", 2));
        TimePeriod pOne = new TimePeriod(new Duration("hour", 1), new Duration("hour", 2));
        TimePeriod pOne = new TimePeriod(new Duration("hour", 1), new Duration("hour", 2));

        
        System.out.println("The current time is " + t.toString() + ".");
        
        System.out.println("Commands: tariffs, advance {minutes}, arrive, depart, quit.");
        System.out.print(">");
        String input = keyboard.next().toLowerCase();
        while (!input.equals("quit")) {
            if (input.equals("advance")) {
                // YOUR CODE HERE.
                // Advance the clock, print the current time.
                int min = keyboard.nextInt();
                Duration dur = new Duration("minute", min);
                watch.advance(dur);
                System.out.println("The current time is " + watch.examine().toString() + ".");
                
            }
            else if (input.equals("arrive")) {
                // YOUR CODE HERE.
                // Create a new ticket, add it to the register, print details of ticket issued.
                
                String UID_One = UIDGenerator.makeUID();
                Time arive = watch.examine();
                Ticket pTicket = new Ticket(arive, UID_One);
                log.add(pTicket);
                System.out.println("Ticket issued: " + pTicket.toString() + ".");
                
            }
            
            else if (input.equals("tariffs"))
            {
               
            }
            
            else if (input.equals("depart")) {
                // YOUR CODE HERE.
                // Determine if ticket is valid, i.e. in the register.
                // If not, print error message.
                // If yes, retreive it, calculate duration of stay and print it.
                String id = keyboard.next();
                if (log.contains(id))
                {
                  System.out.println("Ticket details: " + log.retrieve(id).toString() + "." );
                  System.out.println("Current time: " + watch.examine().toString() + ".");
                  long timeD = log.retrieve(id).age(watch.examine()).intValue("minute");
                  
                  if (timeD==1)
                  {
                     System.out.println("Duration of stay: " + timeD + " minute.");
                  }
                  else
                  {
                  
                     if (timeD>60)
                     {
                        long hours = timeD/60;
                        long minutes = timeD %60;
                        System.out.println("Duration of stay: "+ hours + " hours " + minutes + " minutes.");
                     }
                     else{System.out.println("Duration of stay: " + timeD + " minutes.");}
                  }
                  
                  
                }
                
                else{System.out.println("Invalid ticket ID.");}
                
            }
            else {
                System.out.println("That command is not recognised.");
                System.out.println("Commands: advance <minutes>, arrive, depart, quit.");
            }            
            System.out.print(">");
            input = keyboard.next().toLowerCase();
        }            
        System.out.println("Goodbye.");
    }

}
