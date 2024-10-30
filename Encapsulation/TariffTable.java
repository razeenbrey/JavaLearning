// TariffTable
// Name: Razeen
// Student Number: BRYRAZ002
// Date: 01/09/23

public class TariffTable
{
   private ParkingTariff[] tariffs;
   private int num;
   private int cursor;
   
   public TariffTable(int maxSize)
   {
      cursor = 0;
      maxSize = this.num;
      tariffs = new ParkingTariff[maxSize];
   }
   
   public void addTariff(TimePeriod period, Money tariff)
   {
  
         ParkingTariff pt = new ParkingTariff(period, tariff);
         this.tariffs[cursor] = pt;
   }
      
   
   
   public Money getTariff(Duration lengthOfStay)
   {
     return null;
      
   }
   
   
   public String toString()
   {
      String strOut = "";
      for (int x = 0; x< cursor ; x++)
      {
         strOut += tariffs[x].ptToString() + "\n";
      }
      return strOut;
   }
}