// Register
// A class to store all ticket objects for CarParkSim
// Name: Razeen
// Student Number: BRYRAZ002
// Date: 19/08/23

public class Register
{
   // declare instance variables
   private Ticket[] tickets;
   private int numTickets;
   
   // Define register object as a array of tickets
   public Register()
   {
      tickets = new Ticket[100];
      numTickets = 0;
   }
   
   // add tickets to Register
   public void add(Ticket ticket)
   {
      this.tickets[numTickets] = ticket;
      numTickets ++;
   }
   
   // loop through register and return true if ticket in register
   public boolean contains(String ticketID)
   {
      for (int x = 0; x < numTickets; x++)
      {
         if ( tickets[x].ID().equals(ticketID) )
         {
            return true;
         }
      }
      return false;
   }
  
   public Ticket retrieve(String ticketID)
   {
      for (int x = 0; x < numTickets; x++)
      {
         if ( tickets[x].ID().equals(ticketID) )
         {
            return tickets[x];
         }
      }
      return null;

   }
   
}