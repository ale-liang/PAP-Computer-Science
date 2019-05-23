import java.math.*;
import java.util.*;  
public class Player
{
   private String weapon;
   
   public Player()
   {
   weapon = "";
   }
   
   public void chooseWeapon(int number)
   {
   //int number = (int) Math.random()*30;
   if (number >= 0 && number <= 10)
      { 
      weapon = "R";
     
      }
   else if(number > 10 && number <= 20) 
      {
      weapon = "S";
     
      }   
   else if (number >20 && number <= 30)
      {
      weapon = "P";
     
      }
 
   }

   public void chooseWeapon()
   {
   Scanner scan = new Scanner(System.in);  
   System.out.print("Rock-Paper-Scissors - pick your weapon[R, P, S]:: ");
   String input = scan.nextLine();   
   if (input.equals("S"))
      {
      weapon = "S";
      
      }
   else if (input.equals( "R"))
      {
      weapon = "R";
      
      }
   else if (input.equals("P"))
      {
      weapon = "P";
      
      }   

   }

   public String getWeapon()
   { return weapon; }
}