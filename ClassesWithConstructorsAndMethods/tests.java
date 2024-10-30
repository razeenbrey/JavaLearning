public class tests
{
   public static void main(String[] args)
   {
      // Ticket tests
      Time tOne = new Time("6:50");
      Ticket ticket = new Ticket(tOne, "8005A3");
      Time tTwo = new Time("7:19");
      System.out.println(ticket.toString());
      Duration d = ticket.age(tTwo);
      System.out.println(d.intValue("minute"));
      System.out.println(ticket.ID());
      System.out.println("End of ticket testing");
      
      // Register tests
      Register r = new Register();
      Ticket t = new Ticket(new Time("13:00"), "00001");
      String ID_One = t.ID();
      r.add(t);
      t = new Ticket(new Time("13:18"), "00002");
      String ID_Two = t.ID();
      r.add(t);
      System.out.println(r.contains(ID_One));
      
      System.out.println(r.contains("9236743"));
      System.out.println(r.retrieve(ID_Two).toString());
      
   }
}