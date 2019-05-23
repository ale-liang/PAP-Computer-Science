import static java.lang.System.*;

public class AddStrings
{
   private String first, last;
   private String sum;

   public AddStrings()
   {
      first = "";
      last = "";
      sum = "";
   }

   public AddStrings(String one, String two)
   {
      first = one;
      last = two;
   }

   public void setStrings(String one, String two)
   {
      first = one;
      last = two;
   }

   public void add( )
   {
      sum = first + " " + last;
   }

   public String toString()
   {
 	String output="first :: " + first ;
   String output1="last :: " + last;
   String output2="sum :: " + sum;
 	return output + "\n" + output1 + "\n"  + output2 + "\n";

   }
}
