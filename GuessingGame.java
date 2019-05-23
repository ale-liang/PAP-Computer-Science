import java.math.*;
import java.util.*;

public class GuessingGame
{
   private int numberCount, realNumber, input, wrongNumber;
   private double percentage;
   
   public GuessingGame()
   {
   numberCount = 0;
   input = 0;
   wrongNumber = 0;
   percentage = 0;
   realNumber = 0;
   }

   public void game()
   {
   Scanner kb = new Scanner(System.in);
   System.out.print("Guessing Game - How many numbers? ");
   numberCount = kb.nextInt(); 
   
   while(numberCount <=0)
      {
      System.out.print("Invalid number! Choose a number greater than 0. How many numbers? ");
      numberCount = kb.nextInt();
      }
   
   realNumber =(int) (Math.random() * numberCount);
   
   while(input != realNumber)
      {
      System.out.print("Enter a number between 1 and " + numberCount);
      input = kb.nextInt();
      
      if(input <= 0)
         {
         System.out.println("Number out of range!");
         }
      
      if(input!=realNumber)
         {
         wrongNumber = wrongNumber + 1;
         }
      }
      
   percentage = ((double)wrongNumber / numberCount * 100);   
      
   if(input == realNumber)
      {
      System.out.println("\n" + "It took " + wrongNumber + " guesses to get " + realNumber);
      System.out.println("You guessed wrong " + String.format("%.0f",percentage) + " percent of the time.");
      }
      
 
   }



}