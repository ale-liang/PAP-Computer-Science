import static java.lang.System.*;
public class StarsAndStripes
{
public StarsAndStripes() //default constructor
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
      printASmallBox();
      printTwoBlankLines();
      printABigBox();
   }

   public void printTwentyStars()
   {
      out.println("********************");
   }

   public void printTwentyDashes()  
   {
      out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
      out.println();
      out.println();
   }
   
   public void printASmallBox()
   {
   	printTwentyDashes();
      printTwentyStars();
      printTwentyDashes();
      printTwentyStars();
      printTwentyDashes();
   }
 
   public void printABigBox()
   {
    	printTwentyDashes();
      printTwentyStars();
      printTwentyDashes();
      printTwentyStars();
      printTwentyDashes();
      printTwentyStars();
      printTwentyDashes();
   }   
}