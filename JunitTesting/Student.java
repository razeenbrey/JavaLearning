// Student Class
// Name: Razeen
// Student Number: BRYRAZ002
// Date: 15/08/23

public class Student
{
// set instance variables for components
   private String firstName;
   private String middleName;
   private String lastName;
   // stores student firstname, middlename and lastname
   public void setNames(String f, String m, String l)
   {
      this.firstName = f;
      this.middleName = m;
      this.lastName = l;
   }
   // outputs student first, middle and last name with middle as initial
   public String getFullName()
   {
      return firstName + " " + middleName.charAt(0) + ". " + lastName;
   }

}