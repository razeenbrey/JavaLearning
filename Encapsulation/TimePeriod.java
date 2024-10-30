// TimePeriod
// Name: Razeen
// Student Number: BRYRAZ002
// Date: 01/09/23

/* A TimePeriod is a Duration range.
It has an inclusive lowerBound bound, l, and an exclusive upperBound bound, u.
A Duration, d, falls within the range if l<=d<u */

public class TimePeriod
{
   // Instance Variables
   private Duration lowerBound;
   private Duration upperBound;
   private String outstr;
   
   public TimePeriod(Duration lowerBoundBound, Duration upperBoundBound)
   {
      Duration D = new Duration("minutes", 60);
      this.lowerBound = lowerBoundBound;
      this.upperBound = upperBoundBound;
      if( upperBoundBound.compareTo(D)<0)
      {this.outstr = "[" + lowerBoundBound.format( lowerBoundBound, "minutes") + " .. " + upperBoundBound.format( upperBoundBound, "minutes") + "]"  ;}

      else if(upperBoundBound.compareTo(D) == 0)
      {this.outstr = "[" + lowerBoundBound.format( lowerBoundBound, "minutes") + " .. " + upperBoundBound.format( upperBoundBound, "hour") + "]"  ;}

      else
      {this.outstr = "[" + lowerBoundBound.format( lowerBoundBound, "hours") + " .. " + upperBoundBound.format( upperBoundBound, "hours") + "]"  ;}
   }
   
   public Duration lowerBoundBound()
   {
      return lowerBound;
   }

   public Duration upperBoundBound()
   {
      return upperBound;
   }

   // determine whether lowerBoundBound() <= duration < upperBoundBound()
   public boolean includes(Duration duration)
   {
      if (duration.compareTo(this.upperBoundBound())< 0)
      {
         if (this.lowerBoundBound().compareTo(duration)<= 0)
         {
            return true;
         }
      }
      return false;
   }

   // determine whether  this.upperBoundBound() <= other.lowerBoundBound()
   public boolean precedes(TimePeriod other)
   {
      if(this.upperBoundBound().compareTo(other.lowerBoundBound())<= 0)
      {return true;}
      return false;
   }

    //this.upperBoundBound() = other.lowerBoundBound(), || this.lowerBoundBound() = other.upperBoundBound()
   public boolean adjacent(TimePeriod other)
   {
      if (this.upperBoundBound().equals(other.lowerBoundBound()) || this.lowerBoundBound().equals(other.upperBoundBound())  )
      {return true;}
      return false;
   }

   public String toString()
   {
      return outstr;
   }
}