import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class someTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   
   // Store
   @Test public void test1()
   {
      Time t = new Time("12:00");
      Assert.assertEquals("12:00:00", t.toString());
   }

   // Subtract
   @Test public void test2()
   {
      Time a = new Time("00:00");
      Time b = new Time("01:00");
      Duration diff = b.subtract(a);
      Assert.assertEquals(1,diff.intValue("hour"));
   }

   // Self subtract
   @Test public void test3()
   {
      Time a = new Time("00:00");
      Time b = new Time("00:00");
      Duration diff = b.subtract(a);
      Assert.assertEquals(0,diff.intValue("hour"));
   }

   // millisecond
   @Test public void test4()
   {
      Time a = new Time("00:00");
      Time b = new Time("00:01");
      Duration diff = b.subtract(a);
      Assert.assertEquals(60000,diff.intValue("millisecond"));
   }

   // second
   @Test public void test5()
   {
      Time a = new Time("00:00");
      Time b = new Time("00:01");
      Duration diff = b.subtract(a);
      Assert.assertEquals(60,diff.intValue("second"));
   }

   // minute
   @Test public void test6()
   {
      Time a = new Time("00:00");
      Time b = new Time("00:01");
      Duration diff = b.subtract(a);
      Assert.assertEquals(1,diff.intValue("minute"));
   }

   // hour
   @Test public void test7()
   {
      Time a = new Time("00:00");
      Time b = new Time("01:00");
      Duration diff = b.subtract(a);
      Assert.assertEquals(1,diff.intValue("hour"));
   }   
   
}
