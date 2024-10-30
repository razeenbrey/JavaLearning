// ParkingTariff
// Name: Razeen
// Student Number: BRYRAZ002
// Date: 01/09/23

public class ParkingTariff
{

   private TimePeriod tp;
   private Money m;
   
   // Contsruct a ParkingTariff object containing a TimePeriod and Money object.
   public ParkingTariff(TimePeriod time, Money mon)
   {
      this.tp = time;
      this.m = mon;
   }
   
   // Determine whether TimePeriod follows after other.
   public boolean order(TimePeriod other)
   {
      if(other.precedes(this.tp))
      {
         if(this.tp.adjacent(other))
         {return true;}
      }
      return false;
   }
   
   // Return TimePeriod of ParkingTariff
   public TimePeriod getTimePeriod()
   {return tp;}
   
   // Return ParkingTarrif in the form -> [60..120 minutes] : R2.00
   public String ptToString()
   {
      String ptstr =  this.tp + " : " + this.m.toString();
      return ptstr;
   }
   
   
}