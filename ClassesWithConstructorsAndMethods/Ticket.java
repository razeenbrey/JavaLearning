// Ticket
// A class to create Ticket objects for CarParkSim
// Name: Razeen
// Student Number: BRYRAZ002
// Date: 19/08/23

public class Ticket
{
   // declare instance variables
   private String id;
   private Time issueTime;
   
   // create Ticket object in the form Ticket(Time currentTime, String stringId)
   public Ticket(Time currentTime, String ID)
   {
      this.id = ID;
      this.issueTime = currentTime;
   }
   
   // obtain id of ticket
   public String ID()
   {
      return id;
   }
   
   public Duration age(Time currentTime)
   {
      Duration tOut = currentTime.subtract(issueTime);
      return tOut;
   }
   
   public String toString()
   {
      String out = "Ticket[id=" + id + ", time=" + issueTime.toString() + "]";
      return out;
   }
   
}