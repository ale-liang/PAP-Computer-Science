import java.util.*;
import static java.lang.System.*;

public class OddEvenLine
{
   private String line;

   private Scanner chop;
   
   
   public OddEvenLine() //constructor
   {
      line = "";
      
 
      
   }
   
   public OddEvenLine(String s) //constructor
   {
      line = s;
      Scanner chop = new Scanner(line);
   }
   
   public void setLine(String s)//mutator method
   {
      
      line = s;
      Scanner chop = new Scanner(line);
   }
   
  /*public void getOddEven()
   {
      Scanner chop = new Scanner(line);
      int number = 0;
      while(chop.hasNextInt())
      {
         number = chop.nextInt();
         if(chop.nextInt() % 2 == 0)
         {
            even = even + number + "";
            evenAmount ++;
         }
         
         if(chop.nextInt() % 2 != 0)
         {
            odd = odd + number + "";
            oddAmount ++;
         }
      }
      
 
   } */
   
   
   public String getOddString() //creates list of odd integers
   {
   
   String odd = "";
   int number =0;
   chop = new Scanner(line);
   while(chop.hasNext())
      {
      number= chop.nextInt();
      if(number % 2 != 0)
         {
         odd = odd + " " + number;
         }
      }
    return odd; 
    }
   
   public String getEvenString() //creates list of even integers
   {
   //Scanner chop = new Scanner(line);
   String even = "";
   int number= 0;
   chop = new Scanner(line);
      while(chop.hasNext())
      {
      number = chop.nextInt();
      if(number % 2 == 0)
         {
         even = even + " " + number; 
         }
      }
   return even; 
   }
   
   public int getOddAmount() //adds up total amount of odd integers
   {
  
   int oddAmount = 0;
   int number = 0;
   chop = new Scanner(line);
   while(chop.hasNext())
      {
      // number= chop.nextInt();
      if(chop.nextInt() % 2 != 0)
         {
         oddAmount ++;
         }
      } 
   return oddAmount; 
   }
   
   public int getEvenAmount() //adds up total amount of even integers
   {
   
   int evenAmount = 0;
   int number = 0;
   chop = new Scanner(line);
   while(chop.hasNext())
      {
       //number= chop.nextInt();
      if(chop.nextInt() % 2 == 0)
         {
         evenAmount ++;
         }
      } 
   return evenAmount; 
   }
   
   
  /* public String getLine()
   {
      return line;
   }
  
   public String toString() //prints out wanted result in formatted positioning
   {
      return "even count = " + getEvenAmount() + "\nodd count = " + getOddAmount() + "\nThe even numbers are " + getEvenString() + "\nThe odd numbers are " + getOddString() + "\n\n"; 
      //"even count = " + evenAmount + "\nodd count = " + oddAmount + "\nThe even numbers are " + even + "\nThe odd numbers are " + odd + "\n\n";
   }
   */
}